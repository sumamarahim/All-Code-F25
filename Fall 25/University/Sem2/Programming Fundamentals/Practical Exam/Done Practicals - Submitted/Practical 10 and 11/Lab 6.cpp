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
	/**************************** START OF LAB EXERCISE 6 ********************************/
	/*
		Lab Exercise # 6:
			Write a program to print natural numbers in reverse from n to 1 using while loop.
	*/
	
	// Solution
	int n_num;
	
	// taking input n number
	cout<<"Enter number to print ultil that in reverse: ";
	cin>>n_num;
	
	while (n_num >= 1)
	{
		cout<<n_num<<" ";
		n_num--;
	}

	/**************************** END OF LAB EXERCISE 6 ********************************/

	return 0;
}
