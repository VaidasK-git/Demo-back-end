package lt.kucinskas.demobackend.model.employee;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import lombok.Data;
import lt.kucinskas.demobackend.model.picture.Picture;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees", schema = "reservation")
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "sex")
    private String sex;

    @OneToOne(cascade = CascadeType.ALL)
    private Picture picture;

    @Column(name = "squad_lead_id")
    private Long squadLeadId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "employee_role")
    private String employeeRole;

    @CreatedDate
    @Column(name = "created_at")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private String updatedAt;

}
