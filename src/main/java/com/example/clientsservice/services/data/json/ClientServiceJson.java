package com.example.clientsservice.services.data.json;

import com.example.clientsservice.models.Client;
import com.example.clientsservice.services.data.ClientService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Service
public class ClientServiceJson implements ClientService {


    private final String fileName = "clients.json";
    private final Gson gson = new Gson();

    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, new TypeToken<List<Client>>() {
            }.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void deleteAll() {

    }

    public List<Client> saveAll(List<Client> clients) {
        String json = gson.toJson(clients);
        try (FileWriter writer = new FileWriter("clients.json")) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return clients;
    }
}
