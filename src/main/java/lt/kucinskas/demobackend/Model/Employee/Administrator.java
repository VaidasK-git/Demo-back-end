package lt.kucinskas.demobackend.Model.Employee;

public class Administrator extends Employee{

    private boolean isAdministrator;

    //    Constructors

    public Administrator(String employeeId, String personId, String firstName, String lastName, String sex, String phoneNumber, String email, boolean isAdministrator) {
        super(employeeId, personId, firstName, lastName, sex, phoneNumber, email);
        this.isAdministrator = isAdministrator;
    }

//    Getters and Setters


    public boolean isAdministrator() {
        return isAdministrator;
    }

    public void setAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }

//    Override

    @Override
    public String toString() {
        return "Administrator{" +
                "isAdministrator=" + isAdministrator +
                '}';
    }

}
