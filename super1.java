// using the super keyword in inheritance

import java.util.*;

class A
{
	int num1;
	int num2;
	int result;
	A()
	{
		num1 = 10;
		num2 = 20;
	}

	void add()
	{
		result = num1+num2;
		System.out.println(result);
	}
}

class B extends A
{
	int num3;
	int res;
	B()
	{
		super();
		num3 = 30;
	}
	void addition()
	{
		res = num1+num2+num3;
		System.out.println(res);
	}
}

class super1
{
	public static void main(String [] args)
	{
		B b = new B();
		b.add();
		b.addition();
	}
}