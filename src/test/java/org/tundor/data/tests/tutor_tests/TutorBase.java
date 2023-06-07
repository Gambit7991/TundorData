package org.tundor.data.tests.tutor_tests;

import org.junit.jupiter.api.BeforeAll;
import org.tundor.data.factories.user_factories.TutorFactory;
import org.tundor.data.flow.user_flow.TutorFlow;
import org.tundor.data.tests.BaseTest;

public abstract class TutorBase extends BaseTest {
    public static TutorFactory factory;
    public static TutorFlow flow;

    @BeforeAll
    public static void init() {
        factory = new TutorFactory();
        flow = new TutorFlow(context);
    }
}
