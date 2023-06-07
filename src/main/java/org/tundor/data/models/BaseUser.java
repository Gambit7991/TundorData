package org.tundor.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@MappedSuperclass
@NoArgsConstructor
public abstract class BaseUser {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id")
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_info_id")
    private UserInfo info;

    public BaseUser(UserInfo info) {
        this.info = info;
    }
}
