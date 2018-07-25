package com.oocl.parking.beans;

public class Order {
    private int id;
    private Receipt receipt;
    private Car car;
    private ParkingBoy parkingBoy = null;

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

    public ParkingBoy getParkingBoy() {
        return parkingBoy;
    }

    public void setParkingBoy(ParkingBoy parkingBoy) {
        this.parkingBoy = parkingBoy;
    }
}
