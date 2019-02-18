//1-D array
import java.util.*;

class array1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int [] arr= new int[5];
		int i,s;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Enter elements for position "+ i + ":");
			arr[i] = sc.nextInt();
		}

		System.out.println("The elements are:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter number to search:");
		s=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(s == arr[i])
			{
				System.out.println("Element found");
				break;
			}
		}
	}
}