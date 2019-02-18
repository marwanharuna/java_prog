// calculator of months and days from a given number
import java.util.*;
class daycal
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);

		int n;
		int c;
		int t;
		int d;
		System.out.println("Enter a number:");
		n= sc.nextInt();
		c=0;
		t=1;

		while(t==1 && n>29)
		{
			n=n-30;
			c++;
		}
		if(n<30)
		{
			t=0;
			d=n;
		}
		else
		{
			t=1;
		}
		System.out.println("\n There are " + c +"months");
		System.out.println(" and " + n +"days");
	}
}