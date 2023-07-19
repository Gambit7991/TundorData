package org.tundor.data.mappers;

import org.domain.models.userRoles.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.tundor.data.DTOs.user_roles.StudentDTO;

@Mapper(uses = InfoMapper.class)
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
    @Mapping(source = "info", target = "info")
    Student toDomain(StudentDTO studentDTO);

    @Mapping(source = "info", target = "info")
    StudentDTO toDTO(Student student);
}
