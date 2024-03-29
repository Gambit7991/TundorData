package org.tundor.data.data_interacting.repositories.info_repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tundor.data.DTOs.UserInfoDTO;

import java.util.UUID;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoDTO, UUID> {

}
