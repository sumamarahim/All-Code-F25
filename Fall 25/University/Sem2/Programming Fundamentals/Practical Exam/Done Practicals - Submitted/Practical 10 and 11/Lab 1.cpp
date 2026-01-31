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
	/**************************** START OF LAB EXERCISE 1 ********************************/
	/*
		Lab Exercise # 1:
			Write a C++ program to Print Table of any Number.
	*/
	
	// Solution
	int table_of;
	
	cout<<"Enter a number to print table for: ";
	cin>>table_of;
	
	for (int i = 1; i <=10; i++)
	{
		cout<<table_of<<" x "<<i<<"\t = "<<table_of*i<<endl;
	}

	/**************************** END OF LAB EXERCISE 1 ********************************/

	return 0;
}
