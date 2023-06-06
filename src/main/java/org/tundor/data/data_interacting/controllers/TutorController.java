package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.data.data_interacting.repositories.TutorRepository;
import org.tundor.data.models.user_roles.Tutor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Tutor")
public class TutorController {
    private final TutorRepository repository;

    public TutorController(TutorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Tutor> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tutor> findById(@PathVariable UUID id) {
        return repository.findById(id);
    }

    @PostMapping
    public Tutor save(@RequestBody Tutor tutor) {
        return repository.save(tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable UUID id) {
        repository.deleteById(id);
    }


}
