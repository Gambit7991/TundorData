package org.tundor.data.tests.student_tests;

import org.junit.jupiter.api.BeforeAll;
import org.tundor.data.factories.user_factories.StudentFactory;
import org.tundor.data.flow.user_flow.StudentFlow;
import org.tundor.data.tests.BaseTest;

public abstract class StudentBase extends BaseTest {
    public static StudentFactory factory;
    public static StudentFlow flow;

    @BeforeAll
    public static void init() {
        factory = new StudentFactory();
        flow = new StudentFlow(context);
    }
}
