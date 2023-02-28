package com.example.clientsservice.services.data.address;

import com.example.clientsservice.models.address.Country;

import java.util.ArrayList;
import java.util.List;

public interface CountryService {
    Country save(Country country);

    void saveAll(ArrayList<Country> countries);

    Country getReferenceById(int i);
    Country findByName(String name);

    List<Country> findAll();
}
