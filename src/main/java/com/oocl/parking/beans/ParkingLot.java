package com.oocl.parking.beans;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private int id;
    private Map<String, Car> carList;
    private String name;
    private int size;

    public ParkingLot(String name, int size) {
        id = this.hashCode();
        carList = new HashMap<String, Car>();
        this.name = name;
        this.size = size;
    }

    public void park(Receipt receipt, Car car) {
        carList.put(Integer.toString(receipt.getNumber()), car);
    }

    public void unPark(Receipt receipt) {
        carList.remove(receipt);
    }

    public int getId() {
        return id;
    }

    public Map<String, Car> getCarList() {
        return carList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
