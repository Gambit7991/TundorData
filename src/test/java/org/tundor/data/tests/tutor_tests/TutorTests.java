package org.tundor.data.tests.tutor_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tundor.data.models.user_roles.Tutor;

import static org.junit.jupiter.api.Assertions.*;


public class TutorTests extends TutorBase {
    private Tutor tutor;

    @BeforeEach
    public void setup() {
        tutor = factory.createTutor();
    }

    @Test
    void createTutorTest() {
        assertTrue(flow.save(tutor)
                        .findById(tutor.getId()).isPresent());
    }

    @Test
    void deleteTutorTest() {
        assertAll(
                () -> assertTrue(flow.save(tutor).findById(tutor.getId()).isPresent()),
                () -> assertNull(flow.deleteById(tutor.getId()).findById(tutor.getId()).orElse(null))
        );
    }

}
