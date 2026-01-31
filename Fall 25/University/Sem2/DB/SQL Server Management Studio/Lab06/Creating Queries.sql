-- database creating using query --
CREATE DATABASE University;
GO

USE University;
GO

-- Creating table --
CREATE TABLE Faculty (
	ID INT PRIMARY KEY,
	Faculty_Name VARCHAR(100),
	Designation VARCHAR(30),
	Age INT,
	Salary INT,
	Phone_Numaber VARCHAR(11),
	City VARCHAR(50),
	Joining_Date DATE,
	Experience INT,
	Department VARCHAR(30)
);



--Step 3: Insert Data (7 Faculty per Department x 3 = 21 total)
--We will follow this structure per department:
--1 Professor
--1 Associate Professor
--2 Assistant Professors
--3 Lecturers
--Each with variation in experience (≤ 5 or > 5)

-- IET Department
INSERT INTO Faculty VALUES (1, 'Dr. Ahmad Raza', 'Professor', 50, 160000, '03001234567', 'Islamabad', '2015-08-15', 9, 'IET');
INSERT INTO Faculty VALUES (2, 'Dr. Samina Khan', 'Associate Professor', 45, 140000, '03011234567', 'Lahore', '2017-02-10', 7, 'IET');
INSERT INTO Faculty VALUES (3, 'Mr. Hamza Ali', 'Assistant Professor', 35, 110000, '03021234567', 'Rawalpindi', '2020-01-12', 4, 'IET');
INSERT INTO Faculty VALUES (4, 'Ms. Ayesha Tariq', 'Assistant Professor', 32, 120000, '03031234567', 'Islamabad', '2018-09-01', 6, 'IET');
INSERT INTO Faculty VALUES (5, 'Mr. Noman Qureshi', 'Lecturer', 29, 80000, '03041234567', 'Multan', '2022-02-01', 2, 'IET');
INSERT INTO Faculty VALUES (6, 'Ms. Mehwish Zahra', 'Lecturer', 30, 90000, '03051234567', 'Lahore', '2020-08-10', 6, 'IET');
INSERT INTO Faculty VALUES (7, 'Mr. Usman Saeed', 'Lecturer', 28, 80000, '03061234567', 'Peshawar', '2023-01-15', 3, 'IET');

-- SE Department
INSERT INTO Faculty VALUES (8, 'Dr. Bilal Ahmed', 'Professor', 52, 160000, '03071234567', 'Karachi', '2014-07-10', 10, 'SE');
INSERT INTO Faculty VALUES (9, 'Dr. Zainab Farooq', 'Associate Professor', 46, 140000, '03081234567', 'Islamabad', '2016-03-05', 8, 'SE');
INSERT INTO Faculty VALUES (10, 'Mr. Ali Zafar', 'Assistant Professor', 34, 110000, '03091234567', 'Faisalabad', '2021-01-10', 5, 'SE');
INSERT INTO Faculty VALUES (11, 'Ms. Maria Yousaf', 'Assistant Professor', 33, 120000, '03101234567', 'Lahore', '2019-06-20', 7, 'SE');
INSERT INTO Faculty VALUES (12, 'Mr. Taimoor Aslam', 'Lecturer', 27, 80000, '03111234567', 'Quetta', '2023-03-11', 2, 'SE');
INSERT INTO Faculty VALUES (13, 'Ms. Sana Javed', 'Lecturer', 31, 90000, '03121234567', 'Islamabad', '2020-04-15', 6, 'SE');
INSERT INTO Faculty VALUES (14, 'Mr. Faizan Shah', 'Lecturer', 28, 80000, '03131234567', 'Lahore', '2022-07-10', 4, 'SE');

-- CS Department
INSERT INTO Faculty VALUES (15, 'Dr. Naveed Iqbal', 'Professor', 54, 160000, '03141234567', 'Peshawar', '2013-10-12', 10, 'CS');
INSERT INTO Faculty VALUES (16, 'Dr. Amna Shabbir', 'Associate Professor', 44, 140000, '03151234567', 'Multan', '2017-08-25', 7, 'CS');
INSERT INTO Faculty VALUES (17, 'Mr. Saad Khalid', 'Assistant Professor', 36, 110000, '03161234567', 'Rawalpindi', '2021-09-01', 3, 'CS');
INSERT INTO Faculty VALUES (18, 'Ms. Noor Fatima', 'Assistant Professor', 37, 120000, '03171234567', 'Sialkot', '2019-03-01', 6, 'CS');
INSERT INTO Faculty VALUES (19, 'Mr. Asif Mehmood', 'Lecturer', 30, 80000, '03181234567', 'Gujranwala', '2022-11-01', 1, 'CS');
INSERT INTO Faculty VALUES (20, 'Ms. Hira Imran', 'Lecturer', 32, 90000, '03191234567', 'Islamabad', '2020-07-11', 7, 'CS');
INSERT INTO Faculty VALUES (21, 'Mr. Hassan Jameel', 'Lecturer', 29, 80000, '03201234567', 'Bahawalpur', '2023-05-15', 3, 'CS');
