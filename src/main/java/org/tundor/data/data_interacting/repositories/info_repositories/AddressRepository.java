package org.tundor.data.data_interacting.repositories.info_repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tundor.data.DTOs.account_info.address.AddressDTO;

@Repository
public interface AddressRepository extends JpaRepository<AddressDTO, Long> {
}
