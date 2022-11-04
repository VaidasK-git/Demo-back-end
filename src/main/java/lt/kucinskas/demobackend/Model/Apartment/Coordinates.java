package lt.kucinskas.demobackend.Model.Apartment;

public class Coordinates {

    private String coordinatesId;
    private String latitude;
    private String longitude;

//    Constructors

    public Coordinates(String coordinatesId, String latitude, String longitude) {
        this.coordinatesId = coordinatesId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordinates() {
    }

    //    Getters and Setters

    public String getCoordinatesId() {
        return coordinatesId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

//    Override

    @Override
    public String toString() {
        return "Coordinates{" +
                "coordinatesId='" + coordinatesId + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
