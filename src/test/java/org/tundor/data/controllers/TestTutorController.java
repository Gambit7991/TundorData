package org.tundor.data.controllers;

import org.tundor.data.data_interacting.controllers.TutorController;
import org.tundor.data.models.user_roles.Tutor;

import java.util.UUID;


public class TestTutorController {
    private final TutorController controller;

    public TestTutorController(TutorController controller) {
        this.controller = controller;
    }

    public TestTutorController save(Tutor tutor){
        controller.save(tutor);
        return this;
    }

    public Tutor findById(UUID id){
        return controller.findById(id);
    }

    public void deleteTutor(Tutor tutor){

    }
}
