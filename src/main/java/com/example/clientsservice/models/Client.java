package com.example.clientsservice.models;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//
@Entity
@Table(name = "clients")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String surname;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String patronymic;
    private LocalDate birthDate;
    @Column(length = 50, nullable = false, unique = true)
    private String email;
    @OneToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Address address;

    @OneToMany(mappedBy = "client")
    private Set<Phone> phonesList;
    @ManyToMany


    @JoinTable(name = "clients_accounts", joinColumns = @JoinColumn(table = "clients", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_clients_id")),
            inverseJoinColumns = @JoinColumn(table = "accounts", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_accounts_id")))
    @ToString.Exclude
    private List<Account> accounts;
}
