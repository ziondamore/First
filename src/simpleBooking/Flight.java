package simpleBooking;

import java.sql.Timestamp;

class Flight {
    private String flightNumber;
    private Timestamp arrivalTime;
    private Timestamp departureTime;

    public Flight(String flightNumber, Timestamp arrivalTime, Timestamp departureTime) {
        this.flightNumber = flightNumber;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return  "Flight Number: " + flightNumber + "\n" +
                "Arrival Time: " + arrivalTime+ "\n" +
                "Departure Time: " + departureTime;
    }
}









