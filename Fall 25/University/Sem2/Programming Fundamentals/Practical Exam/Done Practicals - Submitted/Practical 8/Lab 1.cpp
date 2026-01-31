/***
	Name: Sumama Rahim
	Reg# F24BSCS-039
	Programming Fundamentals - Lab Manual
	BS CS F24 Morning Section A
	--------------------------------------
	
	Practical No.8. Selection logic, or Conditional Logic, Conditional Jump

*/

// Start of Program

#include <iostream>
using namespace std;

int main(){
	/**************************** START OF LAB EXERCISE 1 ********************************/
	/*
		Lab Exercise # 1:
			Write a program to print positive number entered by the user. 
			If the user enters negative number print 
			number entered is positive otherwise print number is negative.
	*/
	
	// Solution
	
	int num;
	
	// taking input from the user
	cout<<"Enter a number to check +ve or -ve: ";
	cin>>num;
		
	// checking
	if (num < 0)
	{
		cout<<"Entered number is POSITIVE";
	}
	else
	{
		cout<<"Entered number is NEGATIVE";
	}
	
	/**************************** END OF LAB EXERCISE 1 ********************************/
	
	return 0;
}
