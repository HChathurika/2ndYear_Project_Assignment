package Task7;


import java.util.*;

public class EventList {
    private List<Event> events;

    public EventList() {
        events = new ArrayList<>();
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    public List<Event> getEvents() {
        return events;
    }

    public void printEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }
}

