package lt.kucinskas.demobackend.model.apartment;

import lombok.Data;
import lt.kucinskas.demobackend.model.picture.Picture;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "apartments")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    private List<Room> rooms = new ArrayList<>();

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    private List<Picture> pictures;

    @Column(name = "description")
    private String description;

    @CreatedDate
    @Column(name = "created_at")
    private String createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private String updatedAt;

}

