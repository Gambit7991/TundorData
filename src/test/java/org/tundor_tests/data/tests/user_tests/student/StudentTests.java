package org.tundor_tests.data.tests.user_tests.student;

import org.domain.models.userRoles.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.data.mappers.StudentMapper;
import org.tundor_tests.data.factories.BaseFactoryDTO;
import org.tundor_tests.data.factories.user_DTO_factories.StudentFactoryDTO;
import org.tundor_tests.data.flow.BaseFlow;
import org.tundor_tests.data.flow.user_flow.StudentFlow;
import org.tundor_tests.data.tests.user_tests.UserTests;

import java.util.UUID;

public class StudentTests extends UserTests<StudentDTO> {

    private static StudentFlow flow;
    private static StudentFactoryDTO factory;

    @BeforeAll
    public static void init(){
        flow = new StudentFlow(context);
        factory = new StudentFactoryDTO();
    }


    @Override
    protected StudentDTO getUser() {
        return factory.generateUser();
    }

    @Override
    protected BaseFlow<StudentDTO, UUID> getFlow() {
        return flow;
    }

    @Override
    protected BaseFactoryDTO getFactory() {
        return factory;
    }

    @Test
    public void userToDomain(){
        Student student = StudentMapper.INSTANCE.toDomain(getUser());
        Assertions.assertNotNull(student);
    }
}
