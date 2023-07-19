package org.tundor_tests.data.factories.user_DTO_factories;

import org.tundor_tests.data.factories.BaseFactoryDTO;
import org.tundor.data.DTOs.user_roles.AdminDTO;

public class AdminFactoryDTO extends BaseFactoryDTO {

    public AdminDTO generateUser(){
        return new AdminDTO(getUserInfo());
    }
}
