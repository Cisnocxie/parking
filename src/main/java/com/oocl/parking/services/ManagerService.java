package com.oocl.parking.services;

import com.oocl.parking.Database;
import com.oocl.parking.beans.Order;
import com.oocl.parking.beans.ParkingBoy;
import com.oocl.parking.beans.ParkingLot;
import com.oocl.parking.beans.Receipt;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManagerService {
    public boolean postParkingBoy(ParkingBoy parkingBoy) {
        return Database.AddParkingBoy(parkingBoy);
    }

    public boolean postParkingLot(ParkingLot parkingLot) {
        return Database.AddParkingLot(parkingLot);
    }

    public boolean putParkingLotToParkingBoy(int parkingLotId, int parkingBoyId) {
        ParkingBoy parkingBoy = Database.getAllParkingBoys().stream().filter(parkingBoy1 -> parkingBoy1.getId() == parkingBoyId).findFirst().get();
        ParkingLot parkingLot = Database.getAllParkingLots().stream().filter(parkingLot1 -> parkingLot1.getId() == parkingLotId).findFirst().get();

        return parkingBoy.addParkingLot(parkingLot);
    }

    public boolean postReceipt(Receipt receipt) {
        return Database.AddReceipt(receipt);
    }

    public boolean postOrder(Order order) {
        return Database.AddOrder(order);
    }

    public Order getOrderById(int id) {
        return Database.getOrderById(id);
    }

    public List<Order> getAllOrders() {
        return Database.getAllOrders();
    }

    public boolean isReceiptExist(int id) {
        return Database.getReceiptById(id) == null ? false : true;
    }

    public Order getOrderByReceiptId(int id) {
        return Database.getAllOrders()
                .stream()
                .filter(order -> order.getReceipt().getNumber() == id)
                .findFirst()
                .get();
    }

    public boolean deleteReceipt(int id) {
        return Database.getReceipts().remove(Database.getReceiptById(id));
    }
}
