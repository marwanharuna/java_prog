// using interface

import java.util.*;

interface A
{
	void disp1();
	/* default */static void disp2()
	{
		System.out.println("Hello disp2");
	}
}

class B implements A
{
	public void disp1()
	{
		System.out.println("Hello disp1");
	}
}

class myinterface
{
	public static void main(String [] args)
	{
		B b= new B();
		b.disp1();
		A.disp2();
	}
}