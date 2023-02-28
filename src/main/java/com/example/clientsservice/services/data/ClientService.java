package com.example.clientsservice.services.data;

import com.example.clientsservice.models.Client;

import java.util.List;


public interface ClientService {
    Client save(Client client);

    List<Client> findAll();

    void deleteAll();

    List<Client> saveAll(List<Client> clients);
}
