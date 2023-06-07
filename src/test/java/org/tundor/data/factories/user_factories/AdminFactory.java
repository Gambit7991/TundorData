package org.tundor.data.factories.user_factories;

import org.tundor.data.factories.BaseFactory;
import org.tundor.data.models.user_roles.Admin;
import org.tundor.data.models.utils.UserType;

public class AdminFactory extends BaseFactory {

    @Override
    public UserType setUserType() {
        return UserType.ADMIN;
    }

    public Admin generateUser(){
        return new Admin(getUserInfo());
    }
}
