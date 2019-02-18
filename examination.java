// write a program to implement any 10 string methods

import java.util.*;

class examination
{
	public static void main(String [] args)
	{
		String s1 = "Hello world";
		String s2 = " world";

		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.trim());
	}
}