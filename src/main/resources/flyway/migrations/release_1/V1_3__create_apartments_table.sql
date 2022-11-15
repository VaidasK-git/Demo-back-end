CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.apartments
(
    id           BIGINT NOT NULL,
    country      VARCHAR(255),
    city         VARCHAR(255),
    street_name  VARCHAR(255),
    house_number VARCHAR(255),
    flat_number  VARCHAR(255),
    zip_code     VARCHAR(255),
    latitude     VARCHAR(255),
    longitude    VARCHAR(255),
    description  VARCHAR(255),
    created_at   VARCHAR(255),
    updated_at   VARCHAR(255),
    CONSTRAINT pk_apartments PRIMARY KEY (id)
);