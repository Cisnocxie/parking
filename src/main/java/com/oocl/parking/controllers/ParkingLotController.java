package com.oocl.parking.controllers;

import com.oocl.parking.Database;
import com.oocl.parking.beans.ParkingLot;
import com.oocl.parking.services.ManagerService;
import com.oocl.parking.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingLotController {

    @Autowired
    private ManagerService managerService;

    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping("/parkinglots")
    public ParkingLot postParkingLot(@RequestBody ParkingLot parkingLot) {
        managerService.postParkingLot(parkingLot);
        return parkingLot;
    }

    @GetMapping("/parkinglots")
    public List<ParkingLot> getParkingLots() {
        return parkingLotService.getPakringLots();
    }

    @GetMapping("/parkinglots/{id}")
    public ParkingLot getParkingLotById(@PathVariable int id) {
        return parkingLotService.getParkingLotById(id);
    }
}
