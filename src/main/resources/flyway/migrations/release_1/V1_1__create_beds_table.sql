CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TYPE bedSize AS ENUM ('Twin', 'Twin XL', 'Full', 'Queen', 'King', 'California King');

CREATE TABLE reservation.beds
(
    id         BIGSERIAL NOT NULL,
    bed_size   bedSize NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    room_id    BIGINT,
    CONSTRAINT pk_beds PRIMARY KEY (id)
);
