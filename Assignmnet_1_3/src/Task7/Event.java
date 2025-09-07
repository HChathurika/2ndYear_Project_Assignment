package Task7;


public class Event {
    private int time;
    private String type;

    public Event(int time, String type) {
        this.time = time;
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Time: " + time + ", Type: " + type;
    }
}

