package org.tundor.data.tests.student_tests;

import org.junit.jupiter.api.*;
import org.tundor.data.models.user_roles.Student;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTests extends StudentBase {
    private Student student;

    @BeforeEach
    public void setup() {
        student = factory.generateUser();
    }

    @Test
    void createTutorTest() {
        assertTrue(flow.save(student)
                .findById(student.getId()).isPresent());
    }

    @Test
    void deleteTutorTest() {
        assertAll(
                () -> assertTrue(flow.save(student).findById(student.getId()).isPresent()),
                () -> assertNull(flow.deleteById(student).findById(student.getId()).orElse(null))
        );
    }


}
