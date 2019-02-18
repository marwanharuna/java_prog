// starting of string

import java.util.*;

class stringintro
{
	public static void main(String [] args)
	{
		String s1 = " sachin ";
		String s2 = " tendulkar ";
		String s3 = new String (" sachin ");

		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.charAt(3));
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.replace('a','e'));
	}
	
}