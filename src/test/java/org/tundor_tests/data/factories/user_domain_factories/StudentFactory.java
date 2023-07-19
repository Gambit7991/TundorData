package org.tundor_tests.data.factories.user_domain_factories;

import org.domain.models.userRoles.Student;
import org.tundor_tests.data.factories.BaseDomainFactory;

import java.util.UUID;

public class StudentFactory extends BaseDomainFactory {

    public Student generateUser(UUID id) {
        return Student.builder()
                .info(getUserInfo())
                .id(id)
                .build();
    }

}
