package com.example.clientsservice;

import com.example.clientsservice.models.Client;
import com.example.clientsservice.repositories.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;

@SpringBootApplication
public class ClientsServiceApplication {
    private final ClientRepository clientRepository;

    public ClientsServiceApplication(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientsServiceApplication.class, args);

    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void onLoaded() {
//
//        Client client = new Client(0, "Shilo", "Max", "Yuriyovisch", LocalDate.now(), "123123@mail.com", null, null, null);
//        client = clientRepository.save(client);
//        System.out.println(client);
//    }
}
