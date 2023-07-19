package org.tundor_tests.data.factories;

import org.domain.models.userRoles.accountInformation.Gender;
import org.domain.models.userRoles.accountInformation.LoginInfo;
import org.domain.models.userRoles.accountInformation.UserInfo;
import org.domain.models.userRoles.supportClasses.address.Address;
import org.joda.time.DateTime;
import org.tundor.data.DTOs.utils.UserTypeDTO;
import org.tundor_tests.data.factories.user_DTO_factories.AdminFactoryDTO;
import org.tundor_tests.data.factories.user_DTO_factories.StudentFactoryDTO;
import org.tundor_tests.data.factories.user_DTO_factories.TutorFactoryDTO;

import java.sql.Timestamp;
import java.util.UUID;

public abstract class BaseDomainFactory {

    protected LoginInfo getLoginInfo() {
        return LoginInfo.builder()
                .email("paul@gmail.com")
                .password("paul")
                .build();
    }

    protected Address getFirstAddress() {
        return Address.builder()
                .aptNum(123)
                .buildingNumber(30)
                .street("cumming")
                .city("Alpharetta")
                .countryId(25)
                .postalCode(30009)
                .build();
    }

    public Address getSecondAddress() {
        return Address.builder()
                .city("Philly")
                .countryId(48)
                .aptNum(2)
                .postalCode(19136)
                .buildingNumber(4544)
                .street("carwithan")
                .build();
    }


    protected UserInfo getUserInfo() {
        return UserInfo.builder()
                .id(UUID.randomUUID())
                .loginInfo(getLoginInfo())
                .createdTime(new Timestamp(new DateTime(DateTime.now()).getMillis()/1000 * 1000))
                .birthday(new Timestamp(new DateTime(1958, 6, 17, 0, 0, 0).getMillis()))
                .firstName("Paul")
                .lastName("Rivardi")
                .sex(Gender.MAN)
                .phoneNumber("any")
                .mainPicture("any")
                .address(getFirstAddress())
                .build();
    }

    protected UserTypeDTO userType(){
        Class<? extends BaseDomainFactory> factoryClass = this.getClass();
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
