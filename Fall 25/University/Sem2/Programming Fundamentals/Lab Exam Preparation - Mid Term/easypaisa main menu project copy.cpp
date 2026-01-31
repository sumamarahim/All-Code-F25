#include <iostream>
using namespace std;

int main()
{
	// loops
	// for loop
	/**
	syntax 
		for (initialising; condition; increment/decrement)
		{
			body...
		}
	
	*/
	
	
	
//	// numbers from 0 to 10
//	for (int i = 0; i<=10; i++)
//	{
//		cout<<i<<" ";
//	}
	
//	
//	// numbers from 1 to 10 only odd
//	for (int i = 1; i<=10; i+2)
//	{
//		cout<<i<<" ";
//	}
//	
	
	
//	// numbers from 0 to 10 only even
//	int i = 0;
//	
//		for (i; i<=10; i = i+2)
//	{
//		cout<<i<<" ";
//	}


	/**
	to practice loops in details, problems solved from the given link below
	
	https://www.w3resource.com/c-programming-exercises/for-loop/index.php
	
	*/

//	//	1. Write a program in C to display the first 10 natural numbers.
//	for (int i = 1; i <= 10; i++)
//	{
//		cout<<i<<" ";
//	}

//	//	2. Write a C program to compute the sum of the first 10 natural numbers.
//	int sum = 0;
//	for (int i = 1; i <= 10; i++)
//	{
//		sum = sum+i;
//		/** How it is working
//			i = 1
//				sum = 0 + 1 = 1
//			i = 2
//				sum = 1 + 2 = 3
//			i = 3
//				sum = 3 + 3 = 6
//			i = 4
//				sum = 6 + 4 = 10
//			i = 5
//				sum = 10 + 5 = 15
//			i = 6
//				sum = 15 + 6 = 21
//			i = 7
//				sum = 21 + 7 = 28
//			i = 8
//				sum = 28 + 8 = 36
//			i = 9
//				sum = 38 + 9 = 45
//			i = 10
//				sum = 45 + 10 = 55
//			so sum = 55
//		*/
//	}
//	cout<<"the sum of 1 to 10 is: "<<endl<<sum;



//	//	3. Write a program in C to display n terms of natural numbers and their sum.
//	
//	int n, sum = 0;
//	cout<<"Enter n: ";
//	cin>>n;
//	
//	for (int i = 1; i <= n; i++)
//	{
//		cout<<i<<" ";
//		sum += i;
//	}
//	cout<<"\nThe sum of 1 to "<<n<<" is: "<<sum;
	
	
	
//	// 4.	Write a program in C to read 10 numbers from the keyboard and find their sum and average.
//	
//	int num;
//	float sum, avg;
//	
//	// get multiple input from the user using for loop
//	for (int i = 1; i <= 10; i++)
//	{
//		cout<<"Enter Num "<<i<<endl;
//		cin>>num;
//		sum += num;
//		avg = sum/i;
//	}
//	cout<<"Sum is: "<<sum<<endl;
//	cout<<"Average is: "<<avg;
	
	
//	//	5. Write a program in C to display the cube of the number up to an integer.
//	
//	int n;
//	
//	cout<<"Enter n: ";
//	cin>>n;
//	
//	for (int i = 1; i <= n; i++)
//	{
//		
//		cout<<"Cube of "<<i<<" is: "<<(i*i*i)<<endl;
//	}
	
	
//	//	6. Write a program in C to display the multiplication table for a given integer.
//	int table;
//	cout<<"Enter a number for table of: ";
//	cin>>table;
//	
//	for (int i = 1; i <= 10; i++)
//	{
//		cout<<table<<" x "<<i<<" = "<<table*i<<endl;
//	}

	//	7. Write a program in C to display the multiplier table vertically from 1 to n.
//	solution 1
//	int rows;
//	cout<<"Enter to print table from 1 to : ";
//	cin>>rows;
//	
//	for (int i = 1; i <= rows; i++) // Rows
//	{
//		for(int j = 1; j <= rows; j++) // Columns
//		{
//			cout<<"\t|"<<i*j<<"|";
//		}
//		cout<<endl;
//	}

	
	
//	// the right solution
//	int rows;
//	cout<<"Enter to print table from 1 to : ";
//	cin>>rows;
//	
//	for (int i = 1; i <= 10; i++) // Rows
//	{
//		for(int j = 1; j <= rows; j++) // Columns
//		{
//			cout<<i<<" x "<<j<<" = "<<i*j<<"\t";
//		}
//		cout<<endl;
//	}
	
	
// 	// solution 3
//	int table, n;
//	cout<<"Enter table of: ";
//	cin>>table;
//	cout<<"\nEnter n: ";
//	cin>>n;
//	
//	for(int i = 1; i <= n; i++)
//	{
//		cout<<table<<" x "<<i<<" = "<<table*i<<endl;
//	}
	
	
	
//	//	8. Write a C program to display the n terms of odd natural numbers and their sum.
//	int n, sum = 0;
//	
//	cin>>n;
//	
//	for (int i = 1; i <= (n*2); i += 2)
//	{
//		cout<<i<<" ";
//		sum += i;
//	}
//	cout<<"\nSUM IS: "<<sum<<endl;
	
	
	// 9. Write a program in C to display a pattern like a right angle triangle using an asterisk.
	/*
	The pattern like :
	*
	**
	***
	****
	*/
	
//	for (int i = 0; i <= 5; i++)
//	{
//		for (int j = 0; j <= i; j++)
//		{
//			cout<<"*";
//		}
//		cout<<endl;
//	}

//	// self practice for understanding the phenominen
//	
//	for (int i = 1; i <= 5; i++)
//	{
////		cout<<"I";
//		for( int j = 1; j <= i; j++)
//		{
//			cout<<"J";
//			cout<<i;
//		}
//		cout<<endl;
//	}
//	



//1.  *****
//    *****
//    *****
//    *****
//    *****
	
//	for (int i = 1; i <= 5; i++)
//	{
//		for(int j = 1; j <= 5; j++)
//		{
//			cout<<"*";
//		}
//		cout<<endl;
//		
//	}
		// details
		/*
		i = 1
			j=1 , j=2, j=3, j=4, j=5
			*****
		endl
		i = 2
			j=1 , j=2, j=3, j=4, j=5
			*****
		endl
		i = 3
			j=1 , j=2, j=3, j=4, j=5
			*****
		endl
		i = 4
			j=1 , j=2, j=3, j=4, j=5
			*****
		endl
		i = 5
			j=1 , j=2, j=3, j=4, j=5
			*****
		endl
		
		output
		*****
		*****
		*****
		*****
		*****
		
		*/
		
	
//2. *
//	**
//	***
//	****
//	*****
	
	
//	for (int i = 1; i <= 5; i++)
//	{
//		for (int j = 1; j <= i; j++)
//		{
//			cout<<"*";
//		}
//		cout<<endl;
//	}
	/** 
	Explanation
	
	i = 1
		j = 1, j <= i (1)
		j <= i = 1 
		prints *
	endl
	i = 2
		j = 1, j <= i (2)
		j <= i = 2
		prints **
	endl
	i = 3
		j = 1, j <= i (3)
		j <= i = 3
		prints ***
	endl
	i = 4
		j = 1, j <= i (4)
		j <= i = 4
		prints ****
	endl
	i = 5
		j = 1, j <= i (5)
		j <= i = 5
		prints *****
	endl
	
	OUTPUT
	*
	**
	***
	****
	*****
	
	**/
		
	

//3.  *****
//    ****
//    ***
//    **
//    *
//	for (int i = 1; i <= 5; i++)
//	{
//		for( int j = 5; j >=i; j--)
//		{
//			cout<<"*";
//		}
//		cout<<endl;
//	}
	
	
	
//4.  1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5

//	for (int i = 1; i <= 5; i++){
//		for (int j = 1; j <= i; j++)
//		{
//			cout<<j<<" ";
//		}
//		cout<<endl;
//	}

	/** 
	EXPLANATION
	i = 1
		j <= i
		j = i = 1
		print j which is 1
	i = 2
		j <= i
		j = i = 1
		prints j which is 1
		j = i = 2
		prints j which 2
		so whole it is j which is 1 2
	i = 3
		j <= i
		j = i = 1
		prints j which is 1
		j = i = 2
		prints j which is 2
		j = i = 3
		prints j which is 3
		so whole it prints 1 2 3
	i = 4
		j <= i
		j = i = 1
		prints j which is 1
		j = i = 2
		prints j which is 2
		j = i = 3
		prints j which is 3
		j = i = 4
		prints j which is 4
		j = i = 5 which is false in condition
		so whole it prints 1 2 3 4
	i = 5
		j <= i
		j = i = 1
		prints j which is 1
		j = i = 2
		prints j which is 2
		j = i = 3
		prints j which is 3
		j = i = 4
		prints j which is 4
		j = i = 5
		prints j which is 5
		j = i = 6 which is false in condition
		so whole it prints 1 2 3 4 5
		
	OUTPUT
		first iteration
		1
		second iteration
		1 2
		third iteration
		1 2 3
		fourth iteration
		1 2 3 4
		fifth iteration
		1 2 3 4 5
	
		so whole
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
	
	*/
	
	
//5.  *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *

//	// solution 1
//	for (int i = 1; i <= 5; i++)
//	{
//		for (int j = 1; j <= i; j++)
//		{
//			cout<<"*";
//		}
//		cout<<endl;
//	}
//	for (int i = 1; i <= 4; i++)
//	{
//		for (int j = 4; j >= i; j--)
//		{
//			cout<<"*";
//		}
//		cout<<endl;
//	}
	
		
		
//6.       *
//        **
//       ***
//      ****
//     *****



//21.    1
//       2  3
//       4  5  6
//       7  8  9  10
//       11 12 13 14 15



//22.    1
//       0 1
//       1 0 1
//       0 1 0 1
//       1 0 1 0 1

//	for (int i = 1; i <= 5; i++)
//	{
////		cout<<" ";
//		for (int j = 1; j <= i; j++)
//		{
//			cout<<" * ";
//		}
//		cout<<endl;
//	}
//
//		
	
	/**	
	//	try to solve all these





7.   *****
      ****
       ***
        **
         *


8.      *
       ***
      *****
     *******
    *********


9.  *********
     *******
      *****
       ***
        *


10.      *
        * *
       * * *
      * * * *
     * * * * *


11.  * * * * *
      * * * *
       * * *
        * *
         *


12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


13.      *
        * *
       *   *
      *     *
     *********


14.  *********
      *     *
       *   *
        * *
         *


15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *


16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


17.      1
        212
       32123
      4321234
       32123
        212
         1


18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********


19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *


20.    ****
       *  *
       *  *
       *  *
       ****





23.        *      *
         *   *  *   *
       *      *      *

24.    *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

25.       *****
         *   *
        *   *
       *   *
      *****

26.   1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6

27.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

29.      
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

30.         1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5


31.      4 4 4 4 4 4 4  
         4 3 3 3 3 3 4   
         4 3 2 2 2 3 4   
         4 3 2 1 2 3 4   
         4 3 2 2 2 3 4   
         4 3 3 3 3 3 4   
         4 4 4 4 4 4 4   

32.    E
       D E
       C D E
       B C D E
       A B C D E

33.    a
       B c
       D e F
       g H i J
       k L m N o
     
       
35.    1      1
       12    21
       123  321
       12344321
       
       
       
       **/
       
//34.    E D C B A
//       D C B A
//       C B A
//       B A
//       A
//		
//		for (char i = '65'; i <= '71'; i++)
//		{
//			for (char j = '71'; j >= i; j--)
//			{
//				cout<<j;
//			}
//		}
//		// TAKE A SNAP OF THIS OUTPUT TO SHOW OTHER FELLOWS 
	
	
	//	Switch statements
	int a = 2;
	switch (a)
//	{
//		case (1):
//		cout<<"ONE"<<endl;
//	case (2):
//		cout<<"TWO"<<endl;
//	case (3):
//		cout<<"THREE"<<endl;
//	case (4):
//		cout<<"FOUR"<<endl;
//	
//	}

//	{
//		case (1):
//			{
//				int choice1;
//				cout<<"enter 1: ";
//				cin>>choice1;
//				if (choice1 == 1)
//				{
//					cout<<"1: One"<<endl;
//				}
//				else
//				cout<<"NOT ONE"<<endl;
//			}
//			break;
//		case (2):
//			{
//				int choice2;
//				cout<<"enter 2: ";
//				cin>>choice2;
//					if(choice2 == 2)
//					{
//						for (choice2 = 1; choice2 <= 4; choice2++)
//						cout<<"choice 2 in if and for loop"<<endl;
//					}
//					else
//					for (choice2 = 1; choice2 <= 4; choice2++)
//					{
//						cout<<"choice in else"<<endl;
//					}
//			}
//			break;
//		case (3):
//			cout<<"THREE"<<endl;
//			break;
//		default:
//			cout<<"NOT ONE, TWO or THREE"<<endl;
//	}
//	
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
	
	
//	//	selection
//	
//	//	choices
//	if (choice == 1)
//	{
//		cout<<"CHOICE ONE"<<endl;
//	}
//	
//	else if (choice == 2)
//	{
//		cout<<"CHOICE TWO"<<endl;
//	}
//	
//	else if (choice == 3)
//	{
//		cout<<"CHOICE THREE"<<endl;
//	}
//	
//	else if (choice == 4)
//	{
//		cout<<"CHOICE FOUR"<<endl;
//	}
//	
//	else
//	{
//		cout<<"WRONG INPUT"<<endl;
//	}
//	
	
	
	return 0;
}
