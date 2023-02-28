package com.example.clientsservice.services.data.address;

import com.example.clientsservice.models.address.CityType;

import java.util.ArrayList;

public interface CityTypeService {
    void saveAll(ArrayList<CityType> cityTypes);

    CityType getReferenceById(int i);
}
