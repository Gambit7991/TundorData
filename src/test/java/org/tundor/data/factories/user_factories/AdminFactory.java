package org.tundor.data.factories.user_factories;

import org.tundor.data.factories.BaseFactory;
import org.tundor.data.models.user_roles.Admin;

public class AdminFactory extends BaseFactory {

    public Admin generateUser(){
        return new Admin(getUserInfo());
    }
}
