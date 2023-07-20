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

import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    @Override
    protected String getClassType() {
        return Admin.class.getTypeName();
    }


    @Test
    public void userToDomain(){
        Admin admin = AdminMapper.INSTANCE.toDomain(getUser());
        Assertions.assertNotNull(admin);
    }

    @Test
    public void userToDTO() {
        getFlow().save(user);
        Admin us = (Admin) flow.findByIdDomainModel(user.getId()).orElse(null);
        System.out.println(us);
//        TutorDTO tutorDTO = TutorDTO.builder().build();
//        AdminDTO adminDTO = AdminDTO
        AdminDTO fin = AdminMapper.INSTANCE.toDTO(us);
        System.out.println(fin);
        assertNotNull(fin);
    }
}
