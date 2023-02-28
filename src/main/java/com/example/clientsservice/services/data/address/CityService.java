package com.example.clientsservice.services.data.address;

import com.example.clientsservice.models.address.City;

import java.util.ArrayList;
import java.util.List;

public interface CityService {
    void saveAll(ArrayList<City> cities);

 List<City> findAll();

    City getReferenceById(int i);
}
