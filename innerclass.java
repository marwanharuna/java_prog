// making of inner class

import java.util.*;

class innerclass
{
	

	class inside
	{
		public void show()
		{
			System.out.println("From the inside class!!!");
		}
	}

	public static void main(String [] args)
	{

		System.out.println("From main!!!");
		innerclass obj = new innerclass();
		obj.obj1.show();

	}

	inside obj1 = new inside();
	
}