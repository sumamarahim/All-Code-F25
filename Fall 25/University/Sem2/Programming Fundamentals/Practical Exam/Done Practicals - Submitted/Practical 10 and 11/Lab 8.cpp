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
	/**************************** START OF LAB EXERCISE 8 ********************************/
	/*		
		Lab Exercise # 8:
			Write a C++ program that will print the following pattern using for Loop.
			1 2 3 4
			1 2 3
			1 2
			1
	*/
	
	// Solution
	
	for (int i = 4; i >= 1; i--)
	{
		for (int j = 1; j <= i; j++)
		{
			cout<<j;
		}
		cout<<"\n";
	}
	
	/**************************** END OF LAB EXERCISE 8 ********************************/

	return 0;
}
