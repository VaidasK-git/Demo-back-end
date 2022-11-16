-- Create ENUMS

CREATE TYPE bedSize AS ENUM ('Twin', 'Twin XL', 'Full', 'Queen', 'King', 'California King');
CREATE TYPE country AS ENUM ('Canada', 'United Kingdom', 'Lithuania', 'Poland', 'United States of America');
CREATE TYPE city AS ENUM ('Chicago', 'Kaunas', 'Klaipeda', 'London', 'New York', 'Toronto', 'Vilnius', 'Warsaw');
CREATE TYPE employeeRole AS ENUM ('User', 'Squad Lead', 'Group Lead', 'Administrator');
CREATE TYPE pictureRole AS ENUM ('EMPLOYEE', 'APARTMENT');
CREATE TYPE reservationStatus AS ENUM ('PENDING', 'ACCEPTED', 'DENIED', 'CANCELLED');

-- Create apartments table

CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.apartments
(
    id           BIGSERIAL   NOT NULL,
    country      country     NOT NULL,
    city         city        NOT NULL,
    street_name  VARCHAR(50) NOT NULL,
    house_number VARCHAR(50) NOT NULL,
    flat_number  VARCHAR(50) NOT NULL,
    zip_code     VARCHAR(50) NOT NULL,
    latitude     VARCHAR(50) NOT NULL,
    longitude    VARCHAR(50) NOT NULL,
    description  VARCHAR(50) NOT NULL,
    created_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    CONSTRAINT pk_apartments PRIMARY KEY (id)
);

-- Create rooms table

CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.rooms
(
    id           BIGSERIAL   NOT NULL,
    room_name    VARCHAR(50) NOT NULL,
    created_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    apartment_id BIGINT,
    CONSTRAINT pk_rooms PRIMARY KEY (id)
);

ALTER TABLE reservation.rooms
    ADD CONSTRAINT FK_ROOMS_ON_APARTMENT FOREIGN KEY (apartment_id) REFERENCES reservation.apartments (id);

-- Create beds table

CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.beds
(
    id         BIGSERIAL NOT NULL,
    bed_size   bedSize   NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    room_id    BIGINT,
    CONSTRAINT pk_beds PRIMARY KEY (id)
);

ALTER TABLE reservation.beds
    ADD CONSTRAINT FK_BEDS_ON_ROOM FOREIGN KEY (room_id) REFERENCES reservation.rooms (id);

-- Create employees table

CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.employees
(
    id            BIGSERIAL    NOT NULL,
    first_name    VARCHAR(50)  NOT NULL,
    last_name     VARCHAR(50)  NOT NULL,
    sex           VARCHAR(50)  NOT NULL,
    picture_id    BIGINT,
    squad_lead_id BIGINT       NOT NULL,
    phone_number  VARCHAR(50)  NOT NULL,
    email         VARCHAR(50)  NOT NULL,
    employee_role employeeRole NOT NULL,
    created_at    TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at    TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    CONSTRAINT pk_employees PRIMARY KEY (id)
);

-- Create pictures table

CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.pictures
(
    id           BIGSERIAL   NOT NULL,
    url          VARCHAR(50) NOT NULL,
    picture_role pictureRole NOT NULL,
    created_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at   TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    apartment_id BIGINT,
    employee_id  BIGINT,
    CONSTRAINT pk_pictures PRIMARY KEY (id)
);

ALTER TABLE reservation.pictures
    ADD CONSTRAINT FK_PICTURES_ON_APARTMENT FOREIGN KEY (apartment_id) REFERENCES reservation.apartments (id);

ALTER TABLE reservation.pictures
    ADD CONSTRAINT FK_PICTURES_ON_EMPLOYEE FOREIGN KEY (employee_id) REFERENCES reservation.employees (id);

ALTER TABLE reservation.employees
    ADD CONSTRAINT FK_EMPLOYEES_ON_PICTURE FOREIGN KEY (picture_id) REFERENCES reservation.pictures (id);

-- Create reservations table

CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.reservations
(
    id                     BIGSERIAL         NOT NULL,
    employee_id            BIGINT            NOT NULL,
    apartment_id           BIGINT            NOT NULL,
    reservation_start_date VARCHAR(50)       NOT NULL,
    reservation_end_date   VARCHAR(50)       NOT NULL,
    reservation_status     reservationStatus NOT NULL,
    notes                  VARCHAR(255)      NOT NULL,
    created_at             TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at             TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    CONSTRAINT pk_reservations PRIMARY KEY (id)
);
