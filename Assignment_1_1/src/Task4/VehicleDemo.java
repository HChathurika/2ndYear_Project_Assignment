package Task4;


public class VehicleDemo {
    public static void main(String[] args) {
        AbstractVehicle[] vehicles = {
                new Car(),
                new Motorcycle(),
                new Bus(),
                new ElectricCar(),
                new ElectricMotorcycle()
        };

        double totalEfficiency = 0;

        System.out.println("Vehicle Demonstration with Fuel Efficiency\n");

        for (AbstractVehicle v : vehicles) {
            v.start();
            v.stop();
            v.charge();
            System.out.println(v.getInfo() + "\n");
            totalEfficiency += v.calculateFuelEfficiency();
        }

        double averageEfficiency = totalEfficiency / vehicles.length;
        System.out.println("Average Fuel Efficiency of all vehicles: " + averageEfficiency);
    }
}

