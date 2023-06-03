package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.data_interacting.services.TutorService;

import java.util.List;

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

    public Tutor getUserById(int id){
        return tutorService.getTutorById(id);
    }

    public Tutor saveUser(Tutor tutor){
        return tutorService.saveUser(tutor);
    }

    public void deleteUser(int id){
        tutorService.deleteUser(id);
    }

}
