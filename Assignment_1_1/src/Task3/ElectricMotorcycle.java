package Task3;

public class ElectricMotorcycle extends AbstractVehicle {
    private int batteryCapacity; // kWh

    public ElectricMotorcycle() {
        super("Electric", "Green");
        this.batteryCapacity = 20; // example
    }

    @Override
    public void charge() {
        System.out.println("Charging ElectricMotorcycle with battery capacity " + batteryCapacity + " kWh...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\nType: Electric Motorcycle\nColor: " + color + "\nBattery: " + batteryCapacity + " kWh";
    }
}

