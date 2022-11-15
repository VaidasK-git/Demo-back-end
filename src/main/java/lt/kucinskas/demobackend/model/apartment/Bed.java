package lt.kucinskas.demobackend.model.apartment;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@Data
@Entity
@Table(name="beds", schema = "reservation")
public class Bed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "bed_size")
    private BedSize bedSize;

    @CreatedDate
    @Column(name = "created_at")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private String updatedAt;

    @ManyToOne
    private Room room;

}
