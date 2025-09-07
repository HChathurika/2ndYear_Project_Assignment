package Task7;

public class Customer {
    private int arrivalTime;
    private int departureTime;

    public Customer(int arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = -1; // Not yet served
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Customer [arrival=" + arrivalTime + ", departure=" + departureTime + "]";
    }
}


