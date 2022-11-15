package lt.kucinskas.demobackend.model.apartment;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="rooms", schema = "reservation")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name= "room_name", columnDefinition = "VARCHAR(50) NOT NULL")
    private String roomName;

    @OneToMany (mappedBy = "room", cascade = CascadeType.ALL)
    private List<Bed> beds = new ArrayList<>();

    @CreatedDate
    @Column(name = "created_at", columnDefinition ="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition ="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String updatedAt;

    @ManyToOne
    private Apartment apartment;

}
