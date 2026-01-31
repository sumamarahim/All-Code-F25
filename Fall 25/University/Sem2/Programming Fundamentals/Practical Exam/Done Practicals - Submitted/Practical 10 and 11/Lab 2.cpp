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
	/**************************** START OF LAB EXERCISE 2 ********************************/
	/*		
		Lab Exercise # 2:
			Write a method with a for loop that computes the sum of first n positive integers: 
			sum = 1 + 2 + 3 + … + n
	*/
	
	// Solution
	int n_num, sum = 0;
	
	cout<<"Enter n number to add all: ";
	cin>>n_num;
	
	for (int i = 1; i<=n_num; i++)
	{
		sum = sum + i;
	}
	cout<<endl<<sum;

	/**************************** END OF LAB EXERCISE 2 ********************************/

	return 0;
}
