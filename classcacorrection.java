// correction of lab evaluation 2
import java.util.*;

class classcacorrection
{

	public static void main(String [] args)
	{
		int i;
		Scanner sc = new Scanner(System.in);
		String [] strname = new String[5];
		int [] empid = new int[5];
		int [] salary = new int[5];

		for(i=0;i<5;i++)
		{
			System.out.println("Enter Name of Employee" + i+1);
			strname[i] = sc.nextLine();
		}

		for(i=0;i<5;i++)
		{
			System.out.println("Enter id of employee" + i+1);
			empid[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Enter salary of employee" + i+1);
			salary[i] = sc.nextInt();
		}

		//highest salary
		int temp;
		String str = " ";
		int temp1;
		for(i=0;i<5;i++)
		{
			if(salary[0]<salary[i])
			{
				temp = salary[0];
				str = strname[0];
				temp1 = empid[0];

				salary[0] = salary[i];
				strname[0] = strname[i];
				empid[0] = empid[i];

				salary[i] = temp;
				strname[i] = str;
				empid[i]  = temp1;
			}
		}

		System.out.println("The employee with highest salary is:");
		System.out.println(strname[0] + "\t" + empid[0] + "\t" + salary[0]);
			
	}
}