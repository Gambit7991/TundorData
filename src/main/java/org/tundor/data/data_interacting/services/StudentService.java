package org.tundor.data.data_interacting.services;

import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.repositories.StudentRepository;
import org.tundor.data.models.user_roles.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Optional<Student> findById(UUID id) {
        return repository.findById(id);
    }

    public Optional<Student> save(Student tutor) {
        return Optional.of(repository.save(tutor));
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
