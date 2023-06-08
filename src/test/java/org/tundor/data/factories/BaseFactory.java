package org.tundor.data.factories;

import org.joda.time.DateTime;
import org.tundor.data.factories.user_factories.AdminFactory;
import org.tundor.data.factories.user_factories.StudentFactory;
import org.tundor.data.factories.user_factories.TutorFactory;
import org.tundor.data.models.UserInfo;
import org.tundor.data.models.account_info.LoginInfo;
import org.tundor.data.models.account_info.address.Address;
import org.tundor.data.models.utils.Gender;
import org.tundor.data.models.utils.UserType;

import java.sql.Timestamp;

public abstract class BaseFactory {

    protected LoginInfo getLoginInfo() {
        return LoginInfo.builder()
                .email("paul@gmail.com")
                .password("paul")
                .build();
    }

    protected Address getAddress() {
        return Address.builder()
                .aptNum(123)
                .buildingNumber(30)
                .street("cumming")
                .city("Alpharetta")
                .countryId(25)
                .postalCode(30009)
                .build();
    }

    protected UserInfo getUserInfo() {
        return UserInfo.builder()
                .loginInfo(getLoginInfo())
                .createTime(new Timestamp(new DateTime(DateTime.now()).getMillis()))
                .birthDay(new Timestamp(new DateTime(1958, 6, 17, 0, 0, 0).getMillis()))
                .firstName("Paul")
                .lastName("Rivardi")
                .gender(Gender.MAN)
                .phoneNumber("any")
                .mainPicture("any")
                .address(getAddress())
                .userType(userType())
                .albumId(0)
                .scheduleId(0)
                .cardsId(0)
                .build();
    }

    protected UserType userType(){
        Class<? extends BaseFactory> factoryClass = this.getClass();
        if (TutorFactory.class.isAssignableFrom(factoryClass)) {
            return UserType.TUTOR;
        } else if (StudentFactory.class.isAssignableFrom(factoryClass)) {
            return UserType.STUDENT;
        } else if (AdminFactory.class.isAssignableFrom(factoryClass)) {
            return UserType.ADMIN;
        }else {
            return UserType.UNKNOWN;
        }
    }
}
