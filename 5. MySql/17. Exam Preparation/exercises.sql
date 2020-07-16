#01. Table Design
CREATE TABLE branches(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30) NOT NULL UNIQUE
);

CREATE TABLE employees(
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(20) NOT NULL ,
last_name VARCHAR(20) NOT NULL ,
salary DECIMAL(10,2) NOT NULL,
started_on DATE NOT NULL,
branch_id INT NOT NULL,
CONSTRAINT fk_employees_branches
FOREIGN KEY (branch_id)
REFERENCES branches(id)
);

CREATE TABLE clients(
id INT PRIMARY KEY AUTO_INCREMENT,
full_name VARCHAR(50) NOT NULL,
age INT NOT NULL
);

CREATE TABLE employees_clients(
employee_id INT,
CONSTRAINT fk_employees_clients_employee
FOREIGN KEY (employee_id)
REFERENCES employees(id),
client_id INT,
CONSTRAINT fk_employees_clients_clients
FOREIGN KEY (client_id)
REFERENCES clients(id)
);

CREATE TABLE bank_accounts(
id INT PRIMARY KEY AUTO_INCREMENT,
account_number VARCHAR(10) NOT NULL,
balance DECIMAL(10,2) NOT NULL,
client_id INT NOT NULL UNIQUE,
CONSTRAINT fk_bank_accounts_clients
FOREIGN KEY (client_id)
REFERENCES clients(id)
);

CREATE TABLE cards(
id INT PRIMARY KEY AUTO_INCREMENT,
card_number VARCHAR(19) NOT NULL,
card_status VARCHAR(7) NOT NULL,
bank_account_id INT NOT NULL,
CONSTRAINT fk_cards_bank_accounts
FOREIGN KEY (bank_account_id)
REFERENCES bank_accounts(id)
);

#02. Insert
INSERT INTO cards(card_number,card_status,bank_account_id)
SELECT REVERSE(c.full_name),'Active',c.id
FROM clients AS c
WHERE c.id BETWEEN 191 AND 200;

#03. Update
UPDATE employees_clients AS ec
SET ec.employee_id = (
	SELECT ecc.employee_id 
	FROM (SELECT * FROM employees_clients) AS ecc
	GROUP by ecc.employee_id
	ORDER by COUNT(ecc.client_id) ASC, ecc.employee_id ASC
	LIMIT 1
)
WHERE ec.employee_id = ec.client_id;

#04. Delete
DELETE FROM employees WHERE id =
(
SELECT emp.id FROM(SELECT * FROM employees) AS emp
LEFT JOIN employees_clients AS ec
ON ec.employee_id = emp.id
WHERE ec.client_id IS NULL LIMIT 1
);

#05. Clients
SELECT id,full_name
FROM clients
ORDER BY id;

#06. Newbies
SELECT id,CONCAT(first_name,' ',last_name) AS full_name,CONCAT('$',salary),started_on
FROM employees
WHERE salary >= 100000 AND started_on > '2018-01-01'
ORDER BY salary DESC,id;

#07. Cards against Humanity
SELECT ca.id,  CONCAT(ca.card_number,' : ',cl.full_name) AS `card_token`
FROM cards AS ca
JOIN bank_accounts AS ba
ON ca.bank_account_id = ba.id
JOIN clients AS cl
ON ba.client_id = cl.id
ORDER BY ca.id DESC;

#08. Top 5 Employees
SELECT CONCAT(first_name,' ',last_name),started_on,
 COUNT(ec.client_id) AS cnt
FROM employees AS emp
LEFT JOIN employees_clients AS ec
ON ec.employee_id = emp.id
GROUP BY ec.employee_id
ORDER BY cnt DESC ,emp.id
LIMIT 5;

#09. Branch cards
SELECT b.`name`,COUNT(c.id) AS count_of_cards
FROM branches AS b
LEFT JOIN employees AS e
ON b.id = e.branch_id
LEFT JOIN employees_clients AS ec
ON e.id = ec.employee_id
LEFT JOIN clients AS cl
ON ec.client_id = cl.id
LEFT JOIN bank_accounts AS ba
ON cl.id = ba.client_id
LEFT JOIN cards AS c
ON ba.id = c.bank_account_id

GROUP BY b.id
ORDER BY count_of_cards DESC ,b.`name`;

#10. Extract card's count
DELIMITER $$
CREATE FUNCTION `udf_client_cards_count`(`name_param` VARCHAR(30))
RETURNS INTEGER
BEGIN
RETURN (SELECT COUNT(c.id) FROM cards AS c
LEFT JOIN bank_accounts AS ba
ON ba.id = c.bank_account_id
LEFT JOIN clients AS cl
ON cl.id = ba.client_id
WHERE cl.full_name = name_param);
END $$

#11. Client Info
CREATE PROCEDURE `udp_clientinfo` (`full_name` VARCHAR(45))
BEGIN
SELECT cl.full_name,cl.age,ba.account_number,CONCAT('$',ba.balance) AS balance
FROM clients AS cl
JOIN bank_accounts AS ba
ON cl.id = ba.client_id
WHERE cl.full_name = full_name;
END




