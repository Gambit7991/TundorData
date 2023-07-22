package org.tundor.data.DTOs;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@SuperBuilder
@ToString
public abstract class BaseUserDTO {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private UUID id;

    public abstract UserInfoDTO getInfo();
    public abstract void setInfo(UserInfoDTO info);

}
