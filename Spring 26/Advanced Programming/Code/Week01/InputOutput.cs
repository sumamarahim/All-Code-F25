/**
Name: Sumama Rahim
Reg# F24BSCS039
Date: 02/27/2026
**/

// using System;

// Week 01: Input (Strings and Numbers) and Output in C#
namespace Week01
{
  class Program
  {
    static void Main(string[] args)
    {
        // declaring variables
        String stdName, stdReg, stdClass;
        // Taking inputs
        Console.WriteLine("Enter Student Name: ");
        stdName = Console.ReadLine();
        Console.WriteLine("Enter Student Reg# ");
        stdReg = Console.ReadLine();
        Console.WriteLine("Enter Student Class");
        stdClass = Console.ReadLine();

        // reading numerical value
        double obtMarks, totalMarks, percentage;
        Console.WriteLine("Enter Total Marks");
        totalMarks = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Enter Obtained Marks");
        obtMarks = Convert.ToDouble(Console.ReadLine());
        percentage = (obtMarks*100)/totalMarks;

        // Displaying Student Details
        Console.WriteLine(); // For blank line
        Console.WriteLine("*** Student Details ***");
        Console.WriteLine("Student Name: " + stdName
        + "\nStudent Reg# " + stdReg 
        + "\nStudent Class: " + stdClass
        + "\nObtained Marks: " + obtMarks
        + "\nPercentage: " + percentage);
          
    }
  }
}