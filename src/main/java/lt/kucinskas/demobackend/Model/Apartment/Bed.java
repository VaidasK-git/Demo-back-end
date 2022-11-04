package lt.kucinskas.demobackend.Model.Apartment;

import lt.kucinskas.demobackend.Model.Date.Date;

import java.util.ArrayList;

public class Bed {
    private String bedId;
    private String roomID;
    private String dateId;
    private boolean isBedBooked;

    //    Constructors

    public Bed(String bedId, String roomID, String dateId, boolean isBedBooked) {
        this.bedId = bedId;
        this.roomID = roomID;
        this.dateId = dateId;
        this.isBedBooked = isBedBooked;
    }

    public Bed() {
    }

//    Getters and Setters

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public boolean isBedBooked() {
        return isBedBooked;
    }

    public void setBedBooked(boolean bedBooked) {
        isBedBooked = bedBooked;
    }


//    Override

    @Override
    public String toString() {
        return "Bed{" +
                "bedId='" + bedId + '\'' +
                ", dateId='" + dateId + '\'' +
                ", isBedBooked=" + isBedBooked +
                '}';
    }
}
