#01. Employees with Salary Above 35000
DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_get_employees_salary_above_35000`()
BEGIN
SELECT first_name,last_name
FROM employees
WHERE salary > 35000
ORDER BY first_name,last_name,employee_id;
END $$

#02. Employees with Salary Above Number
DELIMITER $$
CREATE PROCEDURE usp_get_employees_salary_above(num DECIMAL(19,4))
BEGIN
SELECT `first_name`,`last_name`
FROM employees
WHERE `salary` >= num
ORDER BY `first_name`,`last_name`,`employee_id`;
END $$

#03. Town Names Starting With
DELIMITER $$
CREATE PROCEDURE usp_get_towns_starting_with(starts_with VARCHAR(45))
BEGIN
SELECT `name`
FROM towns
WHERE `name` LIKE CONCAT(starts_with,'%')
ORDER BY `name`;
END $$

#04. Employees from Town
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_get_employees_from_town`(town_name VARCHAR(45))
BEGIN
SELECT e.first_name,e.last_name
FROM employees AS e
JOIN addresses AS a
ON e.address_id = a.address_id
JOIN towns AS t
ON a.town_id = t.town_id
WHERE t.`name` = town_name
ORDER BY e.first_name,e.last_name,e.employee_id;
END

#05. Salary Level Function
DELIMITER $$
CREATE FUNCTION ufn_get_salary_level(salary_emp DECIMAL)
RETURNS VARCHAR(10)
DETERMINISTIC
BEGIN
	DECLARE result VARCHAR(10);
    IF salary_emp < 30000 THEN SET result := 'Low';
    ELSEIF(salary_emp BETWEEN 30000 AND 50000) THEN SET result := 'Average';
    ELSE SET result := 'High';
    END IF;
    RETURN result;
END $$

#06. Employees by Salary Level
CREATE FUNCTION ufn_get_salary_level(salary_emp DECIMAL)
RETURNS VARCHAR(10)
DETERMINISTIC
BEGIN
	DECLARE result VARCHAR(10);
    IF salary_emp < 30000 THEN SET result := 'Low';
    ELSEIF(salary_emp BETWEEN 30000 AND 50000) THEN SET result := 'Average';
    ELSE SET result := 'High';
    END IF;
    RETURN result;
END;

CREATE PROCEDURE usp_get_employees_by_salary_level(salary_level VARCHAR(10))
BEGIN
	SELECT `first_name`,`last_name`
	FROM employees
	WHERE LOWER(ufn_get_salary_level(salary)) = salary_level
	ORDER BY first_name DESC,last_name DESC;
END;

#07. Define Function
CREATE FUNCTION ufn_is_word_comprised(set_of_letters varchar(50), word varchar(50))
RETURNS INTEGER
BEGIN
RETURN (SELECT word REGEXP (concat('^[', set_of_letters, ']+$')));
END;

SELECT ufn_is_word_comprised('oistmiahf','Sofia');
SELECT ufn_is_word_comprised('oistmiahf','halves');
SELECT ufn_is_word_comprised('bobr','Rob');
SELECT ufn_is_word_comprised('pppp','Guy');

#08. Find Full Name
CREATE PROCEDURE usp_get_holders_full_name()
BEGIN
SELECT CONCAT(first_name,' ',last_name) AS full_name
FROM account_holders
ORDER BY full_name,id;
END

#9. People with Balance Higher Than (not included in final score)
CREATE PROCEDURE `usp_get_holders_with_balance_higher_than` (money INT)
BEGIN
SELECT ah.first_name,ah.last_name
FROM account_holders AS ah
JOIN accounts AS a
ON a.account_holder_id = ah.id
GROUP BY a.account_holder_id
HAVING  SUM(a.balance) > money;
END;

#10. Future Value Function
CREATE FUNCTION  ufn_calculate_future_value(initial_sum DOUBLE,interest DOUBLE, years DOUBLE)
RETURNS DOUBLE
BEGIN
DECLARE result DOUBLE;
SET result := initial_sum * POWER((1 + interest) , years);
RETURN result;
END 

#11. Calculating Interest
CREATE FUNCTION  ufn_calculate_future_value(initial_sum DOUBLE,interest DOUBLE, years DOUBLE)
RETURNS DECIMAL(19,4)
BEGIN
DECLARE result DECIMAL(19,4);
SET result := initial_sum * POWER((1 + interest) , years);
RETURN result;
END;

CREATE PROCEDURE usp_calculate_future_value_for_account(account_id INT, interest_rate  DECIMAL(19,4))
BEGIN
SELECT a.id AS account_id, first_name, last_name, a.balance AS current_balance,
ufn_calculate_future_value(a.balance,interest_rate,5) AS balance_in_5_years
FROM accounts AS a
JOIN account_holders AS ah
ON a.account_holder_id = ah.id
WHERE a.id = account_id;
END;

#12. Deposit Money
CREATE PROCEDURE usp_deposit_money(account_id INT,money_amount DECIMAL(19,4))
BEGIN
	START TRANSACTION;
	IF(money_amount <= 0 ) THEN
		ROLLBACK;
    ELSE
		UPDATE accounts
		SET balance = balance + money_amount
		WHERE id = account_id;   
    END IF;
END 

#13. Withdraw Money
CREATE PROCEDURE usp_withdraw_money(account_id INT, money_amount DECIMAL(19,4))
BEGIN
	START TRANSACTION;
	IF(money_amount < 0 OR (SELECT balance FROM accounts WHERE id = account_id) < money_amount) THEN
		ROLLBACK;
    ELSE
		UPDATE accounts
        SET balance = balance - money_amount
        WHERE id = account_id;
	END IF;
END

#14. Money Transfer
DELIMITER $$
CREATE PROCEDURE usp_transfer_money(from_account_id INT, to_account_id INT, amount DECIMAL(19,4))
BEGIN
	START TRANSACTION;
	IF( ((SELECT COUNT(id) FROM accounts WHERE id LIKE from_account_id) = 1) AND
		((SELECT COUNT(id) FROM accounts WHERE id LIKE to_account_id) = 1) AND
        amount > 0 AND
        ((SELECT balance FROM accounts WHERE id = from_account_id) >= amount) AND
        (from_account_id <> to_account_id)) THEN
			UPDATE accounts
			SET balance = balance - amount
			WHERE id = from_account_id;
			UPDATE accounts
			SET balance = balance + amount
			WHERE id = to_account_id;
		ELSE
			ROLLBACK;
		END IF;
END $$

#15. Log Accounts Trigger (not included in final score)
DELIMITER $$
CREATE DEFINER=`root`@`localhost` TRIGGER `accounts_BEFORE_UPDATE` BEFORE UPDATE ON `accounts` FOR EACH ROW BEGIN
	INSERT INTO `logs`(`account_id`,`old_sum`,`new_sum`)
    VALUES
    (OLD.id, OLD.balance,NEW.balance);
END $$

#16. Emails Trigger (not included in final score)
DELIMITER $$
CREATE TRIGGER `logs_BEFORE_INSERT` BEFORE INSERT ON `logs` FOR EACH ROW BEGIN
	INSERT INTO `notification_emails`(`recipient`,`subject`,`body`)
    VALUES
    (NEW.`account_id`,
    CONCAT('Balance change for account: ',NEW.`account_id`),
    CONCAT('On ',CONCAT(DATE_FORMAT(NOW(),'%b %e %Y at '),DATE_FORMAT(NOW(),'%r')),
    ' your balance was changed from ', NEW.`old_sum`, ' to ', NEW.`new_sum`,'.'));
END $$