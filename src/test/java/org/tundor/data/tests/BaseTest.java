package org.tundor.data.tests;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.transaction.annotation.Transactional;
import org.tundor.data.Runner;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class BaseTest {
    public static ApplicationContext context;

    @BeforeAll
    public static void preSetup(){
        context = SpringApplication.run(Runner.class);
    }


    @DynamicPropertySource
    static void setPort(DynamicPropertyRegistry registry) {
        // Set the port to 0 to let the operating system assign a random available port
        registry.add("server.port", () -> "0");
    }
}
