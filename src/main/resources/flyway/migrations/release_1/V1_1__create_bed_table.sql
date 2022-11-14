CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE beds
(
    id         BIGINT NOT NULL,
    bed_size   INTEGER,
    created_at VARCHAR(255),
    updated_at VARCHAR(255),
    room_id    BIGINT,
    CONSTRAINT pk_beds PRIMARY KEY (id)
);
