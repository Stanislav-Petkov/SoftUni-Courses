#1. Mountains and Peaks
CREATE TABLE mountains(
id INT PRIMARY KEY AUTO_INCREMENT ,
`name` VARCHAR(50) NOT NULL 
);

CREATE TABLE peaks(
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
mountain_id INT, CONSTRAINT fk_peaks_mountains FOREIGN KEY (mountain_id)  REFERENCES mountains(id)
);

#2. Trip Organization
SELECT driver_id,vehicle_type, CONCAT(first_name,' ',last_name) AS driver_name
FROM vehicles
JOIN campers
ON campers.id = vehicles.driver_id;

#3. SoftUni Hiking
SELECT r.starting_point AS `route_starting_point`,
r.end_point AS `route_ending_point`,
r.leader_id,
CONCAT(c.first_name,' ',c.last_name) AS leader_name
FROM routes AS r
JOIN campers AS c
ON r.leader_id = c.id;

#4. Delete Mountains
CREATE TABLE mountains(
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(45)
);

CREATE TABLE peaks(
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(45),
`mountain_id` INT,
CONSTRAINT fk_peak_mountain
FOREIGN KEY (mountain_id)
REFERENCES mountains(id)
ON DELETE CASCADE
);

#5. Poject Management DB
CREATE TABLE clients(
id INT(11) PRIMARY KEY AUTO_INCREMENT,
client_name VARCHAR(100)
);

CREATE TABLE projects(
id INT(11) PRIMARY KEY AUTO_INCREMENT,
client_id INT(11),
project_lead_id INT(11),

CONSTRAINT fk_client_id_clients_id
FOREIGN KEY (client_id)
REFERENCES clients(id)
);

ALTER TABLE projects
ADD CONSTRAINT fk_project_lead_id_employee_id
FOREIGN KEY (project_lead_id)
REFERENCES employees(id)
;

CREATE TABLE employees(
id INT(11) PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30),
last_name VARCHAR(30),
project_id INT(11),
CONSTRAINT fk_project_id_proojects_id
FOREIGN KEY (project_id)
REFERENCES projects(id)
);