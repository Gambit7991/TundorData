package org.tundor.data.DTOs.user_roles;

import jakarta.persistence.*;
import lombok.*;
import org.tundor.data.DTOs.BaseUserDTO;
import org.tundor.data.DTOs.UserInfoDTO;

@Entity
@Table(name = "admin")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = false)
public class AdminDTO extends BaseUserDTO {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_admin_info")
    private UserInfoDTO info;
    public AdminDTO(UserInfoDTO info) {
        this.info = info;
    }


}
