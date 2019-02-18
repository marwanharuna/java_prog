// arrays of objects

import java.util.*;

class arrayofobj
{
	String strname;
	int empid;
	int salary;

	Scanner sc = new Scanner(System.in.out);
	
	public void getData()
	{
		System.out.println("Enter Employee details:");

		strname = sc.nextLine();
		empid = sc.nextInt();
		salary = sc.nextInt();
	}
	
	public void setdata()
	{
		System.out.println(strname + "\t" + empid + "\t" salary);
	}
}

class mymainclass
{
	

	public void main(String [] args)
	{
		int i;
		arrayofobj [] emp = new arrayofobj[5];
		
		for(i=0;i<5;i++)
		{
			emp[i] = new arrayofobj();
		}

		for(i=0;i<5;i++)
		{
			int temp,temp1;
			String str = " ";

		if(emp[0].salary < emp[i].salary)
		{
			temp = emp[0].salary;
			temp1 = emp[0].empid;
			str = emp[0].strname;

			emp[0].salary = emp[i].salary;
			emp[0].empid = emp[i].empid;
			emp[0].strname = emp[i].strname;
		
			emp[i].salary = temp;
			emp[i].empid = temp1;
			emp[i].strname = str;
		}
		}

		System.out.println("The Highest salary is:");
		System.out.println(emp[0].strname + "\t" + emp[0].empid + "\t" + emp[0].salary);
	}
}