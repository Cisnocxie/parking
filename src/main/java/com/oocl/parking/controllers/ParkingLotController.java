package com.oocl.parking.controllers;

import com.oocl.parking.beans.ParkingLot;
import com.oocl.parking.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingLotController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/parkinglot")
    public ParkingLot postParkingLot(@RequestBody ParkingLot parkingLot) {
        managerService.postParkingLot(parkingLot);
        return parkingLot;
    }
}
