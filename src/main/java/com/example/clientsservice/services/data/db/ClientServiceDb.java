package com.example.clientsservice.services.data.db;

import com.example.clientsservice.models.Client;
import com.example.clientsservice.repositories.ClientRepository;
import com.example.clientsservice.services.data.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceDb implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Client> saveAll(List<Client> clients) {
        return null;
    }
}
