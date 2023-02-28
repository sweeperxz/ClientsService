package com.example.clientsservice.services.data.db.address;

import com.example.clientsservice.models.address.Region;
import com.example.clientsservice.repositories.address.RegionRepository;
import com.example.clientsservice.services.data.address.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionServiceDb implements RegionService {
    @Autowired
    private RegionRepository regionRepository;

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public void saveAll(ArrayList<Region> regions) {
        regionRepository.saveAll(regions);
    }

    @Override
    public Region getReferenceById(int i) {
        return regionRepository.getReferenceById(i);
    }

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }
}
