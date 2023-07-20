package org.tundor_tests.data.flow.user_flow;

import org.domain.models.Account;
import org.springframework.context.ApplicationContext;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.data.data_interacting.repositories.user_repositories.StudentRepository;
import org.tundor_tests.data.flow.BaseFlow;

import java.util.Optional;
import java.util.UUID;

public class StudentFlow extends BaseFlow<StudentDTO, UUID> {

    public StudentFlow(ApplicationContext context) {
        super(StudentRepository.class, context);
    }

    public Optional<Account> findByIdDomainModel(UUID id) {
        return Optional.of(repository.getDomainModel(repository.findById(id).orElse(null)));
    }
}
