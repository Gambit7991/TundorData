package org.tundor.data.models.user_roles;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.tundor.data.models.BaseUser;
import org.tundor.data.models.UserInfo;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "students", schema = "account")
public class Student extends BaseUser {
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @Id
//    @Column(name = "id")
//    private UUID id;

    @Basic
    @Column(name = "tutors")
    private Integer tutors;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_info_id")
//    private UserInfo userInfo;


    public Student(UserInfo info, Integer tutors) {
        super(info);
        this.tutors = tutors;
    }
}
