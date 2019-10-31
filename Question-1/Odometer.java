package com.company;

public class Odometer {
    private double fuel;
    private double miles;

    public Odometer() {
    }

    public Odometer(double fuel, double miles) {
        this.fuel = fuel;
        this.miles = miles;
    }

    public void resetOdometer() {
        this.miles = 0;
        this.fuel = 0;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
    public void setFuelEfficency(double fuel) {
        this.fuel = fuel;
    }

    public void milesDriven(double miles) {
        this.miles = miles;
    }

    public double numberOfGallons() {

        //3.78541 litters of fuel in one gallon
        return (this.miles / this.fuel) / 3.78541;
    }

}
