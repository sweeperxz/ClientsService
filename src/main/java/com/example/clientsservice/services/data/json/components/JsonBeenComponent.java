package com.example.clientsservice.services.data.json.components;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class JsonBeenComponent {
    @Bean
    public Gson gson() {
        return  new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();
    }
}
