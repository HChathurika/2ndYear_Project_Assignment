package Task4;

public class ElectricCar extends AbstractVehicle {
    private int batteryCapacity; // kWh


    public ElectricCar() {
        super("Electric", "Blue", 4.0); // fuel, color, efficiency (kWh/km)
        this.batteryCapacity = 75;
    }

    public ElectricCar(String color, int batteryCapacity, double efficiencyKWhPerKm) {
        super("Electric", color, efficiencyKWhPerKm);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void charge() {
        System.out.println("Charging ElectricCar with battery capacity " + batteryCapacity + " kWh...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\n"
                + "Type: Electric Car\n"
                + "Color: " + color + "\n"
                + "Battery: " + batteryCapacity + " kWh\n"
                + "Fuel Efficiency: " + fuelEfficiency + " kWh/km";
    }
}
