package org.tundor.data.DTOs.account_info;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Table(name = "login_info", schema = "account")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@ToString(includeFieldNames = false)
public class LoginInfoDTO {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "login_id")
    private int id;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;

}
