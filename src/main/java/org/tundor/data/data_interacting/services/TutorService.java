package org.tundor.data.data_interacting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.data_interacting.repositories.TutorRep;

import java.util.List;
import java.util.UUID;

@Service
public class TutorService {

    private final TutorRep tutorRep;

    @Autowired
    public TutorService(TutorRep tutorRep) {
        this.tutorRep = tutorRep;
    }

    public List<Tutor> getAllUsers() {
        return tutorRep.findAll();
    }

    public Tutor getTutorById(UUID id) {
        return tutorRep.findById(id).orElse(null);
    }

    public Tutor saveUser(Tutor tutor) {
        return tutorRep.save(tutor);
    }

    public void deleteUser(UUID id) {
        tutorRep.deleteById(id);
    }
}
