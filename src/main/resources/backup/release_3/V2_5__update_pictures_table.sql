ALTER TABLE reservation.pictures
    ADD CONSTRAINT FK_PICTURES_ON_APARTMENT FOREIGN KEY (apartment_id) REFERENCES reservation.apartments (id);

ALTER TABLE reservation.pictures
    ADD CONSTRAINT FK_PICTURES_ON_EMPLOYEE FOREIGN KEY (employee_id) REFERENCES reservation.employees (id);