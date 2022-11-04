package lt.kucinskas.demobackend.Model.Reservation;


import lt.kucinskas.demobackend.Model.Apartment.Apartment;
import lt.kucinskas.demobackend.Model.Date.Date;
import lt.kucinskas.demobackend.Model.Employee.Employee;
import lt.kucinskas.demobackend.Model.Employee.SquadLead;

public class Reservation {

    private String reservationId;
    private Employee employee;
    private SquadLead squadLead;
    private Date reservationDate;
    private Apartment apartment;
    private ReservationStatus reservationStatus;
    private String notes;


//    Constructors

    public Reservation(String reservationId, Employee employee, SquadLead squadLead, Date reservationDate, Apartment apartment, ReservationStatus reservationStatus, String notes) {
        this.reservationId = reservationId;
        this.employee = employee;
        this.squadLead = squadLead;
        this.reservationDate = reservationDate;
        this.apartment = apartment;
        this.reservationStatus = reservationStatus;
        this.notes = notes;
    }

    public Reservation() {
    }

//    Getters and Setters

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public SquadLead getSquadLead() {
        return squadLead;
    }

    public void setSquadLead(SquadLead squadLead) {
        this.squadLead = squadLead;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    //    Override

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", employee=" + employee +
                ", squadLead=" + squadLead +
                ", reservationDate=" + reservationDate +
                ", apartment=" + apartment +
                '}';
    }

}
