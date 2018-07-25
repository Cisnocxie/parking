package com.oocl.parking.controllers;

import com.alibaba.fastjson.JSONObject;
import com.oocl.parking.Database;
import com.oocl.parking.beans.*;
import com.oocl.parking.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ParkingBoyController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/parkingboys")
    public ParkingBoy postParkingBoy(@RequestBody ParkingBoy parkingBoy) {
        managerService.postParkingBoy(parkingBoy);
        return parkingBoy;
    }

    @PutMapping("/parkingboys/{parkingboyid}/parkinglots")
    public Map<String, String> putParkingLotToParkingBoy(@PathVariable int parkingboyid, @RequestBody Map<String, Integer> Ids) {
        Map<String, String> map = new HashMap<>();
        map.put("issuccess", managerService.putParkingLotToParkingBoy(Ids.get("parkingLotId"), parkingboyid) ? "success" : "unsuccess");
        return map;
    }

    @PostMapping("/receipts")
    public Receipt postReceiptAndOrder(@RequestBody Car car) {
        Receipt receipt = new Receipt();
        Order order = new Order(receipt, car);
        managerService.postReceipt(receipt);
        managerService.postOrder(order);
        return receipt;
    }


}
