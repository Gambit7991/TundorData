package org.tundor.data.tests;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import org.tundor.data.Runner;

@Transactional
@SpringBootTest
public class BaseTest {
    public static ApplicationContext context;

    @BeforeAll
    public static void preSetup() {
        context = SpringApplication.run(Runner.class);
    }

}
