package simpleBooking;

import java.util.*;

class Passenger {
    private String name;
    private String lastName;
    private Date dateOfBirth;

    public Passenger(String name, String lastName, Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Last Name: " + lastName + "\n" +
                "Date of Birth: " + dateOfBirth;
    }
}