/**
	Name: Sumama Rahim
	Registration# F24BSCS039
	Date: 04/27/2025
*/

--- Lab06 Task --

SELECT *
  FROM Faculty;


  -- Q1. the minimum salary being paid to any faculty member. --
  SELECT MIN(Salary) AS 'Minimum salary'
	FROM Faculty;


	
  -- Q2. the maximum salary being paid to any faculty member. --
  SELECT MAX(Salary) AS 'Maximum Salary'
	FROM Faculty;

 -- Q3. the employee who is being paid the highest salary in the university. 
 SELECT *
	FROM Faculty
	WHERE Salary = (SELECT MAX(Salary) FROM Faculty);

 -- Q4. the lecturer who is being paid the lowest salary in the CS department. 
 SELECT *
	FROM Faculty
	WHERE Designation = 'Lecturer' AND Department = 'CS' AND Salary = (SELECT MIN(Salary) FROM Faculty);


	-- Q5. the minimum salary being paid to any Assistant Professor.
	SELECT  *
		FROM Faculty
		WHERE Designation = 'Associate Professor' OR Salary > (SELECT MAX(Salary) FROM Faculty);

	-- Q6. the total number of faculty members of the university.
	SELECT COUNT(Designation) AS 'Total Faculty Members'
		FROM Faculty;

	-- Q7. the total number of Lecturers serving in the university.
	SELECT COUNT(Designation) AS 'No. of Lecturers'
		FROM Faculty
		WHERE Designation = 'Lecturer';

	-- Q8. the total number of faculty members from Islamabad. 
	SELECT *
		FROM Faculty
		WHERE City = 'Islamabad';

	-- Q9. the names of cities from which different faculty members belong.
	SELECT DISTINCT(City)
		FROM Faculty;

	-- Q10. the total amount of salary being paid to all faculty members.
	SELECT SUM(Salary) AS 'Total Paid salaries'
		FROM Faculty;

	-- Q11. the total salary being paid to professors of the university.
	SELECT SUM(Salary) AS 'Salary paid to all professors'
		FROM Faculty
		WHERE Designation = 'Professor';


	-- Q12. the total salary being paid to lecturers of the IET department. 
	SELECT SUM(Salary) AS 'total salary paid to IET lecturers'
		FROM Faculty
		WHERE Designation = 'Lecturer' AND Department = 'IET';

	-- Q13. the annual salary being paid to an Associate Professor. 
	SELECT Salary*12 AS 'Per annum salary of Associate Prof.'
		FROM Faculty
		WHERE Designation = 'Associate Professor';

	-- Q14. the faculty members who are earning more than the average salary of all employees
	SELECT *
		FROM Faculty
		WHERE Salary > (SELECT AVG(Salary) FROM Faculty);

	-- Q15. One professor, one AP, and one lecturer joined the IET department in 2023, calculate the annual increment of the salary budget of the IET department.
	SELECT SUM(Salary)*12 AS 'New Annual increment of Salary Budget of IET Department'
		FROM Faculty
		WHERE Department = 'IET' AND ID > 21 -- new faculty members are added

	-- Q16. Show the faculty members and their joining date in the format "day, Month date, year" who will retire in the next 5 years if the retirement age is 60
	SELECT FORMAT(Joining_Date, 'dd-MM-yyyy') AS 'Joining Date', Age
		FROM Faculty
		WHERE Age >= 55; -- returns all, who will retire in next 5 years
		



