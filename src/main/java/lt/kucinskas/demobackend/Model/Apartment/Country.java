package lt.kucinskas.demobackend.Model.Apartment;

public enum Country {

    CAN("Canada"),
    GBR("United Kingdom"),
    LTU("Lithuania"),
    POL("Poland"),
    USA("United States of America");

    private final String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}


