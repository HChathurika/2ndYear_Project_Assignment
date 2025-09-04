package Task3;


public class Motorcycle extends AbstractVehicle {
    public Motorcycle() {
        super("Gasoline", "Black");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\nType: Motorcycle\nFuel: " + fuel + "\nColor: " + color;
    }
}
