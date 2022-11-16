-- Insert data apartments table

INSERT INTO reservation.apartments(country, city, street_name, house_number, flat_number, zip_code, latitude, longitude, description)
VALUES ('United States of America', 'Chicago', 'N Orleans St', '350', 'Suite 7500-S', 'IL 60654', '41.858190', '-87.637290', 'Lorem ipsum dolor sit amet');

-- Insert data rooms table

INSERT INTO reservation.rooms(room_name, apartment_id) VALUES ('Red room', 1);
INSERT INTO reservation.rooms(room_name, apartment_id) VALUES ('Blue room', 1);
INSERT INTO reservation.rooms(room_name, apartment_id) VALUES ('White room', 1);

-- Insert data beds table

INSERT INTO reservation.beds(bed_size, room_id) VALUES ('Twin', 1);
INSERT INTO reservation.beds(bed_size, room_id) VALUES ('Twin', 1);
INSERT INTO reservation.beds(bed_size, room_id) VALUES ('Twin', 2);
INSERT INTO reservation.beds(bed_size, room_id) VALUES ('Twin', 2);
INSERT INTO reservation.beds(bed_size, room_id) VALUES ('Twin', 3);
INSERT INTO reservation.beds(bed_size, room_id) VALUES ('Twin', 3);

-- Insert data pictures table

INSERT INTO reservation.pictures(url, picture_role, apartment_id) VALUES ('ApartmentPictures/1-1.jpg', 'APARTMENT', 1);
INSERT INTO reservation.pictures(url, picture_role, apartment_id) VALUES ('ApartmentPictures/1-2.jpg', 'APARTMENT', 1);
INSERT INTO reservation.pictures(url, picture_role, apartment_id) VALUES ('ApartmentPictures/2-1.jpg', 'APARTMENT', 1);
INSERT INTO reservation.pictures(url, picture_role, apartment_id) VALUES ('ApartmentPictures/2-2.jpg', 'APARTMENT', 1);
INSERT INTO reservation.pictures(url, picture_role, apartment_id) VALUES ('ApartmentPictures/3-1.jpg', 'APARTMENT', 1);
INSERT INTO reservation.pictures(url, picture_role, apartment_id) VALUES ('ApartmentPictures/3-2.jpg', 'APARTMENT', 1);


