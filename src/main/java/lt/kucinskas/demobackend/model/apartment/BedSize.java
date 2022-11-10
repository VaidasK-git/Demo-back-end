package lt.kucinskas.demobackend.model.apartment;

public enum BedSize {

    TWIN ("Twin"),
    TWIN_XL ("Twin XL"),
    FULL ("Full"),
    QUEEN ("Queen"),
    KING ("King"),
    CALIFORNIA_KING ("California King");

    private final String bedSizeName;

    BedSize(String bedSizeName) {
        this.bedSizeName = bedSizeName;
    }

    public String getBedSizeName() {
        return bedSizeName;
    }

}
