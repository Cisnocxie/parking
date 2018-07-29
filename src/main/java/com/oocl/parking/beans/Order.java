package com.oocl.parking.beans;

public class Order {
    private int id;
    private Receipt receipt;
    private Car car;
    private int parkingBoyId = -1;
    private boolean isCompleted = false;

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

    public void setId(int id) {
        this.id = id;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
