package org.tundor.data.factories.user_factories;

import org.tundor.data.factories.BaseFactory;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.models.utils.UserType;

public class TutorFactory extends BaseFactory {

    @Override
    public UserType setUserType() {
        return UserType.TUTOR;
    }

    public Tutor createTutor() {
        return new Tutor(getUserInfo(), 4);

    }
}
