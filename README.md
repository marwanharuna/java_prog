# java_prog
// implementing abstract class

import java.util.*;

abstract class myabstract
{
	abstract void disp();
	void show()
	{
		System.out.println("I am in abstract class but I am not abstract method");
	}
}

class mysubclass extends myabstract
{
	void disp()
	{
		System.out.println("I am in subclass");
	}
}

class abstract
{
	public static void main(String [] args)
	{
		mysubclass obj = new subclass();

		obj.disp();
		obj.show();
	}
}
