package Task4;


public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String fuel;
    protected String color;
    protected double fuelEfficiency; // <- must be declared

    public AbstractVehicle(String fuel, String color, double fuelEfficiency) {
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void start() {
        System.out.println(getClass().getSimpleName() + " is starting...");
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + " is stopping...");
    }

    // subclasses must implement
    public abstract String getInfo();


    public void charge() {
        System.out.println(getClass().getSimpleName() + " cannot be charged.");
    }


    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
