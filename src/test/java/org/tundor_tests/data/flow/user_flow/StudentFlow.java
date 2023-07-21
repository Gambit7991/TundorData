package org.tundor_tests.data.flow.user_flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.data.data_interacting.repositories.user_repositories.StudentRepository;
import org.tundor_tests.data.flow.BaseFlow;

import java.util.UUID;

public class StudentFlow extends BaseFlow<StudentDTO, UUID> {

    public StudentFlow(ApplicationContext context) {
        super(StudentRepository.class, context);
    }

}
