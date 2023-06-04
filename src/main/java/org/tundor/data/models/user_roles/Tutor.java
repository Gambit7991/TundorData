package org.tundor.data.models.user_roles;

import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.models.UserInfo;

import java.util.UUID;

@Entity
@Table(name = "tutor", schema = "account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tutor {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private UUID id;
    @Basic
    @Column(name = "students")
    private Integer students;
    @OneToOne
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;
}
