package org.tundor.data.data_interacting.repositories.user_repositories;

import org.springframework.stereotype.Repository;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.data.data_interacting.repositories.BaseRepository;

@Repository
public interface StudentRepository extends BaseRepository<StudentDTO> {
}
