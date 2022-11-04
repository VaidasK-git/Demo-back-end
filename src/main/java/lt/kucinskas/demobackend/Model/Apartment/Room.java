package lt.kucinskas.demobackend.Model.Apartment;

import java.util.ArrayList;

public class Room {

    private String roomId;
    private String apartmentID;
    private boolean isRoomBooked;


//    Constructors

    public Room(String apartmentID, String roomId) {
        this.apartmentID = apartmentID;
        this.roomId = roomId;
    }

    public Room() {
    }

//    Getters and Setters

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isRoomBooked() {
        return isRoomBooked;
    }

    public void setRoomBooked(boolean roomBooked) {
        isRoomBooked = roomBooked;
    }


//    Override

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", apartmentID='" + apartmentID + '\'' +
                ", isRoomBooked=" + isRoomBooked +
                '}';
    }

}
