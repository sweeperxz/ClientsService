package com.example.clientsservice.services.data.db.address;

import com.example.clientsservice.models.address.StreetType;
import com.example.clientsservice.repositories.address.StreetTypeRepository;
import com.example.clientsservice.services.data.address.StreetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StreetTypeServiceDb implements StreetTypeService {
    @Autowired
    private StreetTypeRepository streetTypeRepository;

    @Override
    public void saveAll(ArrayList<StreetType> streetTypes) {
        streetTypeRepository.saveAll(streetTypes);
    }

    @Override
    public StreetType getReferenceById(int i) {
        return streetTypeRepository.getReferenceById(i);
    }
}
