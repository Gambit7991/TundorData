package org.tundor_tests.data.factories;

import org.joda.time.DateTime;
import org.tundor.data.DTOs.UserInfoDTO;
import org.tundor.data.DTOs.account_info.LoginInfoDTO;
import org.tundor_tests.data.factories.user_DTO_factories.AdminFactoryDTO;
import org.tundor_tests.data.factories.user_DTO_factories.StudentFactoryDTO;
import org.tundor_tests.data.factories.user_DTO_factories.TutorFactoryDTO;
import org.tundor.data.DTOs.account_info.address.AddressDTO;
import org.tundor.data.DTOs.utils.GenderDTO;
import org.tundor.data.DTOs.utils.UserTypeDTO;

import java.sql.Timestamp;
import java.util.UUID;

public abstract class BaseFactoryDTO {

    protected LoginInfoDTO getLoginInfo() {
        return LoginInfoDTO.builder()
                .email("paul@gmail.com")
                .password("paul")
                .build();
    }

    protected AddressDTO getFirstAddress() {
        return AddressDTO.builder()
                .aptNum(123)
                .buildingNumber(30)
                .street("cumming")
                .city("Alpharetta")
                .countryId(25)
                .postalCode(30009)
                .build();
    }

    public AddressDTO getSecondAddress() {
        return AddressDTO.builder()
                .city("Philly")
                .countryId(48)
                .aptNum(2)
                .postalCode(19136)
                .buildingNumber(4544)
                .street("carwithan")
                .build();
    }


    protected UserInfoDTO getUserInfo() {
        return UserInfoDTO.builder()
                .id(UUID.randomUUID())
                .loginInfoDTO(getLoginInfo())
                .createdTime(new Timestamp(new DateTime(DateTime.now()).getMillis()/1000 * 1000))
                .birthday(new Timestamp(new DateTime(1958, 6, 17, 0, 0, 0).getMillis()))
                .firstName("Paul")
                .lastName("Rivardi")
                .sex(GenderDTO.MAN)
                .phoneNumber("any")
                .mainPicture("any")
                .addressDTO(getFirstAddress())
                .userTypeDTO(userType())
                .albumId(0)
                .scheduleId(0)
                .cardsId(0)
                .build();
    }

    protected UserTypeDTO userType(){
        Class<? extends BaseFactoryDTO> factoryClass = this.getClass();
        if (TutorFactoryDTO.class.isAssignableFrom(factoryClass)) {
            return UserTypeDTO.TUTOR;
        } else if (StudentFactoryDTO.class.isAssignableFrom(factoryClass)) {
            return UserTypeDTO.STUDENT;
        } else if (AdminFactoryDTO.class.isAssignableFrom(factoryClass)) {
            return UserTypeDTO.ADMIN;
        }else {
            return UserTypeDTO.UNKNOWN;
        }
    }
}
