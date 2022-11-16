CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.rooms
(
    id           BIGSERIAL NOT NULL,
    room_name    VARCHAR(50) NOT NULL,
    created_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    apartment_id BIGINT,
    CONSTRAINT pk_rooms PRIMARY KEY (id)
);
