/***
	Name: Sumama Rahim
	Reg# F24BSCS-039
	Programming Fundamentals - Lab Manual
	BS CS F24 Morning Section A
	--------------------------------------
	
	Practical N0.4: Arithmetic Operators, Expression 

*/

// Start of Program

#include <iostream>
using namespace std;

int main(){
	
	/**************************** START OF LAB EXERCISE 4 ********************************/
	/*
	Lab Exercise # 4:
		Write a program that takes students numbers in six subjects at runtime and find the Percentage of Obtained
		Marks.
	*/
	
	// Solution
	
	// var daclaration
	int marks1, marks2, marks3, marks4, marks5, marks6, percent;
	
	// taking input
	cout<<"Enter Your Six Subject Marks (each out of 100): ";
	cin>>marks1>>marks2>>marks3>>marks4>>marks5>>marks6;
	
	percent = ((marks1+marks2+marks3+marks4+marks5+marks6)*100)/600;
	cout<<"The Percentage is: "<<percent<<"%"<<endl;
	
	/**************************** END OF LAB EXERCISE 4 ********************************/
		
	return 0;
}
