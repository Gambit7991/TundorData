package org.tundor_tests.data.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.tundor_tests.data.Runner;

@SpringBootTest
@Execution(ExecutionMode.CONCURRENT)
public abstract class BaseTest {

    public static ApplicationContext context;
    @BeforeAll
    public static void preSetup(){
        context = SpringApplication.run(Runner.class);
    }
}
