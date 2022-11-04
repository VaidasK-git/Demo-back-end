package lt.kucinskas.demobackend.Model.Apartment;

import java.util.ArrayList;

public class Apartment implements Methods {

    private String apartmentId;
    private Address address;
    private Coordinates coordinates;
    private ArrayList<Room> rooms;

    private int numberOfRooms;
    private int numberOfFreeRooms;
    private int numberOfBeds;
    private int numberOfFreeBeds;
    private boolean isApartmentBooked;

//    Constructors

    public Apartment(String apartmentId, Address address, Coordinates coordinates) {
        this.apartmentId = apartmentId;
        this.address = address;
        this.coordinates = coordinates;
        this.rooms = new ArrayList<>();
    }

    public Apartment() {
    }

    //    Getters and Setters

    public String getApartmentId() {
        return apartmentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfFreeRooms() {
        return numberOfFreeRooms;
    }

    public void setNumberOfFreeRooms(int numberOfFreeRooms) {
        this.numberOfFreeRooms = numberOfFreeRooms;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = countBeds();
    }

    public int getNumberOfFreeBeds() {
        return numberOfFreeBeds;
    }

    public void setNumberOfFreeBeds(int numberOfFreeBeds) {
        this.numberOfFreeBeds = countFreeBeds();
    }

    public boolean isApartmentBooked() {
        return isApartmentBooked;
    }

    public void setApartmentBooked(boolean isApartmentBooked) {
        this.isApartmentBooked = isApartmentBooked;
    }


//    Methods

    public void add(Room room) {
        rooms.add(room);
    }

    public int count(){
        return getRooms().size();
    }

    public int countBeds(){
        int count = 0;
        for (int i = 0; i < getRooms().size(); i++){
            count += getRooms().get(i).getNumberOfBeds();
        }
        return count;
    }

    public int countFree(){
        int count = 0;
        for (int i = 0; i < getRooms().size(); i++){
            if(!getRooms().get(i).isRoomBooked()){
                count += 1;
            }
        }
        return count;
    }

    public int countFreeBeds(){
        int count = 0;
        for (int i = 0; i < getRooms().size(); i++){
            count += getRooms().get(i).getNumberOfFreeBeds();
        }
        return count;
    }

    public boolean isBooked(){
        if(getNumberOfFreeRooms() > 0) {
            return false;
        }
        return true;
    }

    //    Override

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentId='" + apartmentId + '\'' +
                ", address=" + address +
                ", coordinates=" + coordinates +
                ", rooms=" + rooms +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfFreeRooms=" + numberOfFreeRooms +
                ", numberOfBeds=" + numberOfBeds +
                ", numberOfFreeBeds=" + numberOfFreeBeds +
                ", isApartmentBooked=" + isApartmentBooked +
                '}';
    }
}
