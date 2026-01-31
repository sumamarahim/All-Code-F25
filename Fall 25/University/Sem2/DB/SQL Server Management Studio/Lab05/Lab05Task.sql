/*
	Name: Sumama Rahim
	Registration# F24BSCS039
	Date: 04-18-20257
*/


-- Query 1. Apply all of the character and string functions and report the output --

	-- Changing case --
	SELECT *, UPPER(Employee_Name) AS 'UPPER CASED'
		FROM Employee;

	SELECT *, UPPER(City) AS 'UPPER CASED'
		FROM Employee;

	SELECT *, LOWER(Employee_Name) AS 'lower cased'
		FROM Employee;

	SELECT *, LOWER(Employee_Name) AS 'lower cased'
		FROM Employee;

	
	SELECT *, UPPER(LEFT(Employee_Name, 1))+LOWER(SUBSTRING(Employee_Name, 2 , LEN(Employee_Name))) AS 'lower cased'
		FROM Employee;



