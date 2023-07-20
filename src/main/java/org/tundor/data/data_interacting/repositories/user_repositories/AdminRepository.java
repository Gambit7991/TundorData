package org.tundor.data.data_interacting.repositories.user_repositories;

import org.springframework.stereotype.Repository;
import org.tundor.data.DTOs.user_roles.AdminDTO;
import org.tundor.data.data_interacting.repositories.BaseRepository;

@Repository
public interface AdminRepository extends BaseRepository<AdminDTO> {

}
