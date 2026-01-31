/***
	Name: Sumama Rahim
	Reg# F24BSCS-039
	Programming Fundamentals - Lab Manual
	BS CS F24 Morning Section A
	--------------------------------------
	
	Practical No.7 Relational & Logical Operators

*/

// Start of Program

#include <iostream>
using namespace std;

int main(){
	/**************************** START OF LAB EXERCISE 2 ********************************/
	/*		
		Lab Exercise # 2:
			Write a C++ Program that uses the logical AND operator to avoid division by zero: 
			(Hint: (y != 0) && (x / y)
	*/
	
	// Solution
	
	float x, y;
	cout<<"Enter x and y to divide: ";
	cin>>x>>y;
	
	// using if-else
	if (y != 0 && x/y)
	{
		cout<<"Not Dividing by ZERO so answer is: "<<x/y<<endl;
	}
	else
	{
		cout<<"You are not allowed to divide by ZERO..."<<endl;
	}
	
	/**************************** END OF LAB EXERCISE 2 ********************************/
	
	return 0;
}
