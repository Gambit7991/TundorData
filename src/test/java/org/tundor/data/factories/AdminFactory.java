package org.tundor.data.factories;

import org.tundor.data.models.user_roles.Admin;
import org.tundor.data.models.utils.UserType;

public class AdminFactory extends UserFactory{

    @Override
    UserType setUserType() {
        return UserType.ADMIN;
    }

    public Admin generateUser(){
        return Admin.builder().userInfo(getUserInfo()).build();
    }
}
