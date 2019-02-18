//wap which calculate volume of a box from take length from base class and apply super key

import java.util.*;

class A
{
	int a,n;
	Scanner sc = new Scanner(System.in);
	void cal()
	{
		System.out.println("Enter the length of cube:");
		a = sc.nextInt();
		n = a*a*a;
	}
}
class B extends A
{

	void print()
	{
		cal();
		System.out.println("The volume of cube is:" + super.n);
	}
}

class evaluation4
{
	public static void main(String [] args)
	{
		B b = new B();

		b.print();
	}
}