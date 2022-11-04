package lt.kucinskas.demobackend.Model.Employee;

public class Employee extends Person {

    private String employeeId;


    //    Constructors
    public Employee(String employeeId, String personId, String firstName, String lastName, String sex, String phoneNumber, String email) {
        super(personId, firstName, lastName, sex, phoneNumber, email);
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
