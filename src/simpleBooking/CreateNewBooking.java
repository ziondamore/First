package simpleBooking;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

class CreateNewBooking {
    public static void main(String[] args) {
        ArrayList<Passenger> listPassenger = new ArrayList<>();

        listPassenger.add(getPassenger("Garry", "Petr", 93, 8, 14));
        listPassenger.add(getPassenger("Ron", "Weasley", 89, 1, 11));
        listPassenger.add(getPassenger("Germiona", "Granger", 91, 11, 9));
        listPassenger.add(getPassenger("Lord", "Voland-De-Mor", 69, 9, 23));

        ArrayList<String> listSeat = new ArrayList<>();

        listSeat.add(0, "1A");
        listSeat.add(1, "2B");
        listSeat.add(2, "3C");
        listSeat.add(3, "4D");

        Flight flight = getFlight();
        ArrayList<Ticket> listTicket = new ArrayList<>();

        for (int i = 0; i < listPassenger.size(); i++) {
            listTicket.add(new Ticket(listPassenger.get(i), flight, listSeat.get(i)));
        }

        System.out.println(listTicket);
    }

    private static Passenger getPassenger(String name, String lastName, int year, int month, int day) {
        Date dateOfBirth = new Date(year, month, day);

        return new Passenger(name, lastName, dateOfBirth);
    }

    private static Flight getFlight() {
        Flight flight = new Flight(
                "1234H",
                new Timestamp(119, 7, 29, 12, 30, 0, 0),
                new Timestamp(119, 7, 29, 14, 30, 0, 0)
        );

        return flight;
    }
}


