//factorial of a given no.
import java.util.*;

public class factorial
{
	public static void main(String [] args)
	{
		int a,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Enter the number:");
		a=sc.nextInt();

		if(a==0 || a==1)
		{
			System.out.println("\n 1");
		}
		else
		{
			for(i=a;i>0;i--)
			{
				System.out.println(" "+ i);
			}
		}
	}
}