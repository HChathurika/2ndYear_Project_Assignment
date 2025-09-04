package Task4;


public class Car extends AbstractVehicle {


    public Car() {
        super("Petrol", "Red", 25.0); // Fuel type, Color, Fuel Efficiency (mpg)
    }


    @Override
    public String getInfo() {
        return "Car Information:\n"
                + "Type: Car\n"
                + "Fuel: " + fuel + "\n"
                + "Color: " + color + "\n"
                + "Fuel Efficiency: " + fuelEfficiency + " mpg";
    }
}

