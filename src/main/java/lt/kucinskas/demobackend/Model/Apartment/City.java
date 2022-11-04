package lt.kucinskas.demobackend.Model.Apartment;

public enum City {

    CHI ("Chicago"),
    KNS ("Kaunas"),
    KLP ("Klaipeda"),
    LON ("London"),
    NYC ("New York"),
    TOR ("Toronto"),
    VLN ("Vilnius"),
    WAW ("Warsaw");

    private final String cityName;

    City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

}
