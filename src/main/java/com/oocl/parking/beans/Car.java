package com.oocl.parking.beans;

public class Car {
    private String plateNum;

    public Car(String plateNum) {
        this.plateNum = plateNum;
    }

    public Car() {

    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }
}
