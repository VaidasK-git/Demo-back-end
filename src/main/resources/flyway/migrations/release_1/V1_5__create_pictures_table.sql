CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TYPE pictureRole AS ENUM ('EMPLOYEE', 'APARTMENT');

CREATE TABLE reservation.pictures
(
    id           BIGSERIAL NOT NULL,
    url          VARCHAR(50) NOT NULL,
    picture_role pictureRole NOT NULL,
    created_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    apartment_id BIGINT,
    employee_id  BIGINT,
    CONSTRAINT pk_pictures PRIMARY KEY (id)
);