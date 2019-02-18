//constructor with and withiout parameter

import java.util.*;

class construct
{
	
	construct()
	{
		System.out.println("from constructor");
	}
	construct(int a)
	{
		System.out.println(a);
	}
	public static void main(String [] args)
	{	
		Scanner sc = new Scanner (System.in);
		
		construct a = new construct();
		construct b = new construct(5);
	}
}