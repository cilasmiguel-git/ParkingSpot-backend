package com.api.parkingcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existsByLicensePlateCar(String LicensePlateCar);
    boolean existsByParkingSpotNumber(String ParkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment,String block);

}
