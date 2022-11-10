package lt.kucinskas.demobackend.repository;

import lt.kucinskas.demobackend.model.apartment.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}