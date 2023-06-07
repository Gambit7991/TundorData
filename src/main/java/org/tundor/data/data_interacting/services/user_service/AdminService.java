package org.tundor.data.data_interacting.services.user_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.services.BaseService;
import org.tundor.data.data_interacting.repositories.user_repositories.AdminRepository;
import org.tundor.data.models.user_roles.Admin;

import java.util.UUID;

@Service
public class AdminService implements BaseService<Admin, UUID> {
    private final AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository<Admin, UUID> getRepository() {
        return repository;
    }
}
