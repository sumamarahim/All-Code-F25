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
	/**************************** START OF LAB EXERCISE 7 ********************************/
	/*
		Lab Exercise # 7:
			Write a program to print all even numbers between i to n using while loop.
	*/
	
	// Solution
	int i_num, n_num;
	
	// taking input n number
	cout<<"Enter initial number: ";
	cin>>i_num;
	cout<<"Enter last number: ";
	cin>>n_num;
	
	
    	if (i_num % 2 != 0)
		i_num += 1;
    	
		while (i_num < n_num)
		{
			cout<<i_num<<" ";
			i_num = i_num + 2;
		}

	/**************************** END OF LAB EXERCISE 7 ********************************/

	return 0;
}
