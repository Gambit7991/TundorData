package org.tundor.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.tundor.data.data_interacting.repositories")
public class TundorDataApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TundorDataApplication.class);

    }


}
