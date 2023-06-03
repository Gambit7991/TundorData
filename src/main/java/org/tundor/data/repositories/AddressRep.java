package org.tundor.data.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tundor.data.models.account_info.address.Address;

@Repository
public interface AddressRep extends JpaRepository<Address, Long> {
}
