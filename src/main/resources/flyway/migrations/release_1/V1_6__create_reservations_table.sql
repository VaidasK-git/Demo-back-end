CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.reservations
(
    id                     BIGINT NOT NULL,
    employee_id            BIGINT,
    apartment_id           BIGINT,
    reservation_start_date VARCHAR(255),
    reservation_end_date   VARCHAR(255),
    reservation_status     VARCHAR(255),
    notes                  VARCHAR(255),
    created_at             VARCHAR(255),
    updated_at             VARCHAR(255),
    CONSTRAINT pk_reservations PRIMARY KEY (id)
);