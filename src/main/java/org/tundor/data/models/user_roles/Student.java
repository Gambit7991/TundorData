package org.tundor.data.models.user_roles;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students", schema = "account")
@Getter
@Setter
@EqualsAndHashCode
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "tutors")
    private Integer tutors;
    @Basic
    @Column(name = "user_info_id")
    private int userInfoId;

}
