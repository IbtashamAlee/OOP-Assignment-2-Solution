package com.company;

public class WeighedItem extends PurchaseItem {
    private double weight;

    public WeighedItem() {
        super();
        this.weight = 0.0;
    }

    public WeighedItem(double weight) {
        this.weight = weight;
    }

    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * weight;
    }

    @Override
    public String toString() {
        return super.getName() + " @  " + super.getPrice() + "    " + weight + "    " + getPrice() + " (In case of Weighed Item)";
    }
}
