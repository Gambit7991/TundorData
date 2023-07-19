package org.tundor.data.DTOs;


import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.DTOs.account_info.LoginInfoDTO;
import org.tundor.data.DTOs.account_info.address.AddressDTO;
import org.tundor.data.DTOs.utils.GenderDTO;
import org.tundor.data.DTOs.utils.UserTypeDTO;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "user_info", schema = "account")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@ToString(includeFieldNames = false)
public class UserInfoDTO {
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private UUID id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_info")
    private LoginInfoDTO loginInfoDTO;
    @Basic
    @Column(name = "create_time")
    private Timestamp createdTime;
    @Basic
    @Column(name = "birth_day")
    private Timestamp birthday;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private GenderDTO sex;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "main_picture")
    private String mainPicture;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private AddressDTO addressDTO;
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
    private UserTypeDTO userTypeDTO;
}
