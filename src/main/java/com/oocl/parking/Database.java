package com.oocl.parking;

import com.oocl.parking.beans.Order;
import com.oocl.parking.beans.ParkingBoy;
import com.oocl.parking.beans.ParkingLot;
import com.oocl.parking.beans.Receipt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Database {
    private static List<ParkingBoy> parkingBoys = new ArrayList<>();
    private static List<ParkingLot> parkingLots = new ArrayList<>();
    private static List<Receipt> receipts = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();

    public static boolean AddParkingBoy(ParkingBoy parkingBoy) {
        return parkingBoys.add(parkingBoy);
    }

    public static boolean AddParkingLot(ParkingLot parkingLot) {
        return parkingLots.add(parkingLot);
    }

    public static List<ParkingBoy> getAllParkingBoys() {
        return parkingBoys;
    }

    public static List<ParkingLot> getAllParkingLots() {
        return parkingLots;
    }

    public static boolean AddReceipt(Receipt receipt) {
        return receipts.add(receipt);
    }

    public static boolean AddOrder(Order order) {
        return orders.add(order);
    }

    public static Order getOrderById(int id) {
        return orders.stream().filter(order -> order.getId() == id).findFirst().get();
    }

    public static List<Order> getAllOrders() {
        return orders;
    }

    public static ParkingBoy getParkingBoyById(int id) {
        return  parkingBoys.stream().filter(parkingBoy -> parkingBoy.getId() == id).findFirst().get();
    }

    public static ParkingLot getParkingLotById(int id) {
        return parkingLots.stream().filter(parkingLot -> parkingLot.getId() == id).findFirst().get();
    }
}
