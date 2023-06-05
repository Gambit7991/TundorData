package org.tundor.data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.tundor.data.factories.UserFactory;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.queries.TutorQueries;

import java.sql.SQLException;

@SpringBootTest
@EnableJpaRepositories(basePackages = "src/main/java/org/tundor/data/data_interacting/repositories")
class TundorDataApplicationTests {
    private UserFactory userFactory;
    private TutorQueries tutorQueries;
    private Tutor tutor;

    @BeforeEach
    public void setup() {
        ApplicationContext context = SpringApplication.run(TundorDataApplication.class);
        userFactory = new UserFactory();
        tutorQueries = new TutorQueries(context);
        tutor = userFactory.createTutor();
    }

    @AfterEach
    public void cleanup() throws SQLException {
    }

    @Test
    void createTutorPositive() {
        Assertions.assertTrue(
                tutorQueries.createTutor(tutor)
                        .readTutor(tutor.getId()).isPresent());
    }

//    @Test
//    void deleteTutorPositive() {
//        Assertions.assertTrue(
//                tutorQueries.createTutor(tutor)
//                        .readTutor(tutor.getId()).isPresent());
//    }

}
