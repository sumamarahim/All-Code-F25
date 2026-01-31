// Name: Sumama Rahim
// Reg# F24BSCS-039

// Practicle Exam
// Date: 11/07/2024

// Practical N0 3: Learning data-types, variables, constants

#include <iostream>

using namespace std;

int main(){
	// Lab Exercise # 2: Write a program that takes a character, floating point number, Boolean input at run time and display each on console window on a different line.
	
	char gender;
	float height;
	bool attandee;
	
	// taking input from the user
	cout<<"Enter your gender (m/f): ";
	cin>>gender;
	
	cout<<"Enter your hieght: ";
	cin>>height;
	
	cout<<"Enter your attandance (1/0): ";
	cin>>attandee;


	// displaying the inputs
	cout<<"The char entered: "<<gender<<endl;
	cout<<"The float entered: "<<height<<endl;
	cout<<"The bool entered: "<<attandee<<endl;
	
	return 0;
}

