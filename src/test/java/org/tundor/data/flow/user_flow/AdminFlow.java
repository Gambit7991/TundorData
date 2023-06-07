package org.tundor.data.flow.user_flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.controllers.user_controllers.AdminController;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.models.user_roles.Admin;

import java.util.UUID;

public class AdminFlow extends BaseFlow<Admin, UUID> {

    public AdminFlow(ApplicationContext context){
        super(AdminController.class, context);
    }

}
