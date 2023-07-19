package org.tundor.data.data_interacting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.tundor.data.DTOs.BaseUserDTO;

@NoRepositoryBean
public interface BaseRepository <T extends BaseUserDTO> extends JpaRepository<T, java.util.UUID> {
}
