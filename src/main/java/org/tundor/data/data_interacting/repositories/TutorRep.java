package org.tundor.data.data_interacting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tundor.data.models.user_roles.Tutor;

import java.util.UUID;

@Repository
public interface TutorRep extends JpaRepository<Tutor, UUID> {
}
