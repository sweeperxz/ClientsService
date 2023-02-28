package com.example.clientsservice.db;

import com.example.clientsservice.services.data.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientServiceDbTest {
    @Autowired
    @Qualifier("clientServiceDb")
    private ClientService clientService;
}
