package org.tundor.data.data_interacting.repositories.user_repositories;

import org.springframework.stereotype.Repository;
import org.tundor.data.data_interacting.repositories.BaseRepository;
import org.tundor.data.models.user_roles.Admin;

@Repository
public interface AdminRepository extends BaseRepository<Admin> {
}
