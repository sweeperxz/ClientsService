package com.example.clientsservice.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //TODO fields+
    @Column(nullable = false)
    private int amount;


    @ManyToMany(mappedBy = "accounts")
    @ToString.Exclude
    private List<Client> clients;

}
