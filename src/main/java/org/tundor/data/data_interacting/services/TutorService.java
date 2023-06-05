package org.tundor.data.data_interacting.services;

import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.repositories.TutorRepository;
import org.tundor.data.models.user_roles.Tutor;

import java.util.List;
import java.util.UUID;

@Service
public class TutorService {

    private final TutorRepository tutorRepository;

//    @Autowired
    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public List<Tutor> getAllTutors() {
        return tutorRepository.findAll();
    }

    public Tutor getTutorById(UUID id) {
        return tutorRepository.findById(id).orElse(null);
    }

    public Tutor saveUser(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public void deleteUser(UUID id) {
        tutorRepository.deleteById(id);
    }
}
