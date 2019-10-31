
public class Odometer {
    private double fuel_efficiency;
    private double miles;

    public Odometer() {
    }

    public Odometer(double fuel_efficiency, double miles) {
        this.fuel_efficiency = fuel_efficiency;
        this.miles = miles;
    }

    public void resetOdometer() {
        this.miles = 0;
        this.fuel_efficiency = 0;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    // miles per litter
    public void setFuelEfficency(double fuel) {
        this.fuel_efficiency = fuel;
    }

    public void milesDriven(double miles) {
        this.miles = miles;
    }

    public double numberOfGallons() {

        //According to US there is 3.78541 litters of fuel in one gallon
        return (this.miles / this.fuel_efficiency) / 3.78541;
    }

}
