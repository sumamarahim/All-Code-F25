/*
	Name: Sumama Rahim
	Registration# F24BSCS039
	Date: 05/04/2025
*/

/* 
		Apply all of the manipulation queries discussed in the lab to
		retrieve, update, and delete the records.
*/

	-- DML --

	-- 1. Data retrievel using SELECT statement --
	SELECT *
		FROM Employees;

	-- 2. Data insertion using INSERT statement --
	INSERT INTO Employees (Employee_ID, Employee_Name, City, Phone_Number, Salary, Age, Joining_Date)
	VALUES 
		(101,		'Ali',		'Islamabad',	0323423,	90000,	27,	'2024-03-02'),
		(102,		'Sameer',	'Lahore',		0342322,	85000,	26,	'2023-07-02'),
		(103,		'Khan',		'Karachi',		0342331,	79000,	25,	'2023-05-02'),
		(104,		'Saad',		'Peshawar',		0334320,	95000,	29,	'2022-01-02');
	
	PRINT 'Records successfully inserted';

	-- Inserting Data Only in Specified Columns --
	INSERT INTO Employees (Employee_ID, Employee_Name, City, Phone_Number, Salary, Age, Joining_Date)
	VALUES 
		(105,		'Naveid',		'Quetta',	0323997,	92000,	26,	'2024-01-02');

	PRINT 'New record inserted successfully';
	
	-- Trying to add another record --
	INSERT INTO Employees (Employee_ID, Employee_Name, City, Phone_Number, Salary, Age, Joining_Date)
	VALUES 
		(106,		'Kashif',	'2024-01-02'); -- This won't be recorded

		

	-- 3. Update Data using UPDATE statement --
	UPDATE Employees
		SET Employee_ID = 114, Employee_Name = 'Saim'
		WHERE Employee_ID = 104;
	PRINT 'Employee ID and Name Updated';
	
	-- if WHERE clause omitted --
	UPDATE Employees
		SET Age = 29;
	PRINT 'Age updated for all';

	-- updating multiple records --
	UPDATE Employees
		SET Age = 31
		WHERE City = 'Karachi'; -- it will update all when city = Karachi

	-- 4. Delete Data using DELETE statement --
	DELETE FROM Employees
		WHERE Employee_Name = 'Naveid';
	PRINT 'Record has been deleted Successfully';

	-- Omitting WHERE Clause --
	DELETE FROM Employees;


SELECT * FROM Employees;
	
