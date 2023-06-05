package org.tundor.data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.tundor.data.controllers.TestTutorController;
import org.tundor.data.data_interacting.controllers.TutorController;
import org.tundor.data.factories.UserFactory;
import org.tundor.data.models.user_roles.Tutor;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TutorTests implements AutoCloseable{
    private UserFactory userFactory;
    private Tutor tutor;
    @Mock
    private TutorController controller;
    @InjectMocks
    private TestTutorController tutorController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        userFactory = new UserFactory();
        tutor = userFactory.createTutor();
        when(tutorController.save(tutor).findById(tutor.getId())).thenReturn(tutor);
    }

    @AfterEach
    public void cleanup() {
    }

    @Test
    void createTutorPositive() {
        Assertions.assertEquals(tutorController.save(tutor).findById(tutor.getId()),
                tutor);
    }

    @Override
    public void close()  {

    }


}
