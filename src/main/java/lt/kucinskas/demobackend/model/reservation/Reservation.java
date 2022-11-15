package lt.kucinskas.demobackend.model.reservation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@Entity
@Table(name = "reservations", schema = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "employee_id", columnDefinition = "INT NOT NULL")
    private Long employeeId;

    @Column(name = "apartment_id", columnDefinition = "INT NOT NULL")
    private Long apartmentId;

    @Column(name = "reservation_start_date", columnDefinition = "VARCHAR(50) NOT NULL")
    private String reservationStartDate;

    @Column(name = "reservation_end_date", columnDefinition = "VARCHAR(50) NOT NULL")
    private String reservationEndDate;

    @Column(name = "reservation_status", columnDefinition = "NOT NULL")
    private String reservationStatus;

    @Column(name = "notes", columnDefinition = "VARCHAR(255) NOT NULL")
    private String notes;

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String updatedAt;

}
