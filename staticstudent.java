// checking static variable 

import java.util.*;

class staticstudent
{
	int rollno;
	String name;
	static String college;

	public staticstudent()
	{
		this.rollno = rollno;
		this.name = name;
		this.college = "ABC";
	}

	public static void main(String [] args)
	{
		staticstudent s1 = new staticstudent();
		staticstudent s2 = new staticstudent();

		s1.rollno =1111;
		s1.name = "rahul";
		
		s2.rollno = 2222;
		s2.name = "mandeep";
		s2.college = "XYZ";

		System.out.println("\n Rollno:" + s1.rollno + "\n" + "Name:" + s1.name + "\ncollege:" + s1.college);
		System.out.println("\n Rollno:" + s2.rollno + "\n" + "Name:" + s2.name + "\ncollege:" + s2.college);
	}
}