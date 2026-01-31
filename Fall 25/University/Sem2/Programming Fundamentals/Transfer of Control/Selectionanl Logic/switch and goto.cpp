// Name: Sumama Rahim
// Reg# F24BSCS-039
// Dated: 11012024
//
// 
//
//	Practicing: goto (unconditional selectional logic) 


// Program start
#include <iostream>
using namespace std;

int main(){
	//	 Start of goto
	//	1
	cout<<"Line 1"<<endl;
	cout<<"Line 2"<<endl;
	cout<<"Line 3"<<endl;
	goto P;
	cout<<"Line 4"<<endl; 	//	this will be skipped
	cout<<"Line 5"<<endl;	//	this will be skipped
	P:cout<<"Line 6"<<endl;

	
	//	2
	cout<<"Line 7"<<endl;
//	goto P; this starts unstoppable loop to Line 6
	goto Q;
	cout<<"Line 8"<<endl;	//	this will be skipped
	cout<<"Line 9"<<endl;	//	this will be skipped
	cout<<"Line 10"<<endl;	//	this will be skipped
	Q:cout<<"Line 11"<<endl;
	cout<<"Line 12"<<endl;
	cout<<"Line 13"<<endl;
	cout<<"Line 14"<<endl;
	cout<<"Line 15"<<endl;
	
	
	
	return 0;	
}
