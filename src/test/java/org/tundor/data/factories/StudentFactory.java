package org.tundor.data.factories;

import org.tundor.data.models.user_roles.Student;
import org.tundor.data.models.utils.UserType;

public class StudentFactory extends UserFactory{
    public Student generateUser() {
        return Student.builder()
                .tutors(4)
                .userInfo(getUserInfo())
                .build();
    }


    @Override
    UserType setUserType() {
        return UserType.STUDENT;
    }
}
