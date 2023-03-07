package com.example.clientsservice.models.adress;

import lombok.*;

import javax.persistence.*;
import java.util.List;

//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
//
@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false,unique = true)
    private String region;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_country_id"))
    @EqualsAndHashCode.Exclude
    private Country country;
    @OneToMany(mappedBy = "region")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<District> district;

   }
