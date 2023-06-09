package org.tundor.data.tests.user_tests;

import org.junit.jupiter.api.BeforeAll;
import org.tundor.data.factories.BaseFactory;
import org.tundor.data.factories.user_factories.StudentFactory;
import org.tundor.data.flow.BaseFlow;
import org.tundor.data.flow.user_flow.StudentFlow;
import org.tundor.data.models.user_roles.Student;

import java.util.UUID;

public class StudentTests extends UserTests<Student> {
    public static StudentFactory factory;
    public static StudentFlow flow;

    @BeforeAll
    public static void init() {
        factory = new StudentFactory();
        flow = new StudentFlow(context);
    }

    @Override
    public Student createUser() {
        return factory.generateStudent();
    }

    @Override
    public BaseFlow<Student, UUID> flow() {
        return flow;
    }

    @Override
    protected BaseFactory factory() {
        return factory;
    }
}
