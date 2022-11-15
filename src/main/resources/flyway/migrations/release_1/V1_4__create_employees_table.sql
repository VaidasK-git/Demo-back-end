CREATE SEQUENCE IF NOT EXISTS reservation.hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TYPE employeeRole AS ENUM ('User', 'Squad Lead', 'Group Lead', 'Administrator');

CREATE TABLE reservation.employees
(
    id            SERIAL,
    first_name    VARCHAR(50) NOT NULL,
    last_name     VARCHAR(50) NOT NULL,
    sex           VARCHAR(50) NOT NULL,
    picture_id    BIGINT,
    squad_lead_id INTEGER     NOT NULL,
    phone_number  VARCHAR(50) NOT NULL,
    email         VARCHAR(50) NOT NULL,
    employee_role employeeRole NOT NULL,
    created_at    TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    updated_at    TIMESTAMP WITHOUT TIME ZONE DEFAULT NOW(),
    CONSTRAINT pk_employees PRIMARY KEY (id)
);