package com.oocl.parking.beans;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {
    private int id;
    private List<ParkingLot> parkingLotList;
    private String name;
    private int age;

    public ParkingBoy(String name, int age) {
        id = this.hashCode();
        parkingLotList = new ArrayList<>();
        this.name = name;
        this.age = age;
    }

    public boolean addParkingLot(ParkingLot parkingLot) {
        return parkingLotList.add(parkingLot);
    }

    public int getId() {
        return id;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
