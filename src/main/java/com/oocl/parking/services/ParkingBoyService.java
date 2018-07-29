package com.oocl.parking.services;

import com.oocl.parking.Database;
import com.oocl.parking.beans.Order;
import com.oocl.parking.beans.ParkingBoy;
import com.oocl.parking.beans.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParkingBoyService {
    public boolean park(int id, int orderId) {
        ParkingBoy parkingBoy = Database.getParkingBoyById(id);
        Order order = Database.getOrderById(orderId);
        for (ParkingLot parkingLot : parkingBoy.getParkingLotList()) {
            if (!parkingLot.isFull()) {
                parkingLot.park(order.getReceipt(), order.getCar());
                return true;
            }
        }
        return false;
    }

    public List<ParkingBoy> getParkingBoys() {
        return Database.getAllParkingBoys();
    }

    public ParkingBoy getParkingBoyById(int id) {
        return Database.getParkingBoyById(id);
    }
}
