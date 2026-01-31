-- 1. Showing all the inserted record --
SELECT *
	FROM Employee;

-- 2. Showing Employees with their salaries --
SELECT Name, Salary
	FROM Employee;


-- 3. Showing all distinct cities of the Employees --
SELECT DISTINCT Address AS City
	FROM Employee;

-- 4. Showing the salary of employees as updated_Salary, if each employee gets an increment of 10,000 --
SELECT ID, Name, Salary, (Salary+10000) AS updated_Salary
	FROM Employee;
	
-- 5. Showing the salary of employees as Payable_Salary, if a new tax of 20% is imposed on current salary --
SELECT ID, Name, Salary, (Salary-(20*Salary/100)) AS Payable_Salary
-- OR (Salary-(0.2*Salary) AS Payable_Salary --
	FROM Employee;

	-- Merger of 4 and 5 Point --
-- 5. Showing the salary of employees as Payable_Salary, if a new tax of 20% is imposed on current salary --
SELECT ID, Name, Salary AS previuos_Salary, Salary+10000 
	AS updated_Salary, ((Salary+10000)-(0.2*(Salary+10000))) AS Payable_Salary
	FROM Employee;


