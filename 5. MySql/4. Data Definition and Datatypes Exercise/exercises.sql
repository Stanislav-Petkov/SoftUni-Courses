
#01. Create Tables
CREATE TABLE `minions`(
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
`age` INT NOT NULL,
PRIMARY KEY(`id`));

CREATE TABLE `towns`(
`id` INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
PRIMARY KEY (`id`));

#02. Alter Minions Table
ALTER TABLE minions
ADD COLUMN town_id INT NOT NULL,
ADD CONSTRAINT `fk_minions_towns`
FOREIGN KEY (`town_id`)
REFERENCES `towns` (`id`);

#03. Insert Records in Both Tables
INSERT INTO	towns (`id`,`name`) 
VALUES (1,'Sofia'),
(2,'Plovdiv'),
(3,'Varna');

INSERT INTO	minions (`id`,`name`,`age`,`town_id`)
VALUES (1,'Kevin','22','1'),
(2,'Bob','15','3'),
(3,'Steward',NULL,'2');

INSERT INTO	towns (`id`,`name`) 
VALUES (1,'Sofia'),
(2,'Plovdiv'),
(3,'Varna');

INSERT INTO	minions (`id`,`name`,`age`,`town_id`)
VALUES (1,'Kevin',22,1),
(2,'Bob',15,3),
(3,'Steward',NULL,2);

#04. Truncate Table Minions
TRUNCATE TABLE minions;

#05. Drop All Tables
DROP TABLE minions,towns;

#06. Create Table People
CREATE TABLE people(
id INT AUTO_INCREMENT, PRIMARY KEY(id),
`name` VARCHAR(201),
`picture` MEDIUMBLOB,
`height` DOUBLE(10,2) NULL,
`weight` DOUBLE(10,2) NULL,
`gender` set('m','f') NOT NULL,
`birthday` DATE NOT NULL,
`biography` VARCHAR(65535) NULL
);

#07. Create Table Users

CREATE TABLE users(
`id` BIGINT NOT NULL AUTO_INCREMENT, PRIMARY KEY(id),
`username` VARCHAR(30) UNIQUE NOT NULL, 
`password` VARCHAR(26) NOT NULL,
`profile_picture` BLOB,
`last_login_time` TIMESTAMP,
`is_deleted` BOOLEAN
);
INSERT INTO users(`id`, `username`, `password`, `profile_picture`, `last_login_time`, `is_deleted`)
VALUES(1,'q','q','qq','0000-00-00 00:00:00',TRUE),
(2,'w','q','qq','0000-00-00 00:00:00',TRUE),
(3,'e','q','qq','0000-00-00 00:00:00',TRUE),
(4,'r','q','qq','0000-00-00 00:00:00',TRUE),
(5,'t','q','qq','0000-00-00 00:00:00',TRUE);


#08. Change Primary Key

ALTER TABLE `users` 
DROP PRIMARY KEY,
ADD CONSTRAINT pk_users
PRIMARY KEY(id,username);

#9. Set Default Value of a Field
ALTER TABLE users
MODIFY COLUMN last_login_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP;

#10. Set Unique Field
ALTER TABLE `users` 
DROP PRIMARY KEY,
ADD PRIMARY KEY(id),
ADD UNIQUE (username);

#11. Movies Database
CREATE TABLE directors(
id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY (id),
director VARCHAR(50) NOT NULL,
notes text NULL
);

CREATE TABLE genres(
id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY(id),
genre_name VARCHAR(50) NOT NULL,
notes TEXT NULL
);

CREATE TABLE categories(
id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY(id),
category_name VARCHAR(50) NOT NULL,
notes TEXT NULL
);

