// Name: Sumama Rahim
// Reg# F24BSCS-039

// Practicle Exam
// Date: 11/07/2024

// Practical N0 3: Learning data-types, variables, constants

#include <iostream>

using namespace std;

int main(){
	// Lab Exerice 6: Assume a program has the following variable definitions:
	/**
		int a, b = 2; float c = 4.2;
		and the following statement: a = b * c;
		What value will be stored in a?
	*/
	int a, b = 2; float c = 4.2;
	a = b * c;
	// the value stored in a is 2 * 4.2 = 8.4 but it's not float so it ignores the .4 and it stores just 8
	cout<<a;
	
	return 0;
}

