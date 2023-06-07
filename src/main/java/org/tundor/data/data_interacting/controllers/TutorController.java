package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.data.data_interacting.services.TutorService;
import org.tundor.data.models.user_roles.Tutor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Tutor")
public class TutorController {
    private final TutorService service;

    public TutorController(TutorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tutor> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tutor> findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public Optional<Tutor> save(@RequestBody Tutor tutor) {
        return service.save(tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }


}
