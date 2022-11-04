package lt.kucinskas.demobackend.Model.Apartment;

import java.util.ArrayList;

public class Room implements Methods {
    private String roomId;
    private ArrayList<Bed> beds;
    private int numberOfBeds;
    private int numberOfFreeBeds;
    private boolean isRoomBooked;

//    Constructors

    public Room(String roomId) {
        this.roomId = roomId;
        this.beds = new ArrayList<>();
    }

    public Room() {
    }

//    Getters and Setters

    public String getRoomId() {
        return roomId;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfFreeBeds() {
        return numberOfFreeBeds;
    }

    public void setNumberOfFreeBeds(int numberOfFreeBeds) {
        this.numberOfFreeBeds = numberOfFreeBeds;
    }

    public boolean isRoomBooked() {
        return isRoomBooked;
    }

    public void setRoomBooked(boolean isRoomBooked) {
        this.isRoomBooked = isRoomBooked;
    }

    public ArrayList<Bed> getBeds() {
        return beds;
    }

    public void setBeds(ArrayList<Bed> beds) {
        this.beds = beds;
    }

//    Methods

    public void add(Bed bed) {
        beds.add(bed);
    }

    public int count(){
        return getBeds().size();

    }

    public int countFree(){
        int count = 0;
        for (int i = 0; i < getBeds().size(); i++){
            if(!getBeds().get(i).isBedBooked()){
                count += 1;
            }
        }
        return count;
    }

    public boolean isBooked(){
       if(getNumberOfFreeBeds() > 0) {
           return false;
       }
       return true;
    }

//    Override

    @Override
    public String toString() {
        return "Room with ID: " + roomId + " has " + numberOfBeds + " beds, " + numberOfFreeBeds + " of them is free. Room is booked: " + isRoomBooked + ". " + beds +".";
    }

}
