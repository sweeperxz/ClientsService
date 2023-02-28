package com.example.clientsservice.services.data.db.address;

import com.example.clientsservice.models.address.CityType;
import com.example.clientsservice.repositories.address.CityTypeRepository;
import com.example.clientsservice.services.data.address.CityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CityTypeServiceDb implements CityTypeService {
    @Autowired
    private CityTypeRepository cityTypeRepository;

    @Override
    public void saveAll(ArrayList<CityType> cityTypes) {
        cityTypeRepository.saveAll(cityTypes);
    }

    @Override
    public CityType getReferenceById(int i) {
        return cityTypeRepository.getReferenceById(i);
    }
}

