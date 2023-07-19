package org.tundor_tests.data;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "org.tundor.data.DTOs")
@EnableJpaRepositories(basePackages = "org.tundor.data.data_interacting.repositories")
public class Runner {

}
