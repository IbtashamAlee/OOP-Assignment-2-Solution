package com.company;

public class CountedItem extends PurchaseItem {
    private int quantity;

    public CountedItem() {
    }

    public CountedItem(int quantity) {
        this.quantity = quantity;
    }

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return super.getName() + " @  " + super.getPrice() + "    " + quantity + "    " + getPrice();
    }
}
