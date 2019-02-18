// wap to print first character from each word in a sentence

import java.util.*;

class firstwordinsentence
{
	public static void main(String [] args)
	{
	
		String input = " ";
		int i,n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		input = sc.nextLine();

		n=input.length();
		System.out.println(input.charAt(0));
		for(i=0;i<n;i++)
		{
			if(input.charAt(i) == ' ')
			{
			System.out.println(input.charAt(i+1));
			}
		}
	}
}

		