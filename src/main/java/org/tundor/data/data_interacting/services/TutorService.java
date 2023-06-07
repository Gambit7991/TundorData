package org.tundor.data.data_interacting.services;

import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.repositories.TutorRepository;
import org.tundor.data.models.user_roles.Tutor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TutorService {

    private final TutorRepository repository;

    public TutorService(TutorRepository repository) {
        this.repository = repository;
    }

    public List<Tutor> findAll() {
        return repository.findAll();
    }

    public Optional<Tutor> findById(UUID id) {
        return repository.findById(id);
    }

    public Optional<Tutor> save(Tutor tutor) {
        return Optional.of(repository.save(tutor));
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
