package org.tundor.data.models;


import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.models.account_info.LoginInfo;
import org.tundor.data.models.account_info.address.Address;
import org.tundor.data.models.utils.Gender;
import org.tundor.data.models.utils.UserType;

import java.sql.Timestamp;

@Entity
@Table(name = "user_info", schema = "account")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class UserInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_info")
    private LoginInfo loginInfo;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "birth_day")
    private Timestamp birthDay;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "main_picture")
    private String mainPicture;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;
    @Basic
    @Column(name = "album_id")
    private Integer albumId;
    @Basic
    @Column(name = "schedule_id")
    private Integer scheduleId;
    @Basic
    @Column(name = "cards_id")
    private Integer cardsId;
    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;
}
