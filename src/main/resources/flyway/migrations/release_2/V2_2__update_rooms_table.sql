ALTER TABLE reservation.rooms
    ADD CONSTRAINT FK_ROOMS_ON_APARTMENT FOREIGN KEY (apartment_id) REFERENCES reservation.apartments (id);