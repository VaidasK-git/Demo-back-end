package lt.kucinskas.demobackend.Model.Employee;

import lt.kucinskas.demobackend.Model.Picture.Picture;

public class Administrator extends Employee{

    private boolean isAdministrator;

    //    Constructors

    public Administrator(String personId, String firstName, String lastName, String sex, Picture picture, String phoneNumber, String email, String employeeId, boolean isAdministrator) {
        super(personId, firstName, lastName, sex, picture, phoneNumber, email, employeeId);
        this.isAdministrator = isAdministrator;
    }

    public Administrator(String employeeId, boolean isAdministrator) {
        super(employeeId);
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
