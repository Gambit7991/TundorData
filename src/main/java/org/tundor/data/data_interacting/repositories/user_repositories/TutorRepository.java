package org.tundor.data.data_interacting.repositories.user_repositories;

import org.domain.models.userRoles.Tutor;
import org.springframework.stereotype.Repository;
import org.tundor.data.DTOs.user_roles.TutorDTO;
import org.tundor.data.data_interacting.repositories.BaseRepository;
import org.tundor.data.mappers.TutorMapper;

@Repository
public interface TutorRepository extends BaseRepository<TutorDTO> {

    default Tutor getDomainModel(TutorDTO dto){
        return TutorMapper.INSTANCE.toDomain(dto);
    }
    default TutorDTO toDTO(Tutor tutor){
        return TutorMapper.INSTANCE.toDTO(tutor);
    }


}
