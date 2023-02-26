package com.example.clientsservice.models;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//
@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //TODO fields+
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            foreignKey = @ForeignKey(
                    name = "fk_client_id"
            )

    )

    @OnDelete(action = OnDeleteAction.CASCADE)
    @ToString.Exclude

    private Client client;


}
