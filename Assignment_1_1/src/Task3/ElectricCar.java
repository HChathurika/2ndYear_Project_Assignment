package Task3;

public class ElectricCar extends AbstractVehicle {
    private int batteryCapacity; // kWh

    public ElectricCar() {
        super("Electric", "Blue");
        this.batteryCapacity = 75; // example
    }

    @Override
    public void charge() {
        System.out.println("Charging ElectricCar with battery capacity " + batteryCapacity + " kWh...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\nType: Electric Car\nColor: " + color + "\nBattery: " + batteryCapacity + " kWh";
    }
}

