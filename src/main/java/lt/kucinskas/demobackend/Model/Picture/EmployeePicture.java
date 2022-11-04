package lt.kucinskas.demobackend.Model.Picture;

public class EmployeePicture extends Picture{

    private String employeeId;

//    Constructor

    public EmployeePicture(String pictureId, String url, String employeeId) {
        super(pictureId, url);
        this.employeeId = employeeId;
    }


//    Getters and Setters

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

//    Override
    @Override
    public String toString() {
        return "EmployeePicture{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }

}
