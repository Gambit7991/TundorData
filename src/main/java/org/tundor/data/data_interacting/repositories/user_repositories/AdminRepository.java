package org.tundor.data.data_interacting.repositories.user_repositories;

import org.domain.models.userRoles.Admin;
import org.springframework.stereotype.Repository;
import org.tundor.data.DTOs.user_roles.AdminDTO;
import org.tundor.data.data_interacting.repositories.BaseRepository;
import org.tundor.data.mappers.AdminMapper;

@Repository
public interface AdminRepository extends BaseRepository<AdminDTO> {

    default Admin getDomainModel(AdminDTO dto){
        return AdminMapper.INSTANCE.toDomain(dto);
    }
    default AdminDTO toDTO(Admin admin){
        return AdminMapper.INSTANCE.toDTO(admin);
    }
}
