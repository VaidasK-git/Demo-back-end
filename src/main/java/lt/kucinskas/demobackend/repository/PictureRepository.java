package lt.kucinskas.demobackend.repository;

import lt.kucinskas.demobackend.model.picture.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}