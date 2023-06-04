package org.tundor.data;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.tundor.data.data_interacting.repositories.TutorRep;
import org.tundor.data.data_interacting.repositories.UserInfoRep;
import org.tundor.data.models.UserInfo;
import org.tundor.data.models.account_info.LoginInfo;
import org.tundor.data.models.account_info.address.Address;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.models.utils.Gender;
import org.tundor.data.models.utils.UserType;

import java.sql.Timestamp;
import java.util.UUID;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.tundor.data.data_interacting.repositories")
public class TundorDataApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TundorDataApplication.class, args);
        UserInfo tutorInf = UserInfo.builder()
                .loginInfo(LoginInfo.builder()
                        .email("paul@gmail.com")
                        .password("paul")
                        .build())
                .createTime(new Timestamp(new DateTime(DateTime.now()).getMillis()))
                .birthDay(new Timestamp(new DateTime(1958, 6, 17, 0, 0, 0).getMillis()))
                .firstName("Paul")
                .lastName("Rivardi")
                .gender(Gender.MAN)
                .phoneNumber("any")
                .mainPicture("any")
                .address(Address.builder()
                        .aptNum(123)
                        .buildingNumber(30)
                        .street("cumming")
                        .city("Alpharetta")
                        .countryId(25)
                        .postalCode(30009)
                        .build())
                .albumId(0)
                .scheduleId(0)
                .cardsId(0)
                .userType(UserType.STUDENT)
                .build();

        Tutor tutor = Tutor.builder().students(4).userInfo(tutorInf).build();
        TutorRep tutorRep = context.getBean(TutorRep.class);

        UserInfoRep userInfoRep = context.getBean(UserInfoRep.class);
        System.out.println(tutor.getUserInfo().getLoginInfo().getEmail());
        userInfoRep.save(tutor.getUserInfo());

        Tutor savedTutor = tutorRep.save(tutor);

        UUID tutorId = savedTutor.getId();

        Tutor retrievedTutor = tutorRep.findById(tutorId).get();
        System.out.println(retrievedTutor.getUserInfo().getFirstName() + " this is tutor table");

    }


}
