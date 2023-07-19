package org.tundor.data.DTOs.account_info.address;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subdivisoin", schema = "account")
@NoArgsConstructor @AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
public class SubdivisionDTO {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "subdivision_name")
    private String subdivisionName;
    @Basic
    @Column(name = "subdivision_code")
    private Integer subdivisionCode;
    @Basic
    @Column(name = "country_code")
    private Integer countryCode;

}
