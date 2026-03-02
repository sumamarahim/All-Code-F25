/**
Name: Sumama Rahim
Reg# F24BSCS039
Date: 03/02/2026
**/

using System;
namespace Week02
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] stdMarks = new int[6]; // resevse 6 memory locationsint typed for array stdMarks
            Console.WriteLine("Enter Array Elements (one per line): ");
            // loop for taking input from the users
            for (int i = 0; i < stdMarks.Length; i++)
            {
                stdMarks[i] = Convert.ToInt16(Console.ReadLine());
            }
            // loop for diplaying array value
            Console.WriteLine("\n*** Entered Data in Array ***");
            for (int i = 0; i < stdMarks.Length; i++)
            {
                Console.WriteLine("Value at " + i + " is: " + stdMarks[i]);
            }
            Console.ReadKey();
        }
    }
}