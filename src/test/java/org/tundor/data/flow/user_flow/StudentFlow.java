package org.tundor.data.flow.user_flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.controllers.user_controllers.StudentController;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.models.user_roles.Student;

import java.util.UUID;

public class StudentFlow extends BaseFlow<Student, UUID> {

    public StudentFlow(ApplicationContext context) {
        super(StudentController.class, context);
    }

}
