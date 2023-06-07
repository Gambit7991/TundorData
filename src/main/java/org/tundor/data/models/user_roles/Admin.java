package org.tundor.data.models.user_roles;

import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.models.UserInfo;

import java.util.UUID;

@Entity
@Table(name = "admin")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private UUID id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

}
