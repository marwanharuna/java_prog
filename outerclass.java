// checking of outer and inner class in java

import java.util.*;

class outerclass
{
	
	class innerclass
		{
			

			void show()
			{
				System.out.println("This is inner class!!!");
			}
		}
	void disp()
	{
		System.out.println("This is outer class!!!");
	}
}
class mymain
{
	public static void main(String [] args)
	{
		outerclass obj = new outerclass();
		obj.show();
	}
}