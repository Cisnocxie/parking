package com.oocl.parking.controllers;

import com.alibaba.fastjson.JSONObject;
import com.oocl.parking.Database;
import com.oocl.parking.beans.ParkingBoy;
import com.oocl.parking.beans.ParkingLot;
import com.oocl.parking.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ParkingBoyController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/parkingboy")
    public ParkingBoy postParkingBoy(@RequestBody ParkingBoy parkingBoy) {
        managerService.postParkingBoy(parkingBoy);
        return parkingBoy;
    }

    @PostMapping("/parkinglot")
    public ParkingLot postParkingLot(@RequestBody ParkingLot parkingLot) {
        managerService.postParkingLot(parkingLot);
        return parkingLot;
    }

    @PutMapping("/parkingboy")
    public Map<String, String> putParkingLotToParkingBoy(@RequestBody Map<String, Integer> Ids) {
        Map<String, String> map = new HashMap<>();
        map.put("issuccess", managerService.putParkingLotToParkingBoy(Ids.get("parkingLotId"), Ids.get("parkingBoyId")) ? "success" : "unsuccess");
        return map;
    }

    @PostMapping("/car")

}
