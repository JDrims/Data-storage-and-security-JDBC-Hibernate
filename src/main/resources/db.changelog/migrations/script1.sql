CREATE TABLE if not exists persons(
    name VARCHAR(20),
    surname VARCHAR(30),
    age INT,
    phone_number VARCHAR(11),
    city_of_living VARCHAR(30),
    constraint name_surname_age PRIMARY key (name, surname, age)
);