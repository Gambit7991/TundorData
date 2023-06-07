package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.data.data_interacting.services.StudentService;
import org.tundor.data.models.user_roles.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@RestController
@RequestMapping("/Student")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public Optional<Student> save(@RequestBody Student student) {
        return service.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }

}
