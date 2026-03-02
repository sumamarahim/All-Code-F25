// using System;

// Week 01: Input (Strings and Numbers) and Output in C#
namespace Week01
{
  class Decisions
  {
    static void Main(string[] args)
    {
      Console.WriteLine("\n\n***** Decisions in C# ******");

      // Decision making in C#
      // IF statement is same as it is in C/C++ or Java
      Console.WriteLine("Enter your fav number: ");
      int favNum = Convert.ToInt16(Console.ReadLine());

      if ((favNum%2 == 0) & (favNum != 0))
      {
        Console.WriteLine("You love Even numbers");
      } else if (favNum%2 == 1)
      {
        Console.WriteLine("You love Odd Numbers");
      } else if (favNum == 0)
      {
        Console.WriteLine("You love ZERO!");
      } else
      {
        Console.WriteLine("You don't love numbers!");
      }

      // Switch Statements in C#
      char gender;
      Console.WriteLine("Enter Gender (m/f): ");
      gender = Convert.ToChar(Console.ReadLine());

      switch (gender)
      {
        case 'm':
        Console.WriteLine("Male");
        break;
        case 'f':
        Console.WriteLine("Female");
        break;
        default:
        Console.WriteLine("Enter only m or f.");
        break;
      }
    }
  }
}