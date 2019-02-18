// implementing abstract class

import java.util.*;

abstract class myyabstract
{
	abstract void disp();
	void show()
	{
		System.out.println("I am in abstract class but I am not abstract method");
	}
}

class mysubclass extends myyabstract
{
	void disp()
	{
		System.out.println("I am in subclass");
	}
}

class myabstract
{
	public static void main(String [] args)
	{
		mysubclass obj = new mysubclass();

		obj.disp();
		obj.show();
	}
}