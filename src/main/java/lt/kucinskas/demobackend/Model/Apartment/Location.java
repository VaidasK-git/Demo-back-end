package lt.kucinskas.demobackend.Model.Apartment;

public class Location {
    private String locationId;
    private String streetName;
    private String houseNumberAndFlatNumber;
    private String zipCode;

//    Constructors

    public Location(String locationId, String streetName, String houseNumberAndFlatNumber, String zipCode) {
        this.locationId = locationId;
        this.streetName = streetName;
        this.houseNumberAndFlatNumber = houseNumberAndFlatNumber;
        this.zipCode = zipCode;
    }

    public Location() {
    }

    //    Getters and Setters

    public String getLocationId() {
        return locationId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumberAndFlatNumber() {
        return houseNumberAndFlatNumber;
    }

    public void setHouseNumberAndFlatNumber(String houseNumberAndFlatNumber) {
        this.houseNumberAndFlatNumber = houseNumberAndFlatNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

//    Override

    @Override
    public String toString() {
        return "Location{" +
                "locationId='" + locationId + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumberAndFlatNumber='" + houseNumberAndFlatNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
