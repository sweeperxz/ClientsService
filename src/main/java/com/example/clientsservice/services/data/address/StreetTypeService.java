package com.example.clientsservice.services.data.address;

import com.example.clientsservice.models.address.StreetType;

import java.util.ArrayList;

public interface StreetTypeService {
    void saveAll(ArrayList<StreetType> streetTypes);

    StreetType getReferenceById(int i);
}
