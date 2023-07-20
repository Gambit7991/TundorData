package org.tundor.data.data_interacting.repositories.user_repositories;

import org.domain.models.userRoles.Student;
import org.springframework.stereotype.Repository;
import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor.data.data_interacting.repositories.BaseRepository;
import org.tundor.data.mappers.StudentMapper;

@Repository
public interface StudentRepository extends BaseRepository<StudentDTO> {

    default Student getDomainModel(StudentDTO dto){
        return StudentMapper.INSTANCE.toDomain(dto);
    }
    default StudentDTO getDTO(Student student){
        return StudentMapper.INSTANCE.getDTO(student);
    }
}
