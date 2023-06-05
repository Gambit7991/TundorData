package org.tundor.data.queries;

import org.tundor.data.data_interacting.repositories.TutorRepository;
import org.tundor.data.models.user_roles.Tutor;

import java.util.Optional;
import java.util.UUID;


public class TutorQueries {
    private final TutorRepository tutorRepository;

    public TutorQueries(TutorRepository repository) {
        tutorRepository = repository;
    }

    public TutorQueries createTutor(Tutor tutor){
        tutorRepository.save(tutor);
        return this;
    }

    public Optional<Tutor> readTutor(UUID id){
        return tutorRepository.findById(id);
    }

    public void deleteTutor(Tutor tutor){

    }
}
