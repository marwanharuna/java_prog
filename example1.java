import java.util.*;

class bank
{
	public double amount;
	public double balamount;
	public double withdraw;
	
	public void deposit()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		amount=sc.nextDouble();
	}

	public void withdraw()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter amount to withdraw:");
		withdraw=sc.nextDouble();
		balamount= amount-withdraw;
		if(balamount<2000)
		{
			balamount=amount+withdraw;
			System.out.println("\n INSUFFIENT BALANCE!!!!");
		}
		else
		{
			
			System.out.println("\n WAIT FOR YOUR CASH!!!");
			amount=amount - withdraw;
		}
	}

	public void checkbal()
	{
		System.out.println("\n Balance is:" + amount);
	}

}

class example1
{
	public static void main(String [] args)
	{
		bank b= new bank();
		b.deposit();
		b.withdraw();
		b.checkbal();
	}
}
		