ALTER TABLE reservation.beds
    ADD CONSTRAINT FK_BEDS_ON_ROOM FOREIGN KEY (room_id) REFERENCES reservation.rooms (id);