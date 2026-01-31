/* Case conversion
	1. UPPER()
	2. LOWER()
*/

SELECT UPPER(Customer_Name) AS 'NAME IN UPPER CASE'
	FROM Customer;


SELECT LOWER(Customer_Name) AS 'name in lower case'
	FROM Customer;

SELECT UPPER(Customer_Name) AS 'UPPERCASED',
	LOWER(Country) AS 'lowercase country name'
	FROM Customer;

	-- INITCAP() alternative --
	--Syntex: SELECT UPPER(LEFT(Table, Char#))+LOWER(SUBSTRING(Table, from, to)) --

SELECT UPPER(LEFT(Customer_Name, 1))+LOWER(SUBSTRING(Customer_Name, 2, LEN(Customer_Name)))
	AS 'Customer Name'
	FROM Customer;


	--2. Character Manipulation --
	--i. LEN() or LENGTH() --
SELECT Customer_Name AS 'Name', LEN(Customer_Name) AS 'Length'
	FROM Customer;

SELECT Customer_Name AS 'Name', LEN(Customer_Name) AS 'Length', Country AS 'Country', LEN(Country) AS 'Length'
	FROM Customer;

	-- LEN() on int type --
SELECT Age AS 'Age', LEN(Age) AS 'Length'
	FROM Customer;

	-- ii. Concatenation - CONCAT() or CONCATENATE() --
SELECT CONCAT(Customer_Name, Age, ', ', Country) AS 'Concatenated'
	FROM Customer;
	
	-- iii. SUBSTRING() or SUBSTR() --
SELECT SUBSTRING(Customer_Name, 1, 5) AS 'SUBSTRINGED'
	FROM Customer;

SELECT SUBSTRING(Customer_Name, 3, LEN(Customer_Name)) AS 'SUBSTRINGED'
	FROM Customer;


	-- iv. REPLACE() --
SELECT REPLACE(Country, 'Indonisia', 'Russia') AS 'Updated Country'
	FROM Customer;


	-- v. TRIM(), LTRIM(), RTRIM() --
SELECT TRIM(' Pakistan ') AS 'Trimmed',
		RTRIM(' Pakistan ') AS 'Right Trimmed',
		LTRIM(' Pakistan ') AS 'Left Trimmed';

	-- vi. CHARINDEX() or INSTR() --
SELECT Customer_Name, CHARINDEX(' ', Customer_Name) AS 'index of Space at'
	FROM Customer;


	-- Numeric Functions --
	-----------------------



