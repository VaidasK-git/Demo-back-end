CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TYPE reservationStatus AS ENUM ('PENDING', 'ACCEPTED', 'DENIED', 'CANCELLED');

CREATE TABLE reservation.reservations
(
    id                     BIGSERIAL NOT NULL,
    employee_id            BIGINT      NOT NULL,
    apartment_id           BIGINT       NOT NULL,
    reservation_start_date VARCHAR(50)  NOT NULL,
    reservation_end_date   VARCHAR(50)  NOT NULL,
    reservation_status     reservationStatus       NOT NULL,
    notes                  VARCHAR(255) NOT NULL,
    created_at             TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at             TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    CONSTRAINT pk_reservations PRIMARY KEY (id)
);