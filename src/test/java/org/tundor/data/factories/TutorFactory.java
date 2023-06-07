package org.tundor.data.factories;

import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.models.utils.UserType;

public class TutorFactory extends UserFactory{

    @Override
    public UserType setUserType() {
        return UserType.TUTOR;
    }

    public Tutor createTutor() {
        return Tutor.builder()
                .students(4)
                .userInfo(getUserInfo())
                .build();
    }
}
