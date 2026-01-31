#include <iostream>
using namespace std;

int main()
{
	//	make a menu for a easypaisa like *786# functions and process should be same
	// 1. USE SWITCH STATEMENT
	// 2. USE IF ELSE IF 
	
//	int choice, acc_details, send_amount;
	
	//	Main Menu
	cout<<"\t*** Main Menu ***\n"<<endl;
	cout<<"1. Account details"<<endl;
	cout<<"2. Send money"<<endl;
	cout<<"3. Pay bills"<<endl;
	cout<<"4. Bundles and Offers"<<endl;
	cout<<"5. Mobile load"<<endl;
	cout<<"6. Internet/Online payments"<<endl;

	int choice;	
	cin>>choice;
	
	
	if (choice == 1)
	{
		
		//	Account details
		cout<<system("CLS")<<endl;
		cout<<"\t*** Account Details ***"<<endl;
		cout<<"1. Account Number"<<endl;
		cout<<"2. Account Title"<<endl;
		cout<<"3. Change PIN"<<endl;
		cout<<"4. Update CNIC Expiry"<<endl;
		
	}
	
	else
	if(choice == 2)
	{
	
		//	Send money
		cout<<system("CLS")<<endl;
		cout<<"\t*** Send Money ***"<<endl;
		cout<<"1. To wallet"<<endl;
		cout<<"2. To bank"<<endl;
		cout<<"3. To international"<<endl;
		cout<<"4. To Raast"<<endl;
	}
	
	else 
	if(choice == 3)
	{
		//	Pay bills
		cout<<system("CLS")<<endl;
		cout<<"\t*** Pay Bills ***"<<endl;
		cout<<"1. Water"<<endl;
		cout<<"2. Internet"<<endl;
		cout<<"3. Gas"<<endl;
		cout<<"4. Telephone"<<endl;
		cout<<"5. Eletricity"<<endl;
		cout<<"6. Other government"<<endl;
	}
	
	
	
	return 0;
}
