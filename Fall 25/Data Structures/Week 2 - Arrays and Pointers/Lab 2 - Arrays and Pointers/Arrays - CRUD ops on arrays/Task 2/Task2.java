/*
  Name: Sumama Rahim
  Registration# F24BSCS039
  Subject: Data Structures and Algorithms
  Instructor: Ms. Engr. Afifa Zafar
  Date: 09/27/2025
  
  
  Lab 2: Arrays and Pointers
*/

/* Task 2: [Time required: 25 minutes]

Write a program that lets a maker of chips and salsa keep track of sales for five different types of salsa: mild, medium, sweet, hot, and zesty.

The program should use two parallel 5-element arrays: an array of strings that holds the five salsa names and an array of integers that holds the number of jars sold during the past month for each salsa type. The salsa names should be stored using an initialization list at the time the name array is created.

The program should prompt the user to enter the number of jars sold for each type. Once this sales data has been entered, the program should produce a report that displays sales for each salsa type, total sales, and the names of the highest-selling product.

Input Validation: Do not accept negative values for the number of jars sold.
*/


import java.util.Scanner; // to take input we need Scanner class

class Sales 
{
    Scanner take = new Scanner(System.in);
    
    int cap = 5; // number of elements
    
    String[] salsaNames = {"mild", "medium", "sweet", "hot", "zesty"};
    int[] soldJars = new int[cap];
    
    // function to take input
    void input()
    {
      System.out.println("Enter the number of total sold jars");
      
      for (int i = 0; i < salsaNames.length; i++)
      {
        System.out.print(i+1 + ". " + salsaNames[i] + ": "); 
        soldJars[i] = take.nextInt();
      }
      take.close(); // to close Scanner connection
    }
    
    
    // function to display sales report
    void report()
    {
      int totalSales = 0;
      System.out.println("\nSales Report - Last Month");
      System.out.println("Product\t\tJars Sold\n--------\t----------");
      for (int i = 0; i < salsaNames.length; i++)
      {
        System.out.println(i+1 + ". " + salsaNames[i] + ": \t" + soldJars[i]);
        totalSales += soldJars[i]; // to calculate total sales
      }
      
      // total sales
      System.out.println("--------\t--------\nTotal Sales: \t" + totalSales);
      
      // name of highest selling product
      int highest = 0;
      for (int i = 0; i < soldJars.length; i++)
      {
        if (soldJars[i+1] < soldJars[i]);
        highest = soldJars[i];
      }
      
        System.out.println("Highest: " + highest);
      // arrange the names of highest selling product (Desc order)
    }
}


// brute force approach
public class Task2
{
  public static void main(String... args)
  {
    Sales show = new Sales();
    show.input();
    show.report();
  }
}
