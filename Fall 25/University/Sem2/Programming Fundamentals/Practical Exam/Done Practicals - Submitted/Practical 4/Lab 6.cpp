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
	
	/**************************** START OF LAB EXERCISE 6 ********************************/
	/*
	Lab Exercise # 6:
		Write a program to find the circumference, area, diameter and radius of a circle.
	*/
	
	// Solution
	
	// var daclaration
	float radius, area, circumference;
	float pi = 3.14, diameter = 8;
	radius = 5.9;
	circumference = 2*pi*radius;	// 2piR
	area = pi*(radius*radius);	// pi*R^2
	
	// calculations
	cout<<"The Diameter of the given radius is: "<<2*radius<<endl;
	cout<<"The circumference is: "<<circumference<<endl;
	cout<<"The Area is: "<<area<<endl;
	
	// radius if the diameter is given
	cout<<"Radius if the diameter is given: "<<diameter/2<<endl;
	
	/**************************** END OF LAB EXERCISE 6 ********************************/

	
	return 0;
}
