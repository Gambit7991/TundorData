package org.tundor_tests.data.tests.user_tests.admin;

import org.domain.models.userRoles.Admin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.tundor.data.DTOs.user_roles.AdminDTO;
import org.tundor.data.mappers.AdminMapper;
import org.tundor_tests.data.factories.BaseFactoryDTO;
import org.tundor_tests.data.factories.user_DTO_factories.AdminFactoryDTO;
import org.tundor_tests.data.flow.BaseFlow;
import org.tundor_tests.data.flow.user_flow.AdminFlow;
import org.tundor_tests.data.tests.user_tests.UserTests;

import java.util.UUID;

public class AdminTests extends UserTests<AdminDTO> {

    public static AdminFactoryDTO factory;
    public static AdminFlow flow;

    @BeforeAll
    public static void init(){
        factory = new AdminFactoryDTO();
        flow = new AdminFlow(context);
    }


    @Override
    protected AdminDTO getUser() {
        return factory.generateUser();
    }

    @Override
    protected BaseFlow<AdminDTO, UUID> getFlow() {
        return flow;
    }

    @Override
    protected BaseFactoryDTO getFactory() {
        return factory;
    }

    @Test
    public void userToDomain(){
        Admin admin = AdminMapper.INSTANCE.toDomain(getUser());
        Assertions.assertNotNull(admin);
    }
}
