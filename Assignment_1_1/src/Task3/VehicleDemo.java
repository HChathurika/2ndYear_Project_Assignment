package Task3;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration with Electric Vehicles\n");

        AbstractVehicle car = new Car();
        car.start();
        car.stop();
        car.charge();
        System.out.println(car.getInfo() + "\n");

        AbstractVehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        System.out.println(motorcycle.getInfo() + "\n");

        AbstractVehicle bus = new Bus();
        bus.start();
        bus.stop();
        bus.charge();
        System.out.println(bus.getInfo() + "\n");

        AbstractVehicle eCar = new ElectricCar();
        eCar.start();
        eCar.stop();
        eCar.charge();
        System.out.println(eCar.getInfo() + "\n");

        AbstractVehicle eMotorcycle = new ElectricMotorcycle();
        eMotorcycle.start();
        eMotorcycle.stop();
        eMotorcycle.charge();
        System.out.println(eMotorcycle.getInfo() + "\n");
    }
}
