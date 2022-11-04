package lt.kucinskas.demobackend.Model.Apartment;

public class Address {

    private String addressID;
    private String country;
    private String city;
    private String locationId;


//    Constructors

    public Address(String addressID ,String country, String city, String locationId) {
        this.addressID = addressID;
        this.country = country;
        this.city = city;
        this.locationId = locationId;
    }

    public Address() {
    }

    //    Getters and Setters

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    //    Override

    @Override
    public String toString() {
        return "Address{" +
                "addressID='" + addressID + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
