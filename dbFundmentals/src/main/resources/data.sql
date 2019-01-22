create table Person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

INSERT  INTO  Person (id, name, location, birth_date) VALUES (1, 'chandu', 'HOU', sysDate());
INSERT  INTO  Person (id, name, location, birth_date) VALUES (2, 'RAHUL', 'MOU', sysDate());
INSERT  INTO  Person (id, name, location, birth_date) VALUES (3, 'Tribhuvan', 'NWY', sysDate());

/*
create table User
(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);
*/

INSERT  INTO  User (id, name, location, birth_date) VALUES (1000, 'chandu', 'HOU', sysDate());
INSERT  INTO  User (id, name, location, birth_date) VALUES (2000, 'RAHUL', 'MOU', sysDate());
INSERT  INTO  User (id, name, location, birth_date) VALUES (3000, 'Tribhuvan', 'NWY', sysDate());