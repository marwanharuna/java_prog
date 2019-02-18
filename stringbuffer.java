// string buffer

import java.util.*;

class stringbuffer
{
	public static void main(String [] args)
	{
		StringBuffer s1 = new StringBuffer("hello");
		System.out.println(s1.capacity());
		s1.append("world");
		System.out.println(s1.capacity());
		s1.append("hello");
		System.out.println(s1.capacity());
		s1.append("hhelloo");
		System.out.println(s1.capacity());
		s1.append("world");
		System.out.println(s1.capacity());
		s1.append("hello");
		System.out.println(s1.capacity());
		s1.append("hhellooo");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.charAt(10));
		System.out.println(s1.reverse());
		System.out.println(s1.replace(5,10," marwan "));
		System.out.println(s1.insert(12," welcome "));
		System.out.println(s1.insert(27,'H'));
	}
}