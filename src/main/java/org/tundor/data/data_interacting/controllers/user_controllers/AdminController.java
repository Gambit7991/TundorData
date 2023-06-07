package org.tundor.data.data_interacting.controllers.user_controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.data_interacting.controllers.BaseController;
import org.tundor.data.data_interacting.services.user_service.AdminService;
import org.tundor.data.models.user_roles.Admin;

import java.util.UUID;

@RestController
@RequestMapping("/Admin")
public class AdminController extends BaseController<Admin, UUID> {

    public AdminController(AdminService service) {
        super(service);
    }

}
