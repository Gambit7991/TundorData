package org.tundor.data.data_interacting.services.user_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.services.BaseService;
import org.tundor.data.data_interacting.repositories.user_repositories.TutorRepository;
import org.tundor.data.models.user_roles.Tutor;

import java.util.UUID;

@Service
public class TutorService implements BaseService<Tutor, UUID> {

    private final TutorRepository repository;

    public TutorService(TutorRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository<Tutor, UUID> getRepository() {
        return repository;
    }
}
