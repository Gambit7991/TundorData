package org.tundor.data.models.user_roles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.tundor.data.models.BaseUser;
import org.tundor.data.models.UserInfo;

@Entity
@Table(name = "tutor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Tutor extends BaseUser {
    //    @GeneratedValue(strategy = GenerationType.UUID)
//    @Id
//    @Column(name = "id")
//    private UUID id;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_info_id")
//    private UserInfo userInfo;
    @Column(name = "students")
    private Integer students;

    public Tutor(UserInfo info, Integer students) {
        super(info);
        this.students = students;

    }
}