CREATE TABLE movies(
id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY(id),
director_id INT NOT NULL,
copyright_year YEAR NOT NULL,
length INT NOT NULL,
genre_id INT NOT NULL,
category_id INT NOT NULL,
rating INT NOT NULL,
notes TEXT
);
INSERT INTO categories(id,category_name,notes)
VALUES(1,'test','test'),
(2,'test2','test2'),
(3,'test3','test3'),
(4,'test4','test4'),
(5,'test5','test5');
INSERT INTO directors(id,director,notes)
VALUE(1,'test1','test1'),
(2,'test2','test2'),
(3,'test3','test3'),
(4,'test4','test4'),
(5,'test5','test5');
INSERT INTO genres(id,genre_name,notes)
VALUE(1,'test1','test1'),
(2,'test2','test2'),
(3,'test3','test3'),
(4,'test4','test4'),
(5,'test5','test5');
INSERT INTO movies(id, director_id, copyright_year, length, genre_id, category_id, rating, notes)
VALUES(1, 1, 1901, 1, 1, 1, 1, 'test1'),
	 (2, 2, 1902, 2, 2, 2, 2, 'test2'),
	 (3, 3, 1903, 3, 3, 3, 3, 'test3'),
	 (4, 4, 1904, 4, 4, 4, 4, 'test4'),
	 (5, 5, 1905, 5, 5, 5, 5, 'test5');
     
