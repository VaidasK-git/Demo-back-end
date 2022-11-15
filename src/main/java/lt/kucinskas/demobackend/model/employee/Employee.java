package lt.kucinskas.demobackend.model.employee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lt.kucinskas.demobackend.model.picture.Picture;
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

    @Column(name = "squad_lead_id", columnDefinition = "INT NOT NULL")
    private Long squadLeadId;

    @Column(name = "phone_number", columnDefinition = "VARCHAR(50) NOT NULL")
    private String phoneNumber;

    @Column(name = "email", columnDefinition = "VARCHAR(50) NOT NULL")
    private String email;

    @Column(name = "employee_role")
    private String employeeRole;

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String updatedAt;

}
