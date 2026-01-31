USE TestingQueries
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 5/4/2025 11:38:36 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employees](
	[Employee_ID] [int] NOT NULL,
	[Employee_Name] [nchar](30) NOT NULL,
	[CIty] [nchar](30) NOT NULL,
	[Phone_Number] [nchar](10) NOT NULL,
	[Salary] [nchar](10) NOT NULL,
	[Age] [nchar](10) NOT NULL,
	[Joining_Date] [date] NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (101, N'Shaheer Ahmad                 ', N'Islamabad                     ', N'030425456 ', N'95000.85  ', N'44.5      ', CAST(N'1995-02-02' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (102, N'usman khan                    ', N'islamabad                     ', N'034452458 ', N'85000.75  ', N'44        ', CAST(N'1999-03-03' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (103, N'areeb ali                     ', N'Rawalpindi                    ', N'033452136 ', N'90000.85  ', N'44.5      ', CAST(N'1997-04-04' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (104, N'Qasim Khan                    ', N'lahore                        ', N'032052436 ', N'70000.00  ', N'44.55     ', CAST(N'2001-05-05' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (105, N'Hamza murad                   ', N'multan                        ', N'030005354 ', N'75000.00  ', N'44.5      ', CAST(N'2005-06-06' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (106, N'Rizwan Ashraf                 ', N'Peshawar                      ', N'034564786 ', N'80000.00  ', N'44.2      ', CAST(N'2007-07-07' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (107, N'aqeeb adil                    ', N'Quetta                        ', N'037542132 ', N'85000.00  ', N'44.55     ', CAST(N'2010-08-08' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (108, N'Zafar Iqbal                   ', N'Islamabad                     ', N'035789456 ', N'70000.00  ', N'55.4      ', CAST(N'2009-09-09' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (109, N'awais Akram                   ', N'Islamabad                     ', N'032154321 ', N'90000.00  ', N'42        ', CAST(N'2012-01-01' AS Date))
INSERT [dbo].[Employees] ([Employee_ID], [Employee_Name], [CIty], [Phone_Number], [Salary], [Age], [Joining_Date]) VALUES (110, N'muHammad waQar                ', N'Vehari                        ', N'031152423 ', N'90000.00  ', N'45.8      ', CAST(N'2013-01-01' AS Date))
GO
