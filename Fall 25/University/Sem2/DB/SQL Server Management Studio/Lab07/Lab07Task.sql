/*
	Name: Sumama Rahim
	Registration# F24BSCS039
	Date: 05/04/2025
*/

SELECT *
	FROM Faculty;



	-- The total salary department wise. --
	SELECT Department, SUM(Salary) AS 'Total Salary'
		fROM Faculty
		GROUP BY Department;

	-- The Average salary department wise. --
	SELECT Department, AVG(Salary)
		FROM Faculty
		GROUP BY Department;

	-- Total salary of employees of each designation in each department in the sequence of SE, IET, CS Department.  --
	SELECT Designation, Department, SUM(Salary) AS 'Total Salary'
		FROM Faculty
		GROUP BY Department, Designation
		ORDER BY Department DESC;


	-- Department name and the maximum salary from the department higher than 50K. --
	SELECT Department, MAX(Salary) AS 'MAX Salary'
		FROM Faculty
		GROUP BY Department
		HAVING MAX(Salary) > 50000;