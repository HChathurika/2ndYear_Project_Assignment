package Task6;

import java.util.*;

public class ArrivalProcess {
    private Random rng;
    private String eventType;

    public ArrivalProcess(String eventType) {
        this.rng = new Random();
        this.eventType = eventType;
    }


    public void generateEvents(List<Event> eventList, int n, int maxTime) {
        for (int i = 0; i < n; i++) {
            int arrivalTime = rng.nextInt(maxTime);
            eventList.add(new Event(arrivalTime, eventType));
        }
    }


    public static void main(String[] args) {
        List<Event> eventList = new ArrayList<>();
        ArrivalProcess arrivals = new ArrivalProcess("CustomerArrival");


        arrivals.generateEvents(eventList, 10, 50);

        System.out.println("Generated Events:");
        for (Event e : eventList) {
            System.out.println(e);
        }
    }
}

