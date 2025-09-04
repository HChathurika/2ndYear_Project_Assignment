package Task3;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String fuel;
    protected String color;

    public AbstractVehicle(String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
    }

    public void start() {
        System.out.println(getClass().getSimpleName() + " is starting...");
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + " is stopping...");
    }


    public abstract String getInfo();


    public void charge() {
        System.out.println(getClass().getSimpleName() + " cannot be charged.");
    }
}

