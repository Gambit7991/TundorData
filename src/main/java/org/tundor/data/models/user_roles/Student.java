package org.tundor.data.models.user_roles;

import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.models.UserInfo;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "students", schema = "account")
public class Student {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private UUID id;

    @Basic
    @Column(name = "tutors")
    private Integer tutors;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

}
