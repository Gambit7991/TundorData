package org.tundor.data.models.user_roles;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tutor", schema = "account")
@Getter
@Setter
@EqualsAndHashCode
public class Tutor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "students")
    private Integer students;
    @Basic
    @Column(name = "user_info_id")
    private String userInfoId;

}
