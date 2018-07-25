package com.oocl.parking.beans;

public class Order {
    private int id;
    private int receiptId;

    public Order(int receiptId) {
        id = this.hashCode();
        this.receiptId = receiptId;
    }

    public int getId() {
        return id;
    }

    public int getReceiptId() {
        return receiptId;
    }
}
