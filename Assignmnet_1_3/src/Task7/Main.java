package Task7;

public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        clock.setTime(0);

        EventList eventList = new EventList();
        ArrivalProcess arrivals = new ArrivalProcess("ARRIVAL");
        arrivals.generateEvents(eventList, 10, 50);

        System.out.println("Generated Events:");
        eventList.printEvents();


        ServicePoint sp = new ServicePoint();
        for (Event e : eventList.getEvents()) {
            Customer c = new Customer(e.getTime());
            sp.addCustomer(c);
        }


        clock.setTime(clock.getTime() + 5);
        System.out.println("\nClock after moving 5 units: " + clock.getTime() + "\n");


        sp.processCustomers();

        System.out.println("\nFinal clock time: " + clock.getTime());
    }
}

