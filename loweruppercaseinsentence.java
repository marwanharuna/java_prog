// wap to count no of lowercase and uppercase in a sentence.

import java.util.*;

class loweruppercaseinsentence
{
	public static void main(String [] args)
	{
		String input = " ";
		char cmp = ' ';
		
		int i,n,upper=0,lower=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		input= sc.nextLine();
	
		n=input.length();

		for(i=0;i<n;i++)
		{
			cmp = input.charAt(i);
			String str=String.parseString(cmp);
			if(cmp == str.toUpperCase())
			{
				upper++;
			}
			else
			if(cmp == str.toLowerCase())
			{
				lower++;
			}
			else
			{
				break;
			}
		}

		System.out.println("The amount of upper case is:"+ upper);
		System.out.println("The amount of lower case is:"+ lower);
	}
}