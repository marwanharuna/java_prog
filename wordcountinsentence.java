// wap to count no of words in a sentence

import java.util.*;

class wordcountinsentence
{
	public static void main(String [] args)
	{
		String input = " ";

		int i,n,c=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		input= sc.nextLine();

		n= input.length();

		for(i=0;i<n;i++)
		{
			if(input.charAt(i) == ' ')
			{
				c++;
			}
		}
		c=c+1;
		System.out.println("There are " + c + " words in the sentence");
	}
}