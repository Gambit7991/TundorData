package org.tundor.data.mappers;

import org.domain.models.userRoles.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.data.DTOs.user_roles.AdminDTO;

@Mapper
public interface AdminMapper {
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

    @Mapping(source = "info", target = "info")
    Admin toDomain(AdminDTO admin);

    @Mapping(source = "info", target = "info")
    AdminDTO toDTO(Admin admin);
}
