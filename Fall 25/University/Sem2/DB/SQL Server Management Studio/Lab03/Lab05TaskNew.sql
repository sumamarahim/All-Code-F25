SELECT TOP (1000) [Employee_ID]
      ,[Employee_Name]
      ,[CIty]
      ,[Phone_Number]
      ,[Salary]
      ,[Age]
      ,[Joining_Date]
  FROM [Lab05Task].[dbo].[Employee]
 

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

	
	SELECT *, UPPER(LEFT(Employee_Name, 1))+LOWER(SUBSTRING(Employee_Name, 2 , LEN(Employee_Name))) AS 'First Letter Cap'
		FROM Employee;


	-- LENGTH, CONCATE, SUBSTRING, REPLACE etc --
	SELECT *, LEN(Employee_Name) AS 'Total Chars in Name'
		FROM Employee;

	SELECT CONCAT(Employee_Name,', ', City) AS 'Name, City'
		FROM Employee;

	SELECT *, SUBSTRING(Employee_Name, 1, 6) AS 'Name Substring'
		FROM Employee;

	SELECT *, REPLACE(City, 'Vehari', 'quetta') AS 'New Cities'
		FROM Employee;
		
	SElECT *, LTRIM(Employee_Name) AS 'Left Trimmed'
		FROM Employee;
		
	SElECT *, TRIM(Employee_Name) AS 'Trimmed'
		FROM Employee;

	SElECT *, RTRIM(Employee_Name) AS 'Right Trimmed'
		FROM Employee;

	SELECT *, CHARINDEX(' ', Employee_Name) AS 'Space index in name'
		FROM Employee;


	-----------------------------------------------------------------------------------------------
	-- Query 2: Apply differnet queries to get the joining date and print in different formats --
	-----------------------------------------------------------------------------------------------

	/*
	Date and Time format
	1. Year
		yyyy, yy
	2. Month
		MM, M
	3. Date
		dd, d
	4. Hour
		HH (24 hours), hh (12 hours)
	5. minutes and seconds
		mm, ss
	*/
	
	SELECT *, FORMAT(Joining_Date, 'yyyy-MM-dd') AS 'Format'
		FROM Employee;
		
	SELECT *, FORMAT(Joining_Date, 'MM-yyyy-dd') AS 'Format'
		FROM Employee;
		
	SELECT *, FORMAT(Joining_Date, 'MM-dd-yyyy') AS 'Format'
		FROM Employee;

	SELECT *, FORMAT(Joining_Date, 'dd-MM-yyyy') AS 'Format'
		FROM Employee;
		
	SELECT *, FORMAT(Joining_Date, 'dd-yyyy-MM') AS 'Format'
		FROM Employee;

	SELECT *, FORMAT(Joining_Date, 'yy-MM-dd') AS 'Format'
		FROM Employee;
		
	SELECT *, FORMAT(Joining_Date, 'MM-dd-yy') AS 'Format'
		FROM Employee;

	SELECT *, FORMAT(Joining_Date, 'MM-yy-dd') AS 'Format'
		FROM Employee;




