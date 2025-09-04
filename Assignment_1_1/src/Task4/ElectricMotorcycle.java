package Task4;

public class ElectricMotorcycle extends AbstractVehicle {
    private int batteryCapacity; // kWh

    public ElectricMotorcycle() {
        super("Electric", "Green", 2.0); // 2 kWh/km
        this.batteryCapacity = 20;
    }

    @Override
    public void charge() {
        System.out.println("Charging ElectricMotorcycle with battery capacity " + batteryCapacity + " kWh...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\nType: Electric Motorcycle\nColor: " + color +
                "\nBattery: " + batteryCapacity + " kWh\nFuel Efficiency: " + fuelEfficiency + " kWh/km";
    }
}


