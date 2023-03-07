package com.example.clientsservice.models.adress;

import com.example.clientsservice.models.Address;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
//
@Entity
@Table(name = "streets")
public class Street {
    public enum StreetType{
        STREET,
        AVENUE,
        DRIVE,
        COURT,
        LANE,
        ALLEY
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private StreetType streetType;
    @ManyToOne
    @EqualsAndHashCode.Exclude
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_streetName_id"))
    private StreetName streetName;
    @OneToOne(mappedBy = "street")
    @EqualsAndHashCode.Exclude
    private Address address;
}
