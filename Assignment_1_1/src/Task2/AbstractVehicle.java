package Task2;


public abstract class AbstractVehicle implements Vehicle {
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
}