#13. Hotel database
CREATE TABLE IF NOT EXISTS employees
(
id INT NOT NULL AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
title VARCHAR(20),
notes VARCHAR(200),
CONSTRAINT pk_employees PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS customers
(
account_number BIGINT NOT NULL,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
phone_number VARCHAR(15) NOT NULL,
emergency_name VARCHAR(50),
emergency_number VARCHAR(15),
notes VARCHAR(200),
CONSTRAINT pk_customers PRIMARY KEY (account_number)
);

CREATE TABLE IF NOT EXISTS room_status
(
room_status VARCHAR(10) NOT NULL,
notes VARCHAR(200),
CONSTRAINT pk_room_status PRIMARY KEY (room_status)
);

CREATE TABLE IF NOT EXISTS room_types
(
room_type VARCHAR(10) NOT NULL,
notes VARCHAR(200),
CONSTRAINT pk_room_types PRIMARY KEY (room_type)
);

CREATE TABLE IF NOT EXISTS bed_types
(
bed_type VARCHAR(10) NOT NULL,
notes VARCHAR(200),
CONSTRAINT pk_bed_types PRIMARY KEY (bed_type)
);

CREATE TABLE IF NOT EXISTS rooms
(
room_number INT NOT NULL,
room_type VARCHAR(10) NOT NULL,
bed_type VARCHAR(10) NOT NULL,
rate DOUBLE(10, 2),
room_status VARCHAR(10) NOT NULL,
notes VARCHAR(200),
CONSTRAINT pk_rooms PRIMARY KEY (room_number)
);

CREATE TABLE IF NOT EXISTS payments
(
id INT NOT NULL AUTO_INCREMENT,
employee_id INT NOT NULL,
payment_date DATETIME NOT NULL,
account_number BIGINT NOT NULL,
first_date_occupied DATETIME,
last_date_occupied DATETIME,
total_days INT,
amount_charged DOUBLE(10,2) NOT NULL,
tax_rate DOUBLE(10,2),
tax_amount DOUBLE(10,2),
payment_total DOUBLE(10,2) NOT NULL,
notes VARCHAR(200),
CONSTRAINT pk_payments PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS occupancies
(
id INT NOT NULL AUTO_INCREMENT,
employee_id INT NOT NULL,
date_occupied DATETIME,
account_number BIGINT NOT NULL,
room_number INT NOT NULL,
rate_applied DOUBLE(10,2),
phone_charge DOUBLE(10,2),
notes VARCHAR(200),
CONSTRAINT pk_occupancies PRIMARY KEY (id)
);

INSERT INTO employees (first_name, last_name) VALUES ('Ivan', 'Ivanov');
INSERT INTO employees (first_name, last_name) VALUES ('Petar', 'Petrov');
INSERT INTO employees (first_name, last_name) VALUES ('Mitko', 'Dimitrov');

INSERT INTO customers(account_number, first_name, last_name, phone_number) VALUES (34545674545, 'Ivan', 'Petrov', '+35988999999');
INSERT INTO customers(account_number, first_name, last_name, phone_number) VALUES (35436554234, 'Misho', 'Petrovanov', '+359889965479');
INSERT INTO customers(account_number, first_name, last_name, phone_number) VALUES (12480934333, 'Nikolay', 'Nikov', '+35988999919');

INSERT INTO room_status (room_status) VALUES ('Occupied');
INSERT INTO room_status (room_status) VALUES ('Available');
INSERT INTO room_status (room_status) VALUES ('Cleaning');

INSERT INTO room_types (room_type) VALUES ('Single');
INSERT INTO room_types (room_type) VALUES ('Double');
INSERT INTO room_types (room_type) VALUES ('Apartment');

INSERT INTO bed_types (bed_type) VALUES ('Double');
INSERT INTO bed_types (bed_type) VALUES ('Queen');
INSERT INTO bed_types (bed_type) VALUES ('King');

INSERT INTO rooms (room_number, room_type, bed_type, room_status) VALUES (1, 'Single', 'Double', 'Available');
INSERT INTO rooms (room_number, room_type, bed_type, room_status) VALUES (2, 'Double', 'King', 'Available');
INSERT INTO rooms (room_number, room_type, bed_type, room_status) VALUES (12, 'Apartment', 'Queen', 'Occupied');

INSERT INTO payments (employee_id, payment_date, account_number, amount_charged, payment_total, tax_rate) VALUES (1, NOW(), 34545675676, 10.20, 12.20, 2.4);
INSERT INTO payments (employee_id, payment_date, account_number, amount_charged, payment_total, tax_rate) VALUES (3, NOW(), 34545675676, 220.20, 240.22, 2.1);
INSERT INTO payments (employee_id, payment_date, account_number, amount_charged, payment_total, tax_rate) VALUES (2, NOW(), 34545675676, 190.20, 215.88, 1.1);

INSERT INTO occupancies (employee_id, account_number, room_number) VALUES (1, 34545675676, 2);
INSERT INTO occupancies (employee_id, account_number, room_number) VALUES (2, 34545675676, 1);
INSERT INTO occupancies (employee_id, account_number, room_number) VALUES (2, 34545675676, 12);

#14. Create SoftUni Database
drop table if exists towns, addresses,departments,employees;
CREATE TABLE `towns`(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(30) NOT NULL
);

CREATE TABLE `addresses`(
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`address_text` VARCHAR(255) NOT NULL, 
`town_id` INT,
CONSTRAINT fk_address_town
FOREIGN KEY `addresses` (town_id)
REFERENCES `towns` (id)
);

CREATE TABLE `departments`(
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(50) NOT NULL
);

CREATE TABLE employees(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(45),
middle_name VARCHAR(45),
last_name VARCHAR(45),
job_title VARCHAR(45),
department_id INT,
hire_date DATE,
salary DECIMAL(10,2),
address_id INT,
CONSTRAINT fk_employees_departments
FOREIGN KEY `employee` (`department_id`)
REFERENCES `departments` (`id`),
CONSTRAINT fk_employees_addresses
FOREIGN KEY `employees` (`address_id`)
REFERENCES `addresses` (`id`));

#15. Basic Insert
select `name` from towns;
select `name` from departments;
select first_name, middle_name, last_name, job_title, department_id, hire_date, salary from employees;


#16. Basic Select All Fields
SELECT * FROM towns;
SELECT * FROM departments;
SELECT * FROM employees;

#17 Basic Select All Fields and order them
SELECT * FROM towns ORDER BY `name` ASC;
SELECT * FROM departments ORDER BY `name` ASC;
SELECT * FROM employees ORDER BY `salary` DESC;

#18. Basic Select Some Fields
SELECT `name` FROM towns ORDER BY `name` ASC;
SELECT `name` FROM departments ORDER BY `name` ASC;
SELECT `first_name`,`last_name`,`job_title`,`salary` FROM employees ORDER BY `salary` DESC;

#19. Increase Employees Salary
UPDATE `employees`
SET salary = salary + (salary * 0.10);
Select salary from employees;

#20. Decrease Tax Rate
UPDATE `payments`
SET tax_rate = tax_rate - (tax_rate * 0.03);
Select tax_rate from payments;

#21. Delete all records
TRUNCATE TABLE occupancies;


*/