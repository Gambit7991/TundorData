package org.tundor.data.models.user_roles;

import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.models.UserInfo;

import java.util.UUID;

@Entity
@Table(name = "tutor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Tutor {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "students")
    private Integer students;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;
}
