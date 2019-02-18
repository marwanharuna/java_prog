// for calculating grade and sending back to main
import java.util.*;

class student
{
	int x;
	public void check(int x)
	{
		if(x>=90)
		{
			System.out.println("Your grade is: A");
		}
		else
		if(x<90 && x>=80)
		{
			System.out.println("Your grade is: B");	
		}
		else
		if(x<80 && x>=70)
		{
			System.out.println("Your grade is: C");	
		}
		else
		if(x<70 && x>=60)
		{
			System.out.println("Your grade is: D");	
		}
		else
		if(x<60 && x>=50)
		{
			System.out.println("Your grade is: E");	
		}
		else
		if(x<50)
		{
			System.out.println("Your grade is: F");	
		}
		else
		{
			System.out.println("INVALID!!!");
		}
	}
}