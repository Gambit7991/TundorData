package org.tundor_tests.data.flow.user_flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.repositories.user_repositories.AdminRepository;
import org.tundor.data.DTOs.user_roles.AdminDTO;
import org.tundor_tests.data.flow.BaseFlow;

import java.util.UUID;

public class AdminFlow extends BaseFlow<AdminDTO, UUID> {

    public AdminFlow(ApplicationContext context) {
        super(AdminRepository.class, context);
    }


}
