// using constructor in inheritance

import java.util.*;

class A
{
	int x;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = sc.nextInt();
	}
	void show()
	{
		System.out.println("The value entered is:" + x);
	}
	A()
	{	
		System.out.println("Constructor Activated");
	}
}

class inherit1
{
	public static void main(String [] args)
	{
		A a1 = new A();
		a1.read();
		a1.show();
	}
}