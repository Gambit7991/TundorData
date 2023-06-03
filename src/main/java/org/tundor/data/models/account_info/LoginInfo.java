package org.tundor.data.models.account_info;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Table(name = "login_info", schema = "account")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class LoginInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;

}
