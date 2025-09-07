package Task2;


public class Event implements Comparable<Event> {
    private double time;

    public Event(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    @Override
    public int compareTo(Event other) {
        // smaller time = earlier event
        return Double.compare(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Event at time " + time;
    }
}

