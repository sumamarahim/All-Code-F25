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

	/**************************** START OF LAB EXERCISE 3 ********************************/
	/*		
	Lab Exercise # 3:
		Input at run time: Marks	
		Process : 
		If mark greater than and equal to 75, score will be A If mark less than 75 and greater than and
		equal to 60, score will be B If mark less than 60 and greater than and equal to 45,
		score will be C If mark less than 30, score will be D
		Output: Print the grade of the score.
	*/
	// Solution
	
	int marks;
	
	// taking input
	cout<<"Enter your marks (out of 100): ";
	cin>>marks;
	
	// checking
	if (marks >= 75)
	{
		cout<<"Grade is A";
	}
	
	else if(marks < 75 && marks >= 60)
	{
		cout<<"Grade is B";
	}
	
	else if(marks < 60 && marks >= 45)
	{
		cout<<"Grade is C";
	}
	
	else if(marks < 30)
	{
		cout<<"Grade is D";
	}

	/**************************** END OF LAB EXERCISE 3 ********************************/
	
	return 0;
}
