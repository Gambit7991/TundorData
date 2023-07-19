package org.tundor.data.DTOs.user_roles;

import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor.data.DTOs.UserInfoDTO;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "students", schema = "account")
@ToString(includeFieldNames = false)
public class StudentDTO extends BaseUserDTO {

    @Basic
    @Column(name = "tutors")
    private Integer tutors;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_info")
    private UserInfoDTO info;

    @Builder
    public StudentDTO(UserInfoDTO info, Integer tutors) {
        this.info=info;
        this.tutors = tutors;
    }


}
