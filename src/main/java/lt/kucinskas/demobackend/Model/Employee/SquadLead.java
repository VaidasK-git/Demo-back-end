package lt.kucinskas.demobackend.Model.Employee;

import lt.kucinskas.demobackend.Model.Picture.Picture;

public class SquadLead extends Employee{

    private boolean isSquadLead;

//    Constructors

    public SquadLead(String personId, String firstName, String lastName, String sex, Picture picture, String phoneNumber, String email, String employeeId, boolean isSquadLead) {
        super(personId, firstName, lastName, sex, picture, phoneNumber, email, employeeId);
        this.isSquadLead = isSquadLead;
    }

    public SquadLead(String employeeId, boolean isSquadLead) {
        super(employeeId);
        this.isSquadLead = isSquadLead;
    }


//    Getters and Setters

    public boolean isSquadLead() {
        return isSquadLead;
    }

    public void setSquadLead(boolean squadLead) {
        isSquadLead = squadLead;
    }

//    Override

    @Override
    public String toString() {
        return "SquadLead{" +
                "isSquadLead=" + isSquadLead +
                '}';
    }

}
