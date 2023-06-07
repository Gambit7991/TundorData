package org.tundor.data.flow;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.controllers.StudentController;
import org.tundor.data.models.user_roles.Student;

import java.util.Optional;
import java.util.UUID;

public class StudentFlow {

    private final StudentController controller;
    public StudentFlow(ApplicationContext context){
        controller = context.getBean(StudentController.class);
    }

    public StudentFlow save(Student student) {
        controller.save(student);
        return this;
    }

    public Optional<Student> findById(UUID id) {
        return controller.findById(id);
    }

    public StudentFlow deleteById(Student student) {
        controller.deleteById(student.getId());
        return this;
    }



}
