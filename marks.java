// calculate students marks and show grade
import java.util.*;

class marks
{
	public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			int mark;
			student a = new student();
			System.out.println("Enter your marks:");
			mark = sc.nextInt();
			a.check(mark);
		}
}