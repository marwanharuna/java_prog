// Take the details of 5 students and calculate which student having lowest cgpa

import java.util.*;

class evaluation2
{
	public static void main(String [] args)
	{
		float [] stdcgpa;
		int [] regno;
		String [] name;
		int i,j;
		float temp=0;
		
		stdcgpa = new float[5];
		regno = new int[5];
		name = new String[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the details of five students:");
		for(i=0;i<5;i++)
		{
			System.out.println("Enter the name of " + i +"student:");
			name[i]= sc.next();
			System.out.println("Enter the Reg no of " + i +"student:");
			regno[i]= sc.nextInt();
			System.out.println("Enter the CGPA of " + i +"student:");
			stdcgpa[i]= sc.nextFloat();
		}
		
		System.out.println("The information Provided is:");
		System.out.println("NAME \t REG NO \t CGPA");

		for(i=0;i<5;i++)
		{
			System.out.println(name[i] + "\t" + regno[i] + "\t" + stdcgpa[i]);
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(stdcgpa[j]<stdcgpa[i])
				{
					temp = stdcgpa[j];
					stdcgpa[j]=stdcgpa[i];
					stdcgpa[i]=temp;
				}
			}
		}


		System.out.println("the student with lowest cgpa is:" + stdcgpa[0]);
	}
}
			