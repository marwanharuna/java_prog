// WAP to create astring calculator where you have to implement all string buffer class methods

import java.util.*;

class evaluation3
{
	public static void main(String [] args)
	{
	
int y = 1;

	while(y == 1)
	{
		StringBuffer input = new StringBuffer("Hello lab evaluation");
	int n,s,e,o;
	
	String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("********************STRINBUFFER CALCULATOR*****************");
	System.out.println("1. Length");
	System.out.println("2. Capacity");
	System.out.println("3. charAT");
	System.out.println("4. Insert string");
	System.out.println("5. Insert char");
	System.out.println("6. Append");
	System.out.println("7. Reverse");
	System.out.println("8. Replace");
	System.out.println("Enter option:");
	o = sc.nextInt();
	if(o == 1)
	{
	System.out.println("The length of string is:" + input.length());
	}
	else
	if(o == 2)
	{
	System.out.println("The capacity of string is:" + input.capacity());
	}
	else
	if(o == 3)
	{
	System.out.println("The character at position 2 of string is:" + input.charAt(2));
	}
	else
	if(o == 4)
	{
	System.out.println("Enter the string to insert:");
	str = sc.next();
	System.out.println("Enter the position to insert:");
	n = sc.nextInt();
	System.out.println("The new String added is:" + input.insert(n,str));
	}
	else
	if( o== 5)
	{
	System.out.println("Enter the position to insert:");
	n = sc.nextInt();
	System.out.println("The new char added is:" + input.insert(n,'h'));
	}
	else
	if(o == 6)
	{
	System.out.println("Enter the String to add:");
	str = sc.next();
	System.out.println("The value appended is:" + input.append(str));
	}
	else
	if(o == 7)
	{
	System.out.println("The string reversed:" + input.reverse());
	}
	else
	if(o == 8)
	{
	System.out.println("Enter the String to add:");
	str = sc.next();
	System.out.println("Enter the position to start:");
	s = sc.nextInt();
	System.out.println("Enter the position to end:");
	e = sc.nextInt();
	System.out.println("The new String replaces is:" + input.replace(s,e,str));
	}
	else
	{
		System.out.println(" Wrong option!!!");
	}
	System.out.println("Do you wish to continue 1/0:");
	y = sc.nextInt();
	}

   }
}