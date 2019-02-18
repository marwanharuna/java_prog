// wap to print each character occuring at index position multiple of 3

import java.util.*;

class multipleof3
{
	public static void main(String [] args)
	{
		String input = " ";
		int n,i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the word:");
		input= sc.nextLine();

		n= input.length();
	
		for(i=2;i<n;i+=3)
		{
			System.out.println(input.charAt(i));
		}
	}
}		