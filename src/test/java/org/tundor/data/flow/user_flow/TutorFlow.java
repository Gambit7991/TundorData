package org.tundor.data.flow.user_flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.controllers.user_controllers.TutorController;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.models.user_roles.Tutor;

import java.util.UUID;

public class TutorFlow extends BaseFlow<Tutor, UUID> {
    public TutorFlow(ApplicationContext context) {
        super(TutorController.class, context);
    }

}
