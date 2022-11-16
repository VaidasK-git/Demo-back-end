ALTER TABLE reservation.employees
    ADD CONSTRAINT FK_EMPLOYEES_ON_PICTURE FOREIGN KEY (picture_id) REFERENCES reservation.pictures (id);