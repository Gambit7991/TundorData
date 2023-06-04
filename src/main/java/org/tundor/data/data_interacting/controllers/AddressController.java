package org.tundor.data.data_interacting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tundor.data.data_interacting.repositories.AddressRep;
import org.tundor.data.models.account_info.address.Address;

@RestController
@RequestMapping("/AddressEntity")
public class AddressController {
    private final AddressRep repository;

    public AddressController(AddressRep repository) {
        this.repository = repository;
    }

    public Address addAddress(Address address) {
        return repository.save(address);
    }

    public Address getAddressById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Address updateAddress(Address newAddress, int id) {
        repository.findById(id).ifPresent(repository::delete);
        return repository.save(newAddress);
    }

}
