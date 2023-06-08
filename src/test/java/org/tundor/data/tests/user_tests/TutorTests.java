package org.tundor.data.tests.user_tests;

import org.junit.jupiter.api.BeforeAll;
import org.tundor.data.factories.user_factories.TutorFactory;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.flow.user_flow.TutorFlow;
import org.tundor.data.models.user_roles.Tutor;

import java.util.UUID;

public class TutorTests extends UserTests<Tutor> {
    public static TutorFactory factory;
    public static TutorFlow flow;

    @BeforeAll
    public static void init() {
        factory = new TutorFactory();
        flow = new TutorFlow(context);
    }

    public BaseFlow<Tutor, UUID> getFlow() {
        return flow;
    }

    public Tutor createUser() {
        return factory.generateTutor();
    }

}
