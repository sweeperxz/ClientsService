package com.example.clientsservice.repositories.address;

import com.example.clientsservice.models.address.CityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityTypeRepository extends JpaRepository<CityType, Integer> {
}
