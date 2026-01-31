/***
	Name: Sumama Rahim
	Reg# F24BSCS-039
	Programming Fundamentals - Lab Manual
	BS CS F24 Morning Section A
	--------------------------------------
	
	Practical No. 10, 11: Repetitive/ Iterative Logic, Loops

*/

// Start of Program

#include <iostream>
using namespace std;

int main(){
	/**************************** START OF LAB EXERCISE 5 ********************************/
	/*		
		Lab Exercise # 5:
			Write a C++ program that will print the following pattern using for Loop.
			*
			**
			***
			****
			******
			*******
	*/
	
	// Solution
	
	for (int i = 1; i <=7; i++)
	{
		for (int j = 1; j<=i; j++)
		{
			cout<<"*";
		}
	cout<<"\n";
	}
		
	/**************************** END OF LAB EXERCISE 5 ********************************/

	return 0;
}
