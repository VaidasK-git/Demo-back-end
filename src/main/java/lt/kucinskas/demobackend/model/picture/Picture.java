package lt.kucinskas.demobackend.model.picture;

import lombok.Data;
import lt.kucinskas.demobackend.model.apartment.Apartment;
import lt.kucinskas.demobackend.model.employee.Employee;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@Data
@Entity
@Table(name="pictures", schema = "reservation")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="url")
    private String url;

    @Column(name = "picture_role")
    private PictureRole pictureRole;

    @CreatedDate
    @Column(name = "created_at")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private String updatedAt;

    @ManyToOne
    private Apartment apartment;

    @OneToOne
    private Employee employee;

}
