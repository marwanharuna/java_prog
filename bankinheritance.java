// hierachial inheritance

import java.util.*;

class Bank
{
	double rate()
	{
		return 0.0;
	}
}
class SBI extends Bank
{
	double rate()
	{
		return 8.34;
	}
}

class Axis extends Bank
{
	double rate()
	{
		return 7.34;
	}
}

class ICICI extends Bank
{
	double rate()
	{
		return 9.34;
	}
}

class bankinheritance
{
	public static void main(String [] args)
	{
		SBI s = new SBI();
		Axis a= new Axis();
		ICICI c = new ICICI();

		System.out.println(s.rate());
		System.out.println(a.rate());
		System.out.println(c.rate());
	}
}