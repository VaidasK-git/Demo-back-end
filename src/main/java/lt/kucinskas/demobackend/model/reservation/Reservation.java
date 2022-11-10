package lt.kucinskas.demobackend.model.reservation;



import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@Data
@Entity(name="reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "apartment_id")
    private Long apartmentId;

    @Column(name = "reservation_start_date")
    private String reservationStartDate;

    @Column(name = "reservation_end_date")
    private String reservationEndDate;

    @Column(name = "reservation_status")
    private String reservationStatus;

    @Column(name = "notes")
    private String notes;

    @CreatedDate
    @Column(name = "created_at")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private String updatedAt;

}
