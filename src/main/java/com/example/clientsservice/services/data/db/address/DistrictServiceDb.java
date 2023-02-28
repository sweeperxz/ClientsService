package com.example.clientsservice.services.data.db.address;

import com.example.clientsservice.models.address.District;
import com.example.clientsservice.repositories.address.DistrictRepository;
import com.example.clientsservice.services.data.address.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DistrictServiceDb implements DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    @Override
    public void saveAll(ArrayList<District> districts) {
        districtRepository.saveAll(districts);
    }

    @Override
    public District getReferenceById(int i) {
        return districtRepository.getReferenceById(i);
    }
}
