package lt.kucinskas.demobackend.model.employee;

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
import lt.kucinskas.demobackend.model.picture.Picture;
import lt.kucinskas.demobackend.model.reservation.Reservation;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


@Data
@Entity
@Table(name = "employees", schema = "reservation")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", columnDefinition = "VARCHAR(50) NOT NULL")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "VARCHAR(50) NOT NULL")
    private String lastName;

    @Column(name = "sex", columnDefinition = "VARCHAR(50) NOT NULL")
    private String sex;

    @OneToOne(cascade = CascadeType.ALL)
    private Picture picture;

    @Column(name = "squad_lead_id", columnDefinition = "BIGINT NOT NULL")
    private Long squadLeadId;

    @Column(name = "phone_number", columnDefinition = "VARCHAR(50) NOT NULL")
    private String phoneNumber;

    @Column(name = "email", columnDefinition = "VARCHAR(50) NOT NULL")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "employee_role", columnDefinition = "NOT NULL")
    private EmployeeRoles employeeRoles;

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @OneToOne
    private Reservation reservation;

}
