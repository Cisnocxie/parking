package com.oocl.parking.services;

import com.oocl.parking.Database;
import com.oocl.parking.beans.ParkingLot;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParkingLotService {
    public List<ParkingLot> getPakringLots() {
        return Database.getAllParkingLots();
    }

    public ParkingLot getParkingLotById(int id) {
        return Database.getParkingLotById(id);
    }
}
