package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.data_interacting.services.TutorService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Tutor")
public class TutorController {
    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    public List<Tutor> getAllUsers() {
        return tutorService.getAllUsers();
    }

    public Tutor getUserById(UUID id){
        return tutorService.getTutorById(id);
    }

    public Tutor addUser(Tutor tutor){
        return tutorService.saveUser(tutor);
    }

    public void deleteUser(UUID id){
        tutorService.deleteUser(id);
    }



}
