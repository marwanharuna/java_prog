// calculator with the help of switchcase

import java.util.*;

class calculator
{
	public static void main(String [] args)
	{
		
		int x;
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		ch ='y';
	while(ch == 'y')
	{
		
		System.out.println("\n ************************CALCULATOR*********************");
		System.out.println("\n1.ADDITION \n2.SUBTRACTION \n3.DIVISION \n4.MULTIPLICATION \n5.MODULUS");
		System.out.println("\n Select which operation to perform:");
		x=sc.nextInt();
		
		switch(x)
		{
	
			case 1: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a+b;
				System.out.println("\n The sum is:" + c);
				break;

			case 2: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a-b;
				System.out.println("\n The remainder is:" + c);
				break;

			case 3: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a/b;
				System.out.println("\n The div is:" + c);
				break;

			case 4: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a*b;
				System.out.println("\n The product is:" + c);
				break;

			case 5: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a%b;
				System.out.println("\n The mod is:" + c);
				break;
			default:System.out.println("\n Invalid choice!!!");
				break;
		}
	System.out.println("\n Do you wish to perform another operation:");
	ch = sc.next().charAt(0);
	}
	}
}

	