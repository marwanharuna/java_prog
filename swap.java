//program to swap two nos. without third variable

import java.util.*;

class swapping
{
	public int x;
	public int y;
	public void change(int x,int y)
	{
	Scanner sc= new Scanner(System.in);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("\n The value after swap is:"+ x + y);
	}
}

class swap
{
	public static void main(String [] args)
		{
			Scanner sc= new Scanner(System.in);
			swapping call= new swapping();
			int a,b;
			System.out.println("\n Enter the values of A and B to swap:");
			a=sc.nextInt();
			b=sc.nextInt();
			call.change(a,b);
		}
}