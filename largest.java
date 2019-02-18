// largest among 3 nos.

import java.util.*;

public class largest
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c;		
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("\nEnter the second number:");
		b=sc.nextInt();
		System.out.println("\nEnter the third number:");
		c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println("\n The greatest is:" + a);
		}
		else
		if(b>a && b>c)
		{
			System.out.println("\n The greatest is:" + b);
		}
		else
		if(c>a && c>b)
		{
			System.out.println("\n The greatest is:" + c);
		}
		else
		{
			System.out.println("\n They are all the same!!!");
		}
	}
}