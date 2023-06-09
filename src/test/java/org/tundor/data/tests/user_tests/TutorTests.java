package org.tundor.data.tests.user_tests;

import org.junit.jupiter.api.BeforeAll;
import org.tundor.data.factories.BaseFactory;
import org.tundor.data.factories.user_factories.TutorFactory;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.flow.user_flow.TutorFlow;
import org.tundor.data.models.user_roles.Tutor;

import java.util.UUID;

public class TutorTests extends UserTests<Tutor> {
    private static TutorFactory factory;
    private static TutorFlow flow;

    @BeforeAll
    public static void init() {
        factory = new TutorFactory();
        flow = new TutorFlow(context);
    }

    @Override
    public BaseFlow<Tutor, UUID> flow() {
        return flow;
    }

    @Override
    protected BaseFactory factory() {
        return factory;
    }

    @Override
    public Tutor createUser() {
        return factory.generateTutor();
    }

}
