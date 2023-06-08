package org.tundor.data.tests.user_tests;

import org.junit.jupiter.api.BeforeAll;
import org.tundor.data.factories.user_factories.AdminFactory;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.flow.user_flow.AdminFlow;
import org.tundor.data.models.user_roles.Admin;

import java.util.UUID;

public class AdminTests extends UserTests<Admin> {

    private static AdminFactory factory;
    private static AdminFlow flow;

    @BeforeAll
    public static void PreSetup(){
        factory = new AdminFactory();
        flow = new AdminFlow(context);
    }

    @Override
    public Admin createUser() {
        return factory.generateUser();
    }

    @Override
    public BaseFlow<Admin, UUID> getFlow() {
        return flow;
    }
}
