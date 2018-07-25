package com.oocl.parking;

import com.oocl.parking.beans.ParkingBoy;
import com.oocl.parking.beans.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Database {
    private static List<ParkingBoy> parkingBoys = new ArrayList<>();
    private static List<ParkingLot> parkingLots = new ArrayList<>();

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
}
