package lt.kucinskas.demobackend.model.apartment;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lt.kucinskas.demobackend.model.picture.Picture;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@Entity
@Table(name = "apartments", schema = "reservation")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "country", columnDefinition = "VARCHAR(50) NOT NULL")
    private String country;

    @Column(name = "city", columnDefinition = "VARCHAR(50) NOT NULL")
    private String city;

    @Column(name = "street_name", columnDefinition = "VARCHAR(50) NOT NULL")
    private String streetName;

    @Column(name = "house_number", columnDefinition = "VARCHAR(50) NOT NULL")
    private String houseNumber;

    @Column(name = "flat_number", columnDefinition = "VARCHAR(50) NOT NULL")
    private String flatNumber;

    @Column(name = "zip_code", columnDefinition = "VARCHAR(50) NOT NULL")
    private String zipCode;

    @Column(name = "latitude", columnDefinition = "VARCHAR(50) NOT NULL")
    private String latitude;

    @Column(name = "longitude", columnDefinition = "VARCHAR(50) NOT NULL")
    private String longitude;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    @Column(name = "rooms")
    private List<Room> rooms = new ArrayList<>();

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    @Column(name = "pictures")
    private List<Picture> pictures;

    @Column(name = "description", columnDefinition = "VARCHAR(50) NOT NULL")
    private String description;

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private String updatedAt;

}

