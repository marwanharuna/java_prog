// addition of two numbers

import java.util.*;

public class addition
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first number:");
		a=sc.nextInt();

		System.out.println("\nEnter the second number:");
		b=sc.nextInt();
		c= a+b;
		System.out.println("\nThe sum is:" + c);
	}
}