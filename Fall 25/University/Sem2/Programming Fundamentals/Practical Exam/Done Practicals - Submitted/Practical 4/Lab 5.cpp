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
	
	/**************************** START OF LAB EXERCISE 5 ********************************/
	/*
	Lab Exercise # 5:
		Write a program to convert temperature in degree Celsius into Fahrenheit and vice versa.
	*/
	
	// Solution
	
	// var daclaration
	float deg_cel = 37, deg_fah = 98.6, celsius, fahrenheit;
	
	// calculations
	celsius = ((deg_cel*1.8)+32);
	fahrenheit = (deg_fah-32)/(1.8);
	
	cout<<"Degree in Fahrenheit: "<<celsius<<endl;
	cout<<"Degree in Celsius: "<<fahrenheit<<endl;
	/**************************** END OF LAB EXERCISE 5 ********************************/
	
	return 0;
}
