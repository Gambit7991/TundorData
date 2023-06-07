package org.tundor.data.data_interacting.services.user_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.services.BaseService;
import org.tundor.data.data_interacting.repositories.user_repositories.StudentRepository;
import org.tundor.data.models.user_roles.Student;

import java.util.UUID;

@Service
public class StudentService implements BaseService<Student, UUID> {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public JpaRepository<Student, UUID> getRepository() {
        return repository;
    }

}
