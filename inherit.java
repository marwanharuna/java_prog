// inheritance in java

import java.util.*;

class A
{
	void disp()
	{
		System.out.println("i am in A");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("i am in B");
	}
}

class inherit
{
	public static void main(String [] args)
	{
		B b1 = new B();
		b1.disp();
		b1.show();
	}
}