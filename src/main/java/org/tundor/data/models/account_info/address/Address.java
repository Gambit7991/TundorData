package org.tundor.data.models.account_info.address;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address", schema = "account")
@AllArgsConstructor @NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "apt_num")
    private Integer aptNum;
    @Basic
    @Column(name = "building_number")
    private Integer buildingNumber;
    @Basic
    @Column(name = "street")
    private String street;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "country_id")
    private Integer countryId;
    @Basic
    @Column(name = "postal_code")
    private Integer postalCode;

}
