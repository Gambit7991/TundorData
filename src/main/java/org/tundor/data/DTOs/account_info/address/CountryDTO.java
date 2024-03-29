package org.tundor.data.DTOs.account_info.address;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder
@Table(name = "country", schema = "account")
@Getter
@Setter
@EqualsAndHashCode
public class CountryDTO {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id")
    private int id;
    @Basic
    @Column(name = "country_name")
    private String countryName;
    @Basic
    @Column(name = "country_code")
    private Integer countryCode;


}
