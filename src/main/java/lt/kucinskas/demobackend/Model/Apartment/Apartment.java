package lt.kucinskas.demobackend.Model.Apartment;

import lt.kucinskas.demobackend.Model.Picture.Picture;

import java.util.ArrayList;

public class Apartment {

    private String apartmentId;
    private String addressID;
    private String coordinatesId;
    private String description;
    private boolean isApartmentBooked;

//    Constructors


    public Apartment(String apartmentId, String addressID, String coordinatesId, String description, boolean isApartmentBooked) {
        this.apartmentId = apartmentId;
        this.addressID = addressID;
        this.coordinatesId = coordinatesId;
        this.description = description;
        this.isApartmentBooked = isApartmentBooked;
    }

    public Apartment() {
    }

    //    Getters and Setters

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getCoordinatesId() {
        return coordinatesId;
    }

    public void setCoordinatesId(String coordinatesId) {
        this.coordinatesId = coordinatesId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isApartmentBooked() {
        return isApartmentBooked;
    }

    public void setApartmentBooked(boolean apartmentBooked) {
        isApartmentBooked = apartmentBooked;
    }

    //    Override

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentId='" + apartmentId + '\'' +
                ", addressID='" + addressID + '\'' +
                ", coordinatesId='" + coordinatesId + '\'' +
                ", description='" + description + '\'' +
                ", isApartmentBooked=" + isApartmentBooked +
                '}';
    }
}
