package Task3;


public class TestEventSimulation {
    public static void main(String[] args) {
        EventList eventList = new EventList();


        eventList.addEvent(new Event(5.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(2.0, EventType.EXIT));
        eventList.addEvent(new Event(8.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(3.0, EventType.ARRIVAL));

        System.out.println("All events in order:");
        eventList.printEvents();

        System.out.println("\nNext event to process:");
        Event next = eventList.getNextEvent();
        System.out.println(next);

        System.out.println("\nRemaining events in order:");
        eventList.printEvents();
    }
}

