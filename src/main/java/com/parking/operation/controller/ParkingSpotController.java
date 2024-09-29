package com.parking.operation.controller;

import com.parking.operation.model.ParkingSpot;
import com.parking.operation.service.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingSpotController {

    @Autowired
    private ParkingSpotService parkingSpotService;

    @GetMapping("/api/parking-spots/available")
    public List<ParkingSpot> getAvailableParkingSpots() {
        return parkingSpotService.getAllAvailableSpots();
    }

    @PostMapping("/api/parking-spots")
    public ParkingSpot addParkingSpot(@RequestBody ParkingSpot parkingSpot) {
        return parkingSpotService.addParkingSpot(parkingSpot);
    }
}
