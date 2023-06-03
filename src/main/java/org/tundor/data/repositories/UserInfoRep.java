package org.tundor.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tundor.data.models.UserInfo;

@Repository
public interface UserInfoRep extends JpaRepository<UserInfo, Long> {

}
