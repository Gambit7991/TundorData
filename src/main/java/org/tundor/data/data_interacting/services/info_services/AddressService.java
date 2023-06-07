package org.tundor.data.data_interacting.services.info_services;

import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.repositories.info_repositories.AddressRepository;
import org.tundor.data.models.account_info.address.Address;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    public List<Address> findAll(){
        return repository.findAll();
    }

    public Optional<Address> findById(Long id){
        return repository.findById(id);
    }

    public Optional<Address> save(Address address){
        return Optional.of(repository.save(address));
    }

    public void deleteById(Long id) {repository.deleteById(id);}

}
