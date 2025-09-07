package Task5;

public class ClockTest {
    public static void main(String[] args) {

        Clock clock1 = Clock.getInstance();
        clock1.setTime(10);

        System.out.println("Time from clock1: " + clock1.getTime());


        Clock clock2 = Clock.getInstance();
        System.out.println("Time from clock2: " + clock2.getTime());


        clock2.setTime(25);
        System.out.println("Time after update from clock2:");
        System.out.println("Time from clock1: " + clock1.getTime());
        System.out.println("Time from clock2: " + clock2.getTime());
    }
}


