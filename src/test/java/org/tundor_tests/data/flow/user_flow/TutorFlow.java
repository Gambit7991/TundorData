package org.tundor_tests.data.flow.user_flow;

import org.domain.models.Account;
import org.springframework.context.ApplicationContext;
import org.tundor.data.DTOs.user_roles.TutorDTO;
import org.tundor.data.data_interacting.repositories.user_repositories.TutorRepository;
import org.tundor_tests.data.flow.BaseFlow;

import java.util.Optional;
import java.util.UUID;

public class TutorFlow extends BaseFlow<TutorDTO, UUID> {
    public TutorFlow(ApplicationContext context) {
        super(TutorRepository.class, context);
    }

    public Optional<Account> findByIdDomainModule(UUID id) {
        return Optional.of(repository.getDomainModel(repository.findById(id).orElse(null)));
    }


}
