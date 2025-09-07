package Task2;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> queue;

    public EventList() {
        queue = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        queue.add(event);
    }

    public Event getNextEvent() {
        return queue.poll();  // removes and returns earliest event
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }


    public void printEvents() {
        PriorityQueue<Event> copy = new PriorityQueue<>(queue);
        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}
