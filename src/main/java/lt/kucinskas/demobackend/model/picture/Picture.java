package lt.kucinskas.demobackend.model.picture;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lt.kucinskas.demobackend.model.apartment.Apartment;
import lt.kucinskas.demobackend.model.employee.Employee;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@Entity
@Table(name = "pictures", schema = "reservation")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "url", columnDefinition = "VARCHAR(50) NOT NULL")
    private String url;

    @Enumerated(EnumType.STRING)
    @Column(name = "picture_role", columnDefinition = "NOT NULL")
    private PictureRole pictureRole;

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @ManyToOne
    private Apartment apartment;

    @OneToOne
    private Employee employee;

}
