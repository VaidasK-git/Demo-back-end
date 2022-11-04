package lt.kucinskas.demobackend.Model.Date;

public class Date {
    private String startDate;
    private String endDate;

//    Constructors

    public Date(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date() {
    }

//    Getters and Setters

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
