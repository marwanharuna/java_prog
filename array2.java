// 2-D array

import java.util.*;

class array2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int [][] arr= new int [3][3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter element of row " + i +" and column" + j + ":");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements are:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println("\n");
			
		}
	}
}