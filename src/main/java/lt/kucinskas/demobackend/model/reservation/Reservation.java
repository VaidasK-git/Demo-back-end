package lt.kucinskas.demobackend.model.reservation;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lt.kucinskas.demobackend.model.apartment.Apartment;
import lt.kucinskas.demobackend.model.employee.Employee;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@Entity
@Table(name = "reservations", schema = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Employee employeeId;

    @OneToOne(cascade = CascadeType.ALL)
    private Apartment apartmentId;

    @Column(name = "reservation_start_date", columnDefinition = "VARCHAR(50) NOT NULL")
    private String reservationStartDate;

    @Column(name = "reservation_end_date", columnDefinition = "VARCHAR(50) NOT NULL")
    private String reservationEndDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "reservation_status", columnDefinition = "NOT NULL")
    private ReservationStatus reservationStatus;

    @Column(name = "notes", columnDefinition = "VARCHAR(255) NOT NULL")
    private String notes;

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

}
