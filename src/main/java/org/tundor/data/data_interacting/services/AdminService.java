package org.tundor.data.data_interacting.services;

import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.repositories.AdminRepository;
import org.tundor.data.models.user_roles.Admin;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AdminService {
    private final AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    public List<Admin> findAll() {
        return repository.findAll();
    }

    public Optional<Admin> findById(UUID id) {
        return repository.findById(id);
    }

    public Optional<Admin> save(Admin admin) {
        return Optional.of(repository.save(admin));
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
