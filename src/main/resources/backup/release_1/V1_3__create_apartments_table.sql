CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TYPE country AS ENUM ('Canada', 'United Kingdom', 'Lithuania', 'Poland', 'United States of America');
CREATE TYPE city AS ENUM ('Chicago', 'Kaunas', 'Klaipeda', 'London', 'New York', 'Toronto', 'Vilnius', 'Warsaw');

CREATE TABLE reservation.apartments
(
    id           BIGSERIAL NOT NULL,
    country      country NOT NULL,
    city         city NOT NULL,
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