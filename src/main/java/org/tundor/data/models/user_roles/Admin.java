package org.tundor.data.models.user_roles;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.tundor.data.models.BaseUser;
import org.tundor.data.models.UserInfo;

@Entity
@Table(name = "admin")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Admin extends BaseUser {
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @Id
//    @Column(name = "id")
//    private UUID id;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_info_id")
//    private UserInfo userInfo;


    public Admin(UserInfo info) {
        super(info);
    }

    public Admin() {
        super();
    }
}
