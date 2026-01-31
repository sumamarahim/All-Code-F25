/***

	Practicing - Control Structures with examples

***/

#include <iostream>


using namespace std;

//bool accept()
//	{
//		cout<<"Wanna proceed? (y/n): "<<endl;
//		char answer;
//		
//		cin>>answer;
//		
////		if (answer == 'y')
////		{
////			return true;
////		}
////		return false;
//		
//		switch (answer)
//		{
//			case 'y':
//				return true;
//			case 'n':
//				return false;
//			default:
//				cout<<"I'll get no for this\n";
//		}
//	}



//getch(), getche(), gets(), puts(), 



//int oddEven()
//{
//	program 3
//	int num;
//
//	cout<<"enter a number: ";
//
//	
//	cin>>num;
//
//		// 1
//	bool even, odd;
//	even = (num % 2 == 0); // returns 1 if even else odd
//	odd = (num % 2 == 1); // returns 1 if odd else even
////	cout<<even;
////	cout<<odd;
//
//	if (even == true)
//	{
//		cout<<"Even"<<endl;
//	}
//	else
//	{
//		cout<<"Odd"<<endl;
//	}
//	// OR 
//	if (even == 1)
//	{
//		cout<<"Even"<<endl;
//	}
//	else
//	{
//		cout<<"Odd"<<endl;
//	}
//	
//	// 2
//	if ((num % 2) == 0)
//	{
//		cout<<"Even number you entered"<<endl;
//	}
//	else 
//	{
//		cout<<"Odd number you entered"<<endl;
//	}
//}


