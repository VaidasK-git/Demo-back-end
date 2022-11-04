package lt.kucinskas.demobackend.Model.Date;

public class Date {

    private String dateId;
    private String startDate;
    private String endDate;

//    Constructors

    public Date(String dateId, String startDate, String endDate) {
        this.dateId = dateId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date() {
    }

//    Getters and Setters

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

//    Override

    @Override
    public String toString() {
        return "Start date is: " + startDate + ", End date: " + endDate + ".";
    }

}
