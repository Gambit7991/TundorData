package org.tundor.data.factories.user_factories;

import org.tundor.data.factories.BaseFactory;
import org.tundor.data.models.user_roles.Tutor;

public class TutorFactory extends BaseFactory {

    public Tutor generateTutor() {
        return new Tutor(getUserInfo(), 4);
    }
}
