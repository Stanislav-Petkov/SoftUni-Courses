#01. Records’ Count
SELECT COUNT(*) AS 'count'
FROM wizzard_deposits;

#02. Longest Magic Wand
SELECT MAX(magic_wand_size) AS 'longest_magic_wand'
FROM wizzard_deposits;

#03. Longest Magic Wand per Deposit Groups
SELECT deposit_group, MAX(magic_wand_size) AS 'longest_magic_wand'
FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY `longest_magic_wand`,deposit_group;

#04. Smallest Deposit Group per Magic Wand Size
SELECT deposit_group
FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY AVG(magic_wand_size)
LIMIT 1;

#05. Deposits Sum
SELECT deposit_group,SUM( deposit_amount) AS 'total_sum'
FROM wizzard_deposits
GROUP BY deposit_group
ORDER BY total_sum;

#06. Deposits Sum for Ollivander Family
SELECT deposit_group,SUM( deposit_amount) AS 'total_sum'
FROM wizzard_deposits
WHERE magic_wand_creator = 'Ollivander family'
GROUP BY deposit_group
ORDER BY deposit_group;

#07. Deposits Filter
SELECT deposit_group,SUM( deposit_amount) AS 'total_sum'
FROM wizzard_deposits
WHERE magic_wand_creator = 'Ollivander family'
GROUP BY deposit_group
HAVING total_sum < 150000
ORDER BY total_sum DESC;

#08. Deposit Charge
SELECT deposit_group,magic_wand_creator,MIN(deposit_charge) AS 'min_deposit_charge'
FROM wizzard_deposits
GROUP BY deposit_group,magic_wand_creator
ORDER BY magic_wand_creator,deposit_group ASC;

#09. Age Groups
SELECT 
CASE
    WHEN age >= 0 AND age <= 10 THEN "[0-10]"
    WHEN age >= 11 AND age <= 20 THEN "[11-20]"
    WHEN age >= 21 AND age <= 30 THEN "[21-30]"
    WHEN age >= 31 AND age <= 40 THEN "[31-40]"
    WHEN age >= 41 AND age <= 50 THEN "[41-50]"
    WHEN age >= 51 AND age <= 60 THEN "[51-60]"
    ELSE "[61+]"
END AS age_group
,COUNT(age) AS 'wizard_count'

FROM wizzard_deposits
GROUP BY age_group
ORDER BY age_group ASC;

#10. First Letter
SELECT SUBSTRING(first_name,1,1) AS first_letter
FROM wizzard_deposits
WHERE deposit_group = 'Troll Chest'
GROUP BY first_letter
ORDER BY first_letter ASC;

#11. Average Interest
SELECT deposit_group,is_deposit_expired,   AVG(deposit_interest) AS average_interest
FROM wizzard_deposits
WHERE deposit_start_date > '1985-01-01'
GROUP BY deposit_group,is_deposit_expired
ORDER BY deposit_group DESC,is_deposit_expired ASC;

#13. Employees Minimum Salaries
SELECT department_id,MIN(salary)
FROM employees
WHERE department_id IN (2,5,7)
GROUP BY department_id
ORDER BY department_id ASC;

#14. Employees Average Salaries
CREATE TABLE employees_new LIKE employees; 
INSERT employees_new SELECT * FROM employees WHERE salary > 30000;
DELETE 
FROM employees_new
WHERE manager_id = 42;
UPDATE employees_new
SET salary = salary + 5000
WHERE department_id = 1;
SELECT department_id,AVG(salary) AS avg_salary
FROM employees_new
GROUP BY department_id
ORDER BY department_id;

#15. Employees Maximum Salaries
SELECT department_id,MAX(salary) as max_salary
FROM employees 
GROUP BY department_id
HAVING max_salary < 30000 OR max_salary > 70000
ORDER BY department_id;

#16. Employees Count Salaries
SELECT COUNT(salary)
FROM employees
WHERE manager_id IS NULL;
 
#17. 3rd Highest Salary
SELECT department_id, salary AS third_highest_salary
FROM employees AS es
WHERE( SELECT employee_id 
		FROM employees AS ine
        WHERE ine.department_id = es.department_id
        GROUP BY salary
        ORDER BY salary DESC
        LIMIT 1 OFFSET 2
	) = employee_id
GROUP BY department_id
ORDER BY department_id ASC;

#18. Salary Challenge
SELECT e.first_name, e.last_name, e.department_id
FROM employees AS e
WHERE salary > (SELECT AVG(p.salary)
				FROM employees as p
                WHERE p.department_id = e.department_id
				GROUP BY p.department_id)
ORDER BY e.department_id,e.employee_id
LIMIT 10;

#19. Departments Total Salaries
SELECT department_id,SUM(salary) AS total_salary
FROM employees
GROUP BY department_id
ORDER BY department_id;

