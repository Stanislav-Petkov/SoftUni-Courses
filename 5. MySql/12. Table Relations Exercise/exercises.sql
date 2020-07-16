#01. One-To-One Relationship
CREATE TABLE `passports`(
`passport_id` INT PRIMARY KEY,
`passport_number` VARCHAR(10) UNIQUE
);

INSERT INTO `passports`(`passport_id`,`passport_number`)
VALUE
(101,'N34FG21B'),
(102,'K65LO4R7'),
(103,'ZE657QP2');

CREATE TABLE `persons`(
`person_id` INT AUTO_INCREMENT PRIMARY KEY,
`first_name` VARCHAR(17),
`salary` DECIMAL(10,2),
`passport_id` INT UNIQUE
);

ALTER TABLE `persons`
ADD CONSTRAINT fk_persons_passports
FOREIGN KEY `persons`(`passport_id`) 
REFERENCES `passports`(`passport_id`);

INSERT INTO persons(first_name,salary,passport_id)
VALUES
('Roberto',43300.00,102),
('Tom',56100.00,103),
('Yana',60200.00,101);

#02. One-To-Many Relationship
CREATE TABLE `manufacturers`(
`manufacturer_id` INT AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(20),
`established_on` DATE
);

INSERT INTO `manufacturers`(`name`,`established_on`)
VALUE
('BMW','1916-03-01'),
('Tesla','2003-01-01'),
('Lada','1966-05-01');

CREATE TABLE `models`(
`model_id` INT PRIMARY KEY,
`name` VARCHAR(20),
`manufacturer_id` INT,

CONSTRAINT fk_models_manufacturers
FOREIGN KEY `models`(`manufacturer_id`) 
REFERENCES `manufacturers`(`manufacturer_id`)
);

INSERT INTO `models`
VALUES
(101,'X1',1),
(102,'i6',1),
(103,'Model S',2),
(104,'Model X',2),
(105,'Model 3',2),
(106,'Nova',3);

#03. Many-To-Many Relationship
CREATE TABLE `students`(
`student_id` INT PRIMARY KEY AUTO_INCREMENT ,
`name` VARCHAR(30)
);

CREATE TABLE `exams`(
`exam_id` INT PRIMARY KEY,
`name` VARCHAR(30)
);

CREATE TABLE `students_exams`(
`student_id` INT,
`exam_id` INT,

CONSTRAINT pk_students_exams
PRIMARY KEY(`student_id`,`exam_id`),

CONSTRAINT `fk_student_exams_studets`
FOREIGN KEY (`student_id`)
REFERENCES `students`(`student_id`),

CONSTRAINT `fk_student_exams_exams`
FOREIGN KEY (`exam_id`)
REFERENCES `exams`(`exam_id`)
);

INSERT INTO `students`( `name`)
VALUES
('Mila'),
('Toni'),
('Ron');

INSERT INTO `exams`
VALUES
(101,'Spring MVC'),
(102,'Neo4j'),
(103,'Oracle 11g');

INSERT INTO `students_exams`
VALUES
(1,101),
(1,102),
(2,101),
(3,103),
(2,102),
(2,103);

#04. Self-Referencing
CREATE TABLE teachers(
`teacher_id` INT PRIMARY KEY,
`name` VARCHAR(20),
`manager_id` INT,
CONSTRAINT fk_teachers_teachers
FOREIGN KEY (`manager_id`)
REFERENCES `teachers`(`teacher_id`)
);

INSERT INTO `teachers`(`teacher_id`,`name`)
VALUES
(101,'John'),
(102,'Maya'),
(103,'Silvia'),
(104,'Ted'),
(105,'Mark'),
(106,'Greta');

#05. Online Store Database
CREATE TABLE `cities`(
`city_id` INT AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(50)
);

CREATE TABLE customers(
`customer_id` INT AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(50),
`birthday` DATE,
`city_id` INT,
CONSTRAINT fk_customers_cities
FOREIGN KEY `customers`(`city_id`)
REFERENCES `cities`(`city_id`)
);

CREATE TABLE `orders`(
`order_id` INT AUTO_INCREMENT PRIMARY KEY,
`customer_id` INT,
CONSTRAINT fk_orders_customers
FOREIGN KEY (`customer_id`)
REFERENCES `customers`(`customer_id`)
);

CREATE TABLE item_types(
`item_type_id` INT AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(50)
);

CREATE TABLE items(
`item_id` INT AUTO_INCREMENT PRIMARY KEY,
`name` VARCHAR(50),
`item_type_id` INT,
CONSTRAINT fk_items_item_types
FOREIGN KEY (`item_type_id`)
REFERENCES `item_types`(`item_type_id`)
);

CREATE TABLE order_items(
`order_id` INT,
`item_id` INT,

CONSTRAINT pk_order_items
PRIMARY KEY (`order_id`,`item_id`),

CONSTRAINT fk_order_items_orders
FOREIGN KEY `order_items`(`order_id`)
REFERENCES `orders`(`order_id`),

CONSTRAINT fk_order_items_items
FOREIGN KEY `order_items`(`item_id`)
REFERENCES `items`(`item_id`)
);

#06. University Database
CREATE TABLE subjects(
`subject_id` INT PRIMARY KEY AUTO_INCREMENT,
`subject_name` VARCHAR(50)
);

CREATE TABLE majors(
`major_id` INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50)
);

CREATE TABLE students(
`student_id` INT AUTO_INCREMENT PRIMARY KEY,
`student_number` VARCHAR(12),
`student_name` VARCHAR(50),
`major_id` INT NULL,
CONSTRAINT fk_students_majors
FOREIGN KEY (`major_id`)
REFERENCES `majors`(`major_id`)
);

CREATE TABLE payments(
`payment_id` INT PRIMARY KEY AUTO_INCREMENT,
`payment_date` DATE,
`payment_amount` DECIMAL(8,2),
`student_id` INT NULL,
CONSTRAINT fk_payments_students
FOREIGN KEY (`student_id`)
REFERENCES `students`(`student_id`)
);

CREATE TABLE agenda(
`student_id` INT,
`subject_id` INT,

CONSTRAINT pk_student_id_subject_id
PRIMARY KEY(`student_id`,`subject_id`),

CONSTRAINT fk_agenda_students
FOREIGN KEY (`student_id`)
REFERENCES `students`(`student_id`),

CONSTRAINT fk_agenda_subjects
FOREIGN KEY (`subject_id`)
REFERENCES `subjects`(`subject_id`)
);

#09. Peaks in Rila
SELECT mountain_range,peak_name,elevation AS 'peak_elevation'
FROM peaks AS p
JOIN mountains AS m
ON p.mountain_id = m.id
WHERE m.mountain_range = 'Rila'
ORDER BY `peak_elevation` DESC;