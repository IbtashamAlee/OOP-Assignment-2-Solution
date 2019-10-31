package com.company;

public class PurchaseItem {
    private String name;
    private double unitPrice;

    public PurchaseItem() {

    }

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "PurchaseItem{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

