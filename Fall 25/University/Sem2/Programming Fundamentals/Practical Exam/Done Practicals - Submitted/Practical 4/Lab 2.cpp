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
	/**************************** START OF LAB EXERCISE 2 ********************************/
	/*
	Lab Exercise # 2:
		Write a Program that takes two Numbers with fractional parts at run time, Add, Subtract, Multiply and
		Divide them and display it on screen.	
	*/
	
	// Solution
	
	// var daclaration
	float num1, num2, add, sub, mul, div;
	
	// Taking input from the user
	cout<<"Enter Two Numbers: "<<endl;
	cin>>num1>>num2;
	
	// Operations
	add = num1 + num2;
	sub = num2 - num1;
	mul = num1 * num2;
	div = num2/num1;

	// Displaying Results
	cout<<"Add: "<<add<<endl;
	cout<<"Sub: "<<sub<<endl;
	cout<<"Mul: "<<mul<<endl;
	cout<<"Div: "<<div<<endl;

	/**************************** END OF LAB EXERCISE 2 ********************************/
	
	return 0;
}
