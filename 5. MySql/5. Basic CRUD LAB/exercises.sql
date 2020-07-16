
#01. Select Employee Information
SELECT id, first_name, last_name, job_title
FROM employees
ORDER BY id;

#02. Select Employees with Filter
SELECT
concat(first_name,' Surname Missing ', last_name) AS fullname
FROM employees AS e;

#03. Update Salary and Select
UPDATE employees2 
SET salary = salary + ( salary / 10 )
WHERE job_title = 'Therapist';

SELECT salary AS Salary
FROM employees2
ORDER BY salary ASC;

#04. Top Paid Employee
DROP VIEW v_top_paid_employee;
CREATE VIEW v_top_paid_employee AS
SELECT * FROM employees 
ORDER BY salary DESC LIMIT 1;
SELECT * FROM v_top_paid_employee;

#05. Select Employees by Multiple Filters
SELECT *
FROM employees
WHERE department_id = 4 AND salary >= 1600
ORDER BY ID;

#06. Delete from Table
DELETE 
FROM employees
WHERE department_id = 2 OR department_id = 1;
SELECT * FROM employees
ORDER BY id;



