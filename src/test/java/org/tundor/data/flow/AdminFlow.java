package org.tundor.data.flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.controllers.AdminController;
import org.tundor.data.models.user_roles.Admin;

import java.util.Optional;
import java.util.UUID;

public class AdminFlow {
    private final AdminController controller;
    public AdminFlow(ApplicationContext context){
        controller = context.getBean(AdminController.class);
    }

    public AdminFlow save(Admin admin) {
        controller.save(admin);
        return this;
    }

    public Optional<Admin> findById(UUID id) {
        return controller.findById(id);
    }

    public AdminFlow deleteById(Admin admin) {
        controller.deleteById(admin.getId());
        return this;
    }
}
