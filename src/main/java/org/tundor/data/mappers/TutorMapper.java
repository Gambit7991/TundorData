package org.tundor.data.mappers;

import org.domain.models.userRoles.Tutor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.data.DTOs.user_roles.TutorDTO;

@Mapper
public interface TutorMapper {
    TutorMapper INSTANCE = Mappers.getMapper(TutorMapper.class);

    @Mapping(source = "info", target = "info")
    Tutor toDomain(TutorDTO tutor);

    @Mapping(source = "info", target = "info")
    TutorDTO toDTO(Tutor tutor);

}
