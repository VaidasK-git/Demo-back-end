package lt.kucinskas.demobackend.repository;

import lt.kucinskas.demobackend.model.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}