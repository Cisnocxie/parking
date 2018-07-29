package com.oocl.parking.beans;

public class Order {
    private int id;
    private Receipt receipt;
    private Car car;
    private int parkingBoyId = -1;

    public Order(Receipt receipt, Car car) {
        id = this.hashCode();
        this.receipt = receipt;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public Car getCar() {
        return car;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }
}
