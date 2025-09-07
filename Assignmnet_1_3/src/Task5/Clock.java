package Task5;


public class Clock {
    private static Clock instance = null;
    private int time = 0;


    private Clock() {}


    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }


    public void setTime(int newTime) {
        time = newTime;
    }


    public int getTime() {
        return time;
    }
}

