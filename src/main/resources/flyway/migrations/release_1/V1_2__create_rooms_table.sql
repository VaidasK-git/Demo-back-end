CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.rooms
(
    id           BIGINT NOT NULL,
    room_name    VARCHAR(255),
    created_at   VARCHAR(255),
    updated_at   VARCHAR(255),
    apartment_id BIGINT,
    CONSTRAINT pk_rooms PRIMARY KEY (id)
);