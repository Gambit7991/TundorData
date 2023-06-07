package org.tundor.data.tests.admin_tests;

import org.junit.jupiter.api.BeforeAll;
import org.tundor.data.factories.AdminFactory;
import org.tundor.data.flow.AdminFlow;
import org.tundor.data.tests.BaseTest;

public abstract class AdminBase extends BaseTest {
    public static AdminFactory factory;
    public static AdminFlow flow;

    @BeforeAll
    public static void init() {
        factory = new AdminFactory();
        flow = new AdminFlow(context);
    }
}
