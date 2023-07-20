package org.tundor.data.DTOs.user_roles;

import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor.data.DTOs.UserInfoDTO;

@Entity
@Table(name = "tutor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = false)
public class TutorDTO extends BaseUserDTO {

    @Basic
    @Column(name = "students")
    private Integer students;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_tutor_info")
    private UserInfoDTO info;

    public TutorDTO(UserInfoDTO info, Integer students) {
        this.info = info;
        this.students = students;
    }
}
