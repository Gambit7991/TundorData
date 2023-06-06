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
import org.tundor.data.controllers.TutorQueries;
import org.tundor.data.data_interacting.services.TutorService;
import org.tundor.data.factories.UserFactory;
import org.tundor.data.models.user_roles.Tutor;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TutorTests {
    private final UserFactory userFactory = new UserFactory();
    private Tutor tutor;
    @Mock
    private TutorService service;
    @InjectMocks
    private TutorQueries tutorQueries;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        tutor = userFactory.createTutor();
    }

    @AfterEach
    public void cleanup() {
    }

    @Test
    void createTutor() {
        Assertions.assertEquals(tutor,
                getSaveLogic().save(tutor).findById(tutor.getId()));
    }

    @Test
    void deleteTutor() {
        Assertions.assertNull(getDeleteLogic()
                .save(tutor)
                .deleteTutor(tutor)
                .findById(tutor.getId()));
    }

    private TutorQueries getSaveLogic() {
        when(tutorQueries.save(tutor).findById(tutor.getId())).thenReturn(tutor);
        return tutorQueries;
    }

    private TutorQueries getDeleteLogic() {
        when(tutorQueries.deleteTutor(tutor).findById(tutor.getId())).thenReturn(null);
        return tutorQueries;
    }

}
