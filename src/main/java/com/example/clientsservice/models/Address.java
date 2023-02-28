package com.example.clientsservice.models;
import com.example.clientsservice.models.address.City;
import com.example.clientsservice.models.address.Street;
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
    @Column(length = 50, nullable = false)
    private String house;
    @Column(length = 4)
    private String apartment;
    @OneToOne(mappedBy = "address")
    @ToString.Exclude
    private Client client;
    @OneToOne
    @JoinColumn(foreignKey =  @ForeignKey(name = "fk_city_id"))
    @ToString.Exclude
    private City city;
    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_street_id"))
    @ToString.Exclude
    private Street street;

}
