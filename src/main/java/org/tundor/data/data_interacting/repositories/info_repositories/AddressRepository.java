package org.tundor.data.data_interacting.repositories.info_repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tundor.data.models.account_info.address.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
