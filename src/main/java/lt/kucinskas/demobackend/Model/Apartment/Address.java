package lt.kucinskas.demobackend.Model.Apartment;

public class Address {

    private String addressID;
    private String country;
    private String city;
    private Location location;


//    Constructors

    public Address(String addressID ,String country, String city, Location location) {
        this.addressID = addressID;
        this.country = country;
        this.city = city;
        this.location = location;
    }

    public Address() {
    }

    //    Getters and Setters

    public String getAddressID() {
        return addressID;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

//    Override

    @Override
    public String toString() {
        return "Address{" +
                "addressID='" + addressID + '\'' +
                ", country=" + country +
                ", city=" + city +
                ", location=" + location +
                '}';
    }

}
