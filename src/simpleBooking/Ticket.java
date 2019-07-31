package simpleBooking;

class Ticket {
    private int passengerNameRecordNumber;
    private Passenger passenger;
    private Flight flight;
    private String seat;

    public Ticket(Passenger passenger, Flight flight, String seat) {
        this.passengerNameRecordNumber = getPassengerNameRecordNumber();
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
    }



    private int getPassengerNameRecordNumber(){
        return this.hashCode();
    }

    @Override
    public String toString() {
        return "Ticket\n" +
                "PNR Number: " + passengerNameRecordNumber + "\n \n" +
                "Passenger: \n" + passenger + "\n \n" +
                "Flight: " + flight + "\n \n" +
                "Seat: " + seat + "\n \n \n";
    }
}
