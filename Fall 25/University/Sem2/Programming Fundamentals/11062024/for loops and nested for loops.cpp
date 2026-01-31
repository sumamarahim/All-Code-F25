/**
	Name: Sumama Rahim
	Reg# F24BSCS-039
	
	
	Self Practicing
		1. Loops
			i. For Loop
			ii. Nested For Loop
			iii. While Loop
			iv. Do While Loop


*/

// Program Starts here

#include <iostream>
using namespace std;

int main(){
//	// for loop
//	for (int a = 0; a < 6; a++)
//	{
//		cout<<a<<endl;
//	}
//	
//	//	nested for loop
//	for (int b = 0; b < 6; b++)
//	{
//		cout<<"b"<<b<<endl;
//	
//		for (int c = 0; c < 6; c++)
//		{
//			cout<<"c"<<c<<endl;
//		}
//	}
//	
//	
//	
//	
//
//	for (int b = 0; b <= 5; b++)
//	{
//	
//		for (int c = 0; c < 6; c++)
//		{
//			cout<<"*";
//		}
//	}
//	
//	


    int rows;

    cout << "Enter number of rows: ";
    cin >> rows;

    for(int i = 1; i <= rows; ++i) {
        for(int j = 1; j <= i; ++j) {
            cout << j << " ";
        }
//        cout << "\n";
    }


	
	
	return 0;
}
