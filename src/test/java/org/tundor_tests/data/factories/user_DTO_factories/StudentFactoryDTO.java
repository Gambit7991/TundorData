package org.tundor_tests.data.factories.user_DTO_factories;

import org.tundor.data.DTOs.user_roles.StudentDTO;
import org.tundor_tests.data.factories.BaseFactoryDTO;

public class StudentFactoryDTO extends BaseFactoryDTO {

    public StudentDTO generateUser() {
        return StudentDTO.builder()
                .tutors(4)
                .info(getUserInfo())
                .build();
    }

}
