package Task2;


public class Car extends AbstractVehicle {
    public Car() {
        super("Petrol", "Red");
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: Car\nFuel: " + fuel + "\nColor: " + color;
    }
}

