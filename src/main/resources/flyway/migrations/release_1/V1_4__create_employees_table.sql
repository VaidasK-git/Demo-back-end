CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE employees
(
    id            BIGINT NOT NULL,
    first_name    VARCHAR(255),
    last_name     VARCHAR(255),
    sex           VARCHAR(255),
    picture_id    BIGINT,
    squad_lead_id BIGINT,
    phone_number  VARCHAR(255),
    email         VARCHAR(255),
    employee_role VARCHAR(255),
    created_at    VARCHAR(255),
    updated_at    VARCHAR(255),
    CONSTRAINT pk_employees PRIMARY KEY (id)
);
