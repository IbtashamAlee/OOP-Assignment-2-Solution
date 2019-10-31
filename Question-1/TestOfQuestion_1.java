public class Main {

    public static void main(String[] args) {
        Odometer m1 = new Odometer();
        m1.resetOdometer();

        //Fuel Efficiency is equal to kilometers covered in per liter of fuel.
        m1.setFuelEfficency(30);
        //Miles as input
        m1.milesDriven(344.4);
        //As one gallon is equal to 3.7 litters of petrol according to US.
        System.out.println("Number of gallons consumed :" + m1.numberOfGallons());
        }
        }
