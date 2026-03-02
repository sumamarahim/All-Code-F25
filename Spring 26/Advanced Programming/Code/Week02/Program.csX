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
            int[] stdMarks = {273, 812, 194, 398, 193, 329};
            Console.WriteLine("\n*** Data in Array ***");
            for (int i = 0; i < stdMarks.Length; i++)
            {
                Console.WriteLine("Value at " + i + " is: " + stdMarks[i]);
            }
            Console.ReadKey();
        }
    }
}