package lt.kucinskas.demobackend.Model.Apartment;

import Model.Date.Date;

import java.util.ArrayList;

public class Bed {
    private String bedId;
    private ArrayList<Date> reservationDates;
    private boolean isBedBooked;

    //    Constructors

    public Bed(String bedId) {
        this.bedId = bedId;
        this.reservationDates = new ArrayList<>();
    }

    public Bed() {
    }

    //    Getters and Setters

    public String getBedId() {
        return bedId;
    }

    public boolean isBedBooked() {
        return isBedBooked;
    }

    public void setBedBooked(boolean bedBooked) {
        this.isBedBooked = bedBooked;
    }

//    Methods

    public void add(Date date) {
        reservationDates.add(date);
    }

//    Override

    @Override
    public String toString() {
        return "Bed with Id: " + bedId + " is booked: " + isBedBooked +". Booked: " + reservationDates + ".";
    }


}