int main()
	{
//		cout<<accept();

//HSSC-II Chap: 4
//program 1

//		cout<<"enter a number: ";
//		int num1, num2, sum, prod;
//		
//		cin>>num1;
//		cout<<"enter second number: ";
//		cin>>num2;
//		
//		if (num1 > 0)
//		{
//			sum = num1 + num2;
//			prod = num1 * num2;
//			
//			cout<<"\nSum: "<<sum<<endl;
//			cout<<"\nProd: "<<prod<<endl;
//			
//		}

////program 2
//	cout<<"Enter marks out of 100: ";
//	int marks;
//	
//	cin>>marks;
//	
//	if (marks >= 33)
//	{
//		cout<<"You are promoted to next level"<<endl;
//	}
	
//// program 3
//	// odd or even
//	
//		int num;
//
//	cout<<"enter a number: ";	
//	cin>>num;
//	
////	// 1
////	bool even, odd;
////	even = (num % 2 == 0); // returns 1 if even else odd
////	odd = (num % 2 == 1); // returns 1 if odd else even
//////	cout<<even;
//////	cout<<odd;
////
////	if (even == true)
////	{
////		cout<<"Even"<<endl;
////	}
////	else
////	{
////		cout<<"Odd"<<endl;
////	}
////	// OR 
////	if (even == 1)
////	{
////		cout<<"Even"<<endl;
////	}
////	else
////	{
////		cout<<"Odd"<<endl;
////	}
////	
////	// 2
////	if ((num % 2) == 0)
////	{
////		cout<<"Even number you entered"<<endl;
////	}
////	else 
////	{
////		cout<<"Odd number you entered"<<endl;
////	}
//
//	// 3 using function
//	cout<<oddEven();


//	// program 4: +, -, or zero
//	int n1;
//	
//	cout<<"enter a number: ";
//	cin>>n1;
//	
//	if (n1 < 0)
//	{
//		cout<<"Negative number"<<endl;
//	}
//	
//	else
//	if(n1 > 0)
//	{
//		cout<<"Positive number"<<endl;
//	}
//	
//	else
//	{
//		cout<<"ZERO"<<endl;
//	}
	
	
	
////	// program 5: grades as per marks
////	
//
//	cout<<"Enter your obtained marks out of 100: ";
//	int marks;
//	char grade;
//	cin>>marks;
//	
//	 // 1
//	if (marks >= 80 && marks <= 100)
//	{
//		cout<<"A"<<endl;
//	}
//	else if (marks >= 70 && marks < 80)
//	{
//		cout<<"B"<<endl;
//	}
//	else if (marks >= 60 && marks < 70)
//	{
//		cout<<"C"<<endl;
//	}
//	else if (marks >= 50 && marks < 60)
//	{
//		cout<<"D"<<endl;
//	}
//	else if (marks < 50 && marks >= 0)
//	{
//		cout<<"F"<<endl;
//	}
//	else
//	{
//		cout<<"You entered wrong marks"<<endl;
//	}
//	
//	
//	// method 2
//	if (marks >= 80)
//	grade = 'A';
//	else if (marks >= 70)
//	grade = 'B';
//	else if (marks >= 60)
//	grade = 'C';
//	else if (marks >= 50)
//	grade = 'D';
//	else if (marks < 50)
//	grade = 'F';
//	
//	else
//	{
//		cout<<"Entered wrong marks"<<endl;
//	}
//	
//	cout<<grade<<endl;

// // Program 6: print name of the day, rep by 1 to 7 using switch statement
//
//	int day;
//	cout<<"Enter 1 to 7 for days: ";
//	cin>>day;
//	
//	switch (day)
//	{
//		case 1:
//			cout<<"Monday"<<endl;
//			break;
//		case 2:
//			cout<<"Tuesday"<<endl;
//			break;
//		case 3:
//			cout<<"Wednesday"<<endl;
//			break;
//		case 4:
//			cout<<"Thursday"<<endl;
//			break;
//		case 5:
//			cout<<"Friday"<<endl;
//			break;
//		case 6:
//			cout<<"Satureday"<<endl;
//			break;
//		case 7:
//			cout<<"Sunday"<<endl;
//			break;
//		default:
//			cout<<"Not a day"<<endl;
//			break;
//	}
//	// without break statement it does print all after the met case
//	cout<<"after switch statement"<<endl;

//	// program 7: check vowel or consonant character (switch will be suitable in this case)
//	
//	char vowel;
//	cout<<"Enter a character to check for vowel or consonant"<<endl;
//	
//	cin>>vowel;
	
//	// method 1
//	switch (vowel)
//	{
//		case 'a':
//			cout<<"It's a VOWEL"<<endl;
//			break;
//		case 'e':
//			cout<<"It's a VOWEL"<<endl;
//			break;
//		case 'i':
//			cout<<"It's a VOWEL"<<endl;
//			break;
//		case 'o':
//			cout<<"It's a VOWEL"<<endl;
//			break;
//		case 'u':
//			cout<<"It's a VOWEL"<<endl;
//			break;
//		
//		default:
//			cout<<"It's a CONSONANT"<<endl;
//			break;
//	}
//	
	
//	// method 2
//	switch (vowel)
//	{
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			cout<<"It's a VOWEL"<<endl;
//			break;
//		
//		default:
//			cout<<"It's a CONSONANT"<<endl;
//			break;
//	}

//	// program 8: use of nested else if
//	int marks;
//	
//	cout<<"Enter marks between 0 and 100: ";
//	cin>>marks;
//	
//	if (marks >= 0 && marks <= 100)
//	{
//		if (marks >= 33)
//		{
//			cout<<"You are passed";
//		}
//		else
//		{
//			cout<<"You are not able to achieve your next level";
//		}
//	}
//	else
//	{
//		cout<<"Invalid marks"<<endl;
//	}


//	// program 9: prints four times a statement in loop
//	
//	for (int i = 1; i <= 4; i++)
//	{
//		cout<<"This is a statement in loop"<<endl;
//	}
	

//	// program 10: use loop to print all positve odd number b/w 0 and 20
//	
//	// method 1
//	for (int i = 1; i <= 20; i += 2)
//	{
//		cout<<i<<" ";
//	}
//	cout<<endl;
//	
//	// method 2
//	for (int i = 0; i <= 20; i += 2)
//	{
//		if (i > 19)
//		break; // without break it will print 21 as well but we have check to print less than 20
//		cout<<i+1<<" ";
//	
//	}
//	cout<<endl;


//	// the above with while loop

//	int i = 0;
//	while (i <= 20)
//	{
//		if (i < 20)
//		break;
//		cout<<i<<" ";
//		i += 2;
//	}
//	
//	while (i <= 20)
//	{
//		cout<<i<<" ";
//		i++;
//	}
	
//	int j = 1;
//	while (j <= 20)
//	{
//		cout<<j<<" ";
//		j += 2;
//	}


//	// program 11: prints sum of all numbers from 0 to 15 using while loop
//	
//	int i = 0;
//	int sum = 0;
//	
//	while (i <= 15)
//	{
//		sum = sum + i;
//		i++;
//	}
//	cout<<"the sum of all numbers from 0 to 15 is: "<<sum;


	// program 12: print square of a number until user prints 0 and print good bye at end, use while loop

//	simple output

//	enter a number: 7
//	returns 49
//	enter a number: 5
//	returns 25
//	enter a number: 0
//	Good Bye!
//	
	// method 1
//	int i = 0;
//	while ( i >= 0)
//	{
//		cout<<"enter a number (0 to terminate): ";
//		cin>>i;
//		
//		if (i == 0)
//		{
//			cout<<"Good Bye!";
//			return 0;
//		}
//		else
//		{
//			cout<<"Square is: "<<i*i<<endl;
//		}
//		
//		i++;
//	}
	
	// use for loop for the above program
	
//	for (int i = 0; i >= 0; i++)
//	{
//		cout<<"Enter a number (0 to terminate): ";
//		cin>>i;
//		
//		if ( i == 0 )
//		{
//			cout<<"Good Bye!";
//			break;
//		}
//		else
//		{
//			cout<<"The square is: "<<i*i<<endl;
//		}
//	}
	
//	// above program using do-while loop
//	
//	int i = 0;
//	
//	do
//	{
//		cout<<"Enter a number (0 to terminate): ";
//		cin>>i;
//		
//		if (i == 0)
//		{
//			cout<<"Good Bye!";
//			break;
//		}
//		else
//		{
//			cout<<"The square is: "<<i*i<<endl;
//		}
//		i++;
//	}
//	while(i >= 0);

	// method 2
	
//	 int num;
//	 cout<<"Enter a number (0 to terminate): ";
//	 cin>>num;
//	 
//	 while (num != 0)
//	 {
//	 	cout<<num*num<<endl;
//	 	cout<<"Enter a number (0 to terminate): ";
//	 	cin>>num;
//	 }
//		cout<<"Good Bye!"<<endl;
	 	
	 	
	 	// program 13: enter 2 numbers to print product, show that and ask for y to continue and n for ending
	 	// use all loops
	 	
	 	// using for loop
	 	
//	 	for(int i = 0; i >= 0; i++)
//	 	{
//	 		int a, b;
//	 		cout<<"Enter 2 numbers for product"<<endl;
//	 		cin>>a>>b;
//	 		cout<<"Product is: "<<a*b<<endl;
//	 		cout<<"Y to continue or N to exit: ";
//	 		char ch;
//	 		cin>>ch;
//	 		if (ch == 'y')
//	 		{
////	 			cout<<"Enter 2 numbers fro product: ";
////	 			cin>>a>>b;
////	 			cout<<a*b<<" is ";
//				return true;
//			}
//			else if (ch == 'n')
//			{
//				cout<<"Good Bye!"<<endl;
//				return 0;
//				//break;
//			}
//			else
//			{
//				cout<<"Try N or Y"<<endl;
//			}
//		}
		
		
		
//		// using while loop
//	 	int i = 0;
//	 	while(i >= 0)
//	 	{
//	 		int a, b;
//	 		cout<<"Enter 2 numbers for product"<<endl;
//	 		cin>>a>>b;
//	 		cout<<"Product is: "<<a*b<<endl;
//	 		cout<<"Y to continue or N to exit: ";
//	 		char ch;
//	 		cin>>ch;
//	 		if (ch == 'y' || ch == 'Y')
//	 		{
//				i++;
//			}
//			else if (ch == 'n' || ch == 'N')
//			{
//				cout<<"Good Bye!"<<endl;
////				return 0;
//				break;
//			}
//			else
//			{
//				cout<<"Try N or Y"<<endl;
//			}
//		}
	
	
//	// using do-while loop
//	
//	int i = 0;
//	do 
//	{
//		cout<<"Enter 2 numbers for product: "<<endl;
//		int a, b;
//		cin>>a>>b;
//		cout<<"Product is: "<<a*b<<endl;
//		cout<<"Do you wanna continue? (Y or N)"<<endl;
//		char ch;
//		cin>>ch;
//		
//		switch (ch)
//		{
//			case 'y':
//				i++;
//				break;
//			case 'n':
//				cout<<"Good Bye!"<<endl;
//				return 0;
//				break;
//			default:
//				cout<<"Try N or Y"<<endl;
//		}
//	}
//	while (i >= 0);

		// method 2 
		
		int a, b, prod;
		char ch;
		
		do
		{
			cout<<"Enter 2 numbers"<<endl;
			cin>>a>>b;
			cout<<a*b<<endl;
			cout<<"Wanna continue? (Y or N):";
			cin>>ch;
//			ch;
		}
		while (ch != 'n');

}



