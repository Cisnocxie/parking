package com.oocl.parking.services;

import com.oocl.parking.Database;
import com.oocl.parking.beans.ParkingBoy;
import com.oocl.parking.beans.ParkingLot;
import org.springframework.stereotype.Component;

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
}
