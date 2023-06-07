package org.tundor.data.flow;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.tundor.data.data_interacting.controllers.TutorController;
import org.tundor.data.models.user_roles.Tutor;

import java.util.Optional;
import java.util.UUID;

public class TutorFlow {
    private final TutorController controller;
    public TutorFlow(ApplicationContext context) {
        controller = context.getBean(TutorController.class);
    }

    public TutorFlow save(Tutor tutor) {
        controller.save(tutor);
        return this;
    }

    public Optional<Tutor> findById(UUID id) {
        return controller.findById(id);
    }

    public TutorFlow deleteTutor(Tutor tutor) {
        controller.deleteById(tutor.getId());
        return this;
    }
}
