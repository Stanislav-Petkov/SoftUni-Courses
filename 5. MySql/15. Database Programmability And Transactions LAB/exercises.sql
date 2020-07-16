#1. Count Employees by Town
DELIMITER $$
CREATE DEFINER=`root`@`localhost` FUNCTION `ufn_count_employees_by_town`(town_name VARCHAR(50) ) RETURNS double
BEGIN
DECLARE e_count DOUBLE;
SET e_count :=  (SELECT COUNT(employee_id)
FROM employees AS e 
JOIN addresses AS a
ON e.address_id = a.address_id
JOIN towns AS t
ON a.town_id = t.town_id
WHERE t.`name` = town_name);
RETURN e_count;
END $$

SELECT  ufn_count_employees_by_town('Berlin') AS 'count' ;

#2. Employees Promotion
DELIMITER $$
CREATE PROCEDURE usp_raise_salaries(department_name VARCHAR(45))
BEGIN
UPDATE employees AS e
JOIN departments AS d
ON e.department_id = d.department_id
SET e.salary = e.salary + (0.05 * e.salary)
WHERE d.`name` = department_name;
END $$

#3. Employees Promotion By ID
DELIMITER $$
CREATE  PROCEDURE `usp_raise_salary_by_id`(id INT)
BEGIN
DECLARE does_exist INT;
START TRANSACTION;
UPDATE employees SET salary = salary * 1.05 WHERE employee_id = employee_id;
SET does_exist := (SELECT COUNT(*) FROM employees WHERE employee_id = id);
IF (does_exist > 0) THEN
	COMMIT;
ELSE
    ROLLBACK;
END IF;
END $$

#4. Triggered
DELIMITER $$
CREATE TABLE deleted_employees(
employee_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(45),
last_name VARCHAR(45),
middle_name VARCHAR(45),
job_title VARCHAR(45),
department_id INT,
salary DECIMAL(19,4)
);
CREATE TRIGGER `tr_deleted_employees` AFTER DELETE ON `employees` FOR EACH ROW BEGIN
INSERT INTO deleted_employees
(first_name,last_name,middle_name,job_title,department_id,salary)
VALUES(OLD.first_name,OLD.last_name,OLD.middle_name,OLD.job_title,OLD.department_id,OLD.salary);
END $$




