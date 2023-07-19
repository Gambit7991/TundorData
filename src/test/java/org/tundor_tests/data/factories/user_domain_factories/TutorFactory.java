package org.tundor_tests.data.factories.user_domain_factories;

import org.domain.models.userRoles.Tutor;
import org.tundor_tests.data.factories.BaseDomainFactory;

import java.util.UUID;

public class TutorFactory extends BaseDomainFactory {

    public Tutor generateUser(UUID id) {
        return Tutor.builder().id(id).info(getUserInfo()).build();
    }
}
