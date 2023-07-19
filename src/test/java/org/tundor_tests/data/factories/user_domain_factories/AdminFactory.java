package org.tundor_tests.data.factories.user_domain_factories;

import org.domain.models.userRoles.Admin;
import org.tundor_tests.data.factories.BaseDomainFactory;

import java.util.UUID;

public class AdminFactory extends BaseDomainFactory {

    public Admin generateUser(UUID id){
        return Admin.builder()
                .info(getUserInfo())
                .id(id)
                .build();
    }
    //new Admin(getUserInfo(), id);
}
