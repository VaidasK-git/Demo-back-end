package lt.kucinskas.demobackend.Model.Reservation;


import lt.kucinskas.demobackend.Model.Apartment.Apartment;
import lt.kucinskas.demobackend.Model.Date.Date;
import lt.kucinskas.demobackend.Model.Employee.Employee;
import lt.kucinskas.demobackend.Model.Employee.SquadLead;

public class Reservation {

    private String reservationId;
    private String employeeId;
    private String squadLeadId;
    private String dateId;
    private String apartmentId;
    private String reservationStatus;
    private String notes;


//    Constructors

    public Reservation(String reservationId, String employeeId, String squadLeadId, String dateId, String apartmentId, String reservationStatus, String notes) {
        this.reservationId = reservationId;
        this.employeeId = employeeId;
        this.squadLeadId = squadLeadId;
        this.dateId = dateId;
        this.apartmentId = apartmentId;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSquadLeadId() {
        return squadLeadId;
    }

    public void setSquadLeadId(String squadLeadId) {
        this.squadLeadId = squadLeadId;
    }

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
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
                ", employeeId='" + employeeId + '\'' +
                ", squadLeadId='" + squadLeadId + '\'' +
                ", dateId='" + dateId + '\'' +
                ", apartmentId='" + apartmentId + '\'' +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
