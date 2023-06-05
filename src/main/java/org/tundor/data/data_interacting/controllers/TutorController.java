package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.*;
import org.tundor.data.data_interacting.services.TutorService;
import org.tundor.data.models.user_roles.Tutor;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Tutor")
public class TutorController {
    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    @GetMapping
    public List<Tutor> getAllUsers() {
        return tutorService.getAllTutors();
    }

    @GetMapping("/{id}")
    public Tutor getUserById(@PathVariable UUID id) {
        return tutorService.getTutorById(id);
    }

    @PostMapping
    public Tutor addUser(@RequestBody Tutor tutor) {
        return tutorService.saveUser(tutor);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        tutorService.deleteUser(id);
    }


}
