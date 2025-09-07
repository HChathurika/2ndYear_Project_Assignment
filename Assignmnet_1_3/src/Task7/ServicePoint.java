package Task7;

import java.util.*;

public class ServicePoint {
    private Queue<Customer> queue;

    public ServicePoint() {
        queue = new LinkedList<>();
    }

    public void addCustomer(Customer c) {
        queue.add(c);
    }

    public void processCustomers() {
        Clock clock = Clock.getInstance();
        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            // For simplicity, service takes 1 time unit per customer
            c.setDepartureTime(clock.getTime() + 1);
            System.out.println(c);
            clock.setTime(clock.getTime() + 1); // move clock forward
        }
    }
}
