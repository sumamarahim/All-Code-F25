-- Selecting all columns
SELECT *
	FROM Customer;

-- Selecting specific column/s
SELECT Customer_Name, Age, Country
	FROM Customer;

-- Selecting only unique records in a column/s
SELECT DISTINCT Country
	FROM Customer;

-- Arithmetic Operations
SELECT Customer_Name, Age, Age-5, Age+5, Age/5, Age*2, Country
	FROM Customer;

SELECT Customer_Name, Age, (Age/5)+2, Age*2/3+4-1, Country
	FROM Customer;

-- Arithmetic Operator Precedence
SELECT Customer_Name, Age, Age-5, 2*(Age+5), Country
	FROM Customer;

-- Adding Alias for column - by AS keyword like Column_Name AS "Alias_Name"
SELECT Customer_Name, Age, Age-5 AS "Age-5" , Age+5 AS "Age+5", Age/5 AS "Age/5" , Age*2 AS "Age*2", Country
	FROM Customer;

-- Concatenation Operator - Syntax CONCAT(Expression1, Expression2, ...)
SELECT Customer_Name, CONCAT(Age, Country) AS "Concatenated_Column"
	FROM Customer;