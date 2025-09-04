package Task4;

public class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Gasoline", "Black", 60.0); // 60 mpg
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\nType: Motorcycle\nFuel: " + fuel + "\nColor: " + color +
                "\nFuel Efficiency: " + fuelEfficiency + " mpg";
    }
}


