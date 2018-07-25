package com.oocl.parking.beans;

public class Receipt {
    private int number;

    public Receipt() {
        number = this.hashCode();
    }

    public int getNumber() {
        return number;
    }
}
