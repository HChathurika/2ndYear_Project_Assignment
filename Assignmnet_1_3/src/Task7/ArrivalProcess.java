package Task7;


import java.util.*;

public class ArrivalProcess {
    private Random rng;
    private String eventType;

    public ArrivalProcess(String eventType) {
        rng = new Random();
        this.eventType = eventType;
    }

    public void generateEvents(EventList eventList, int n, int maxTime) {
        for (int i = 0; i < n; i++) {
            int arrivalTime = rng.nextInt(maxTime);
            eventList.addEvent(new Event(arrivalTime, eventType));
        }
    }
}

