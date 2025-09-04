package Task3;


public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus() {
        super("Diesel", "Yellow");
        this.capacity = 40;
    }

    @Override
    public String getInfo() {
        return "Bus Information:\nType: Bus\nFuel: " + fuel + "\nColor: " + color + "\nCapacity: " + capacity + " passengers";
    }
}

