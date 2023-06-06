package org.tundor.data.controllers;

import org.tundor.data.data_interacting.controllers.TutorController;
import org.tundor.data.models.user_roles.Tutor;

import java.util.Optional;
import java.util.UUID;


public class TutorQueries {
    private final TutorController controller;

    public TutorQueries(TutorController controller) {
        this.controller = controller;
    }

    public TutorQueries save(Tutor tutor) {
        controller.save(tutor);
        return this;
    }

    public Optional<Tutor> findById(UUID id) {
        return controller.findById(id);
    }

    public TutorQueries deleteTutor(Tutor tutor) {
        controller.deleteByID(tutor.getId());
        return this;
    }
}
