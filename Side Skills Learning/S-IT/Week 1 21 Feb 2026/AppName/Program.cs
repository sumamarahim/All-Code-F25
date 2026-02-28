// using System;

using System.ComponentModel;
using System.Data;
using System.Data.SqlTypes;
using System.Diagnostics;
using System.Diagnostics.Tracing;
using System.Net;
using System.Reflection.Emit;
using System.Runtime.CompilerServices;

namespace AppName
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

        // Displaying Student Details
        Console.WriteLine(); // For blank line
        Console.WriteLine("*** Student Details ***");
        Console.WriteLine("Student Name: " + stdName
        + "\nStudent Reg# " + stdReg 
        + "\nStudent Class: " + stdClass);
        

        // reading numerical value
        double obtMarks, totalMarks;
        
    }
  }
}