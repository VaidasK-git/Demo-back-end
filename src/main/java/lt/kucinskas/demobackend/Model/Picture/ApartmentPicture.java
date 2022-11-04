package lt.kucinskas.demobackend.Model.Picture;

public class ApartmentPicture extends Picture{

    private String apartmentId;

//    Constructor

    public ApartmentPicture(String pictureId, String url, String apartmentId) {
        super(pictureId, url);
        this.apartmentId = apartmentId;
    }

//    Getters and Setters

    public String getApartmentId() {
        return apartmentId;
    }

    @Override
    public String toString() {
        return "ApartmentPicture{" +
                "apartmentId='" + apartmentId + '\'' +
                '}';
    }

}
