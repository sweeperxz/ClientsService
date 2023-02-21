package com.example.clientsservice.services.data.db;

import com.example.clientsservice.models.Client;
import com.example.clientsservice.services.data.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class ClientServiceDbTest {
    static Client c1 = new Client(0, "c1", "C2", "c3", LocalDate.now(), "c@", null, null, null);
    @Autowired
    ClientService clientService;

    @Test
    void save() {
        Client saved = clientService.save(c1);
        System.out.println(saved);
        assertNotNull(saved);
        fail("123123");
    }
}
