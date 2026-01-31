/***
	Name: Sumama Rahim
	Reg# F24BSCS-039
	Programming Fundamentals - Lab Manual
	BS CS F24 Morning Section A
	--------------------------------------
	
	Practical No.8. Selection logic, or Conditional Logic, Conditional Jump

*/

// Start of Program

#include <iostream>
using namespace std;

int main(){
	/**************************** START OF LAB EXERCISE 2 ********************************/
	/*		
		Lab Exercise # 2:
			Write a Program that takes input at run time and check whether an integer is odd or even.
	*/
	// Solution
	
	int num, modulus;
	
	// input taking
	cout<<"Enter a number to check even or odd: ";
	cin>>num;
	
	// checking
	modulus = num % 2;
	
	if (modulus == 0)
	{
		cout<<"Even";
	}
	else cout<<"Odd";
	/**************************** END OF LAB EXERCISE 2 ********************************/

	return 0;
}
