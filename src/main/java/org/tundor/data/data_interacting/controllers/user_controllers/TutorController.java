package org.tundor.data.data_interacting.controllers.user_controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.data_interacting.controllers.BaseController;
import org.tundor.data.data_interacting.services.user_service.TutorService;
import org.tundor.data.models.user_roles.Tutor;

import java.util.UUID;

@RestController
@RequestMapping("/Tutor")
public class TutorController extends BaseController<Tutor, UUID> {

    public TutorController(TutorService service) {
       super(service);
    }



}
