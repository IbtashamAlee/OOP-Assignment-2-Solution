
public class Odometer {
    public double milage=0;
    public double fuel=0;
    public double efficiency;

    public void reset() {
        milage = 0;
        fuel = 0;
    }

    public double getFuel() {
        return fuel;
    }

    public void addMilage(double milage) {
        this.milage = this.milage+ milage;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }
}

