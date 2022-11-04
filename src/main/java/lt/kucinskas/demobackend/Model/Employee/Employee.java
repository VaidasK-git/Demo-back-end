package lt.kucinskas.demobackend.Model.Employee;

import lt.kucinskas.demobackend.Model.Picture.Picture;

public class Employee extends Person {

    private String employeeId;


    //    Constructors

    public Employee(String personId, String firstName, String lastName, String sex, Picture picture, String phoneNumber, String email, String employeeId) {
        super(personId, firstName, lastName, sex, picture, phoneNumber, email);
        this.employeeId = employeeId;
    }

    public Employee(String employeeId) {
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
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }
}
