package com.oocl.parking.controllers;

import com.alibaba.fastjson.JSONObject;
import com.oocl.parking.Database;
import com.oocl.parking.beans.*;
import com.oocl.parking.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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

    @PutMapping("/parkingboys/{parkingboyid}/parkinglots{parkinglotid}")
    public Map<String, String> putParkingLotToParkingBoy(@PathVariable int parkingboyid, @PathVariable int parkinglotid) {
        Map<String, String> map = new HashMap<>();
        map.put("issuccess", managerService.putParkingLotToParkingBoy(parkinglotid, parkingboyid) ? "success" : "unsuccess");
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

    @PatchMapping("/orders/{orderid}/parkingboys")
    public boolean putParkingBoyinOrder(@PathVariable int orderid, @RequestBody int parkingboyid) {
        if (managerService.getOrderById(orderid).getParkingBoyId() == -1) {
            managerService.getOrderById(orderid).setParkingBoyId(parkingboyid);
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return managerService.getAllOrders();
    }


}
