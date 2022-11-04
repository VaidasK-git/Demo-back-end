package lt.kucinskas.demobackend.Model.Employee;

public class SquadLead extends Employee{

    private boolean isSquadLead;

//    Constructors

    public SquadLead(String employeeId, String personId, String firstName, String lastName, String sex, String phoneNumber, String email, boolean isSquadLead) {
        super(employeeId, personId, firstName, lastName, sex, phoneNumber, email);
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
