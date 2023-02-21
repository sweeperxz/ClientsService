package com.example.clientsservice.models;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //TODO fields+
    //область, not null
    @Column(nullable = false)
    private String region;
    @Column(nullable = false)
    //район, not null
    private String district;
    @Column(nullable = false)
    //город, not null
    private String city;
    @Column(nullable = false)
    //улица, not null
    private String street;
    @Column(nullable = false)
    //номер дома, not null
    private String house;
    @Column(nullable = false)
    //квартира
    private String apartment;
    @OneToOne
    @ToString.Exclude

    private Client client;


}
