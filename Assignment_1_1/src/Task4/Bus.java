package Task4;

public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus() {
        super("Diesel", "Yellow", 8.0); // 8 mpg
        this.capacity = 40;
    }

    @Override
    public String getInfo() {
        return "Bus Information:\nType: Bus\nFuel: " + fuel + "\nColor: " + color +
                "\nCapacity: " + capacity + " passengers\nFuel Efficiency: " + fuelEfficiency + " mpg";
    }
}


