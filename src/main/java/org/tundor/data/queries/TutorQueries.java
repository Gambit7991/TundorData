package org.tundor.data.queries;

import org.springframework.context.ApplicationContext;
import org.tundor.data.data_interacting.repositories.TutorRep;
import org.tundor.data.models.user_roles.Tutor;

import java.util.Optional;
import java.util.UUID;


public class TutorQueries {
    private final TutorRep tutorRep;

    public TutorQueries(ApplicationContext context) {
        tutorRep = context.getBean(TutorRep.class);
    }

    public TutorQueries createTutor(Tutor tutor){
        tutorRep.save(tutor);
        return this;
    }

    public Optional<Tutor> readTutor(UUID id){
        return tutorRep.findById(id);
    }

    public void deleteTutor(Tutor tutor){

    }
}
