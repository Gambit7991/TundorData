package org.tundor_tests.data.factories.user_DTO_factories;

import org.tundor.data.DTOs.user_roles.TutorDTO;
import org.tundor_tests.data.factories.BaseFactoryDTO;

public class TutorFactoryDTO extends BaseFactoryDTO {

    public TutorDTO generateUser() {
        return new TutorDTO(getUserInfo(), 4);
    }
}
