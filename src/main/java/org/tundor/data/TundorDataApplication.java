package org.tundor.data;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.tundor.data.data_interacting.repositories.TutorRep;
import org.tundor.data.models.user_roles.Tutor;
import org.tundor.data.models.UserInfo;
import org.tundor.data.models.utils.Gender;
import org.tundor.data.models.utils.UserType;
import org.tundor.data.data_interacting.repositories.UserInfoRep;

import java.sql.Timestamp;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.tundor.data.data_interacting.repositories")
public class TundorDataApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TundorDataApplication.class, args);
        UserInfo tutorInfo = new UserInfo(3, 0, new Timestamp(new DateTime(DateTime.now())
                .getMillis()), new Timestamp(new DateTime(1958, 6, 17, 0, 0, 0).getMillis()),
                "Paul", "Rivardi", Gender.MAN, "any", "any", 0,
                0, 0, 0, UserType.STUDENT);
        UserInfo student2 = new UserInfo(3, 0, new Timestamp(new DateTime(DateTime.now())
                .getMillis()), new Timestamp(new DateTime(1988, 4, 30, 0, 0, 0).getMillis()),
                "Maria", "Ignatiadis", Gender.WOMAN, "any", "any", 0,
                0, 0, 0, UserType.TUTOR);

        UserInfoRep userInfoRep = context.getBean(UserInfoRep.class);
        Tutor tutor = Tutor.builder().id(5).students(4).userInfo(tutorInfo).build();
        TutorRep tutorRep = context.getBean(TutorRep.class);

        UserInfo savedStudent = userInfoRep.save(student2);
//        UserInfo unSavedStudent = userInfoRep.save(student);
        Tutor savedTutor = tutorRep.save(tutor);

        Long id = (long) savedStudent.getId();
//        Long id1 = (long) unSavedStudent.getId();
        int tutorId = savedTutor.getId();

        UserInfo retrievedUser = userInfoRep.findById(id).get();
        Tutor retrievedTutor = tutorRep.findById(tutorId).get();
//        UserInfo retrievedUnsavedUser = userInfoRep.findById(id1).get();
        System.out.println(retrievedUser.getFirstName());
        System.out.println(retrievedTutor.getUserInfo().getFirstName() + " this is tutor table");
//        System.out.println(retrievedUnsavedUser.getFirstName());

    }

}
