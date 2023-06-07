package org.tundor.data.factories.user_factories;

import org.tundor.data.factories.BaseFactory;
import org.tundor.data.models.user_roles.Student;
import org.tundor.data.models.utils.UserType;

public class StudentFactory extends BaseFactory {
    @Override
    public UserType setUserType() {
        return UserType.STUDENT;
    }

    public Student generateUser() {
        return new Student(getUserInfo(), 5);
    }

}
