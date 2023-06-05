package org.tundor.data.factories;

import org.joda.time.DateTime;
import org.tundor.data.models.UserInfo;
import org.tundor.data.models.account_info.LoginInfo;
import org.tundor.data.models.account_info.address.Address;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.models.utils.Gender;
import org.tundor.data.models.utils.UserType;

import java.sql.Timestamp;

public class UserFactory {


    public Tutor createTutor() {
        return Tutor.builder()
                .students(4)
                .userInfo(getUserInfo())
                .build();
    }

    public LoginInfo getLoginInfo() {
        return LoginInfo.builder()
                .email("paul@gmail.com")
                .password("paul")
                .build();
    }

    public Address getAddress() {
        return Address.builder()
                .aptNum(123)
                .buildingNumber(30)
                .street("cumming")
                .city("Alpharetta")
                .countryId(25)
                .postalCode(30009)
                .build();
    }

    public UserInfo getUserInfo() {
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
                .albumId(0)
                .scheduleId(0)
                .cardsId(0)
                .userType(UserType.STUDENT)
                .build();
    }
}
