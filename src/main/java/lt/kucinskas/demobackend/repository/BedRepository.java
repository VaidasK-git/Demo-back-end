package lt.kucinskas.demobackend.repository;

import lt.kucinskas.demobackend.model.apartment.Bed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BedRepository extends JpaRepository<Bed, Long> {
}