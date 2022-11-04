package lt.kucinskas.demobackend.Model.Picture;

public class Picture {
    private String pictureId;
    private String url;

//    Constructor

    public Picture(String pictureId, String url) {
        this.pictureId = pictureId;
        this.url = url;
    }

//    Getters and Setters

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    Override

    @Override
    public String toString() {
        return "Picture{" +
                "pictureId='" + pictureId + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

}
