package org.tundor.data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.tundor.data.data_interacting.repositories.TutorRepository;
import org.tundor.data.factories.UserFactory;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.queries.TutorQueries;

import java.util.Optional;

import static org.mockito.Mockito.when;

class TutorTests implements AutoCloseable{
    @Mock
    private TutorRepository tutorRep;
    private UserFactory userFactory;
    private TutorQueries tutorQueries;
    private Tutor tutor;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        userFactory = new UserFactory();
        tutorQueries = new TutorQueries(tutorRep);
        tutor = userFactory.createTutor();
    }

    @AfterEach
    public void cleanup() {
    }

    @Test
    void createTutorPositive() {
        when(tutorQueries.createTutor(tutor).readTutor(tutor.getId())).thenReturn(Optional.of(tutor));
        Assertions.assertEquals(tutorQueries.createTutor(tutor).readTutor(tutor.getId()).orElse(null),
                tutor);
    }

    @Override
    public void close() throws Exception {

    }


}
