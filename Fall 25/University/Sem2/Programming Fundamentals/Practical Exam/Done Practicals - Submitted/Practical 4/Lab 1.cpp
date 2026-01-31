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
	/**************************** START OF LAB EXERCISE 1 ********************************/
	/*
	Lab Exercise # 1:
		Write a Program to Add, Subtract, Multiply and Divide 
		two Numbers and display it on screen.
	*/
	
	// Solution
	
	// Adding two numbers
	int add_num1 = 7, add_num2 = 6, add;
	add = add_num1 + add_num2;
	cout<<"Addition: "<<add<<endl;
	
	
	// Subtracting 
	int sub_num1 = 9, sub_num2 = 7, sub;
	sub = sub_num2 - sub_num1;
	cout<<"Subtraction: "<<sub<<endl;
	
	// Multiplying
	int mul_num1 = 6, mul_num2 =7, mul;
	mul = mul_num1 * mul_num2;
	cout<<"Multiplication: "<<mul<<endl;
	
	
	// Dividing
	int div_num1 = 9, div_num2 = 81;
	cout<<"\nDivide: "<<(div_num2/div_num1)<<endl;
	/**************************** END OF LAB EXERCISE 1 ********************************/

	return 0;
}
