package org.tundor.data.data_interacting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tundor.data.data_interacting.controllers.AddressController;
import org.tundor.data.models.account_info.address.Address;

@Service
public class AddressService {
    private final AddressController controller;

    @Autowired
    public AddressService(AddressController controller) {
        this.controller = controller;
    }

    public Address addAddress(Address address){
        return controller.addAddress(address);
    }

    public Address getAddressById(int id){
        return controller.getAddressById(id);
    }

    public Address updateAddress(Address newAddress, int id){
        return controller.updateAddress(newAddress, id);
    }
}
