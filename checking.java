// write a program which take string from user and count no of vowels, consonants, digits and spaces

import java.util.*;

class checking
{
	public static void main(String [] args)
	{
		String input = " ";

		int vowel=0,con=0,num=0,space=0,i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		input = sc.nextLine();
		
		n = input.length();
		for(i=0; i<n;i++)
		{

			if(input.charAt(i) == 'a'|| input.charAt(i) =='e'|| input.charAt(i) =='i'|| input.charAt(i) =='o'|| input.charAt(i) =='u')
			{
				vowel++;
			}
			else
			if( input.charAt(i) =='b'|| input.charAt(i) =='c'|| input.charAt(i) =='d'|| input.charAt(i) =='f'|| input.charAt(i) =='g'|| input.charAt(i) =='h'|| input.charAt(i) =='j'|| input.charAt(i) =='k'|| input.charAt(i) =='l'|| input.charAt(i) =='m'|| input.charAt(i) =='n'|| input.charAt(i) =='p'|| input.charAt(i) =='q'|| input.charAt(i) =='r'|| input.charAt(i) =='s'|| input.charAt(i) =='t'|| input.charAt(i) =='v'|| input.charAt(i) =='w'|| input.charAt(i) =='x'|| input.charAt(i) =='y'|| input.charAt(i) =='z')
			{
				con++;
			}

			else
			if(input.charAt(i) == 0|| input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) =='3'|| input.charAt(i) =='4'|| input.charAt(i) =='5'|| input.charAt(i) =='6'|| input.charAt(i) =='7'|| input.charAt(i) =='8'|| input.charAt(i) =='9')
			{
				num++;
			}
			else
			if(input.charAt(i) == ' ')
			{
				space++;
			}
			else
			{
					break;
			}
		}

	System.out.println("The Vowels are:" + vowel);
	System.out.println("The Consonants are:" + con);
	System.out.println("The Numbers are:" + num);
	System.out.println("The Spaces are:" + space);
	}
}


		