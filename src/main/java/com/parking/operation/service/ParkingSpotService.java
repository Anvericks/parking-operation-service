package com.parking.operation.service;

import com.parking.operation.model.ParkingSpot;
import com.parking.operation.repository.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpotService {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public List<ParkingSpot> getAllAvailableSpots() {
        return parkingSpotRepository.findByAvailable(true);
    }

    public ParkingSpot addParkingSpot(ParkingSpot parkingSpot) {
        return parkingSpotRepository.save(parkingSpot);
    }
}
