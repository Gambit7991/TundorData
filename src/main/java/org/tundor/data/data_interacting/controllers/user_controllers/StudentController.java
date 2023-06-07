package org.tundor.data.data_interacting.controllers.user_controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.data_interacting.controllers.BaseController;
import org.tundor.data.data_interacting.services.user_service.StudentService;
import org.tundor.data.models.user_roles.Student;

import java.util.UUID;
@RestController
@RequestMapping("/Student")
public class StudentController extends BaseController<Student, UUID> {

    public StudentController(StudentService service) {
        super(service);
    }

}
