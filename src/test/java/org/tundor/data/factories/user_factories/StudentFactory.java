package org.tundor.data.factories.user_factories;

import org.tundor.data.factories.BaseFactory;
import org.tundor.data.models.user_roles.Student;

public class StudentFactory extends BaseFactory {

    public Student generateStudent() {
        return new Student(getUserInfo(), 5);
    }

}
