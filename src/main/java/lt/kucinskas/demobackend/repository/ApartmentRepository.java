package lt.kucinskas.demobackend.repository;

import lt.kucinskas.demobackend.model.apartment.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}