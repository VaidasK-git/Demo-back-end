CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE reservation.pictures
(
    id           BIGINT NOT NULL,
    url          VARCHAR(255),
    picture_role INTEGER,
    created_at   VARCHAR(255),
    updated_at   VARCHAR(255),
    apartment_id BIGINT,
    employee_id  BIGINT,
    CONSTRAINT pk_pictures PRIMARY KEY (id)
);