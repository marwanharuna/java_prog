//calculate profit amount from a purchase by customer

import java.util.*;

class profit
{
	public int price;
	public double cgst;
	public double sgst;
	public double tax;
	public double net_price;
	public int real_price;
	public double profits;
	public void calculate_profit()
	{
		price = 50000;
		cgst= 0.09 * price;
		sgst= 0.09 * price;
		tax= cgst + sgst;
		net_price= price + tax;
		real_price= 45000;
		profits= price -real_price;
		System.out.println("\n price :" + price);
		System.out.println("\n price after tax :" + net_price);
		System.out.println("\n tax cgst at 9% and sgst at 9% :" + tax);
		System.out.println("\n sellers profit :" + profits);
	}


}

class product
{

	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int product_id;
		String product_name;
		double product_price;
		String choice;
		profit a = new profit();
		
		System.out.println("Enter product id:");
		product_id=sc.nextInt();
		System.out.println("\nEnter product name:");
		product_name=sc.next();


		System.out.println("\nDo you wish to purchase:y/n");
		choice=sc.next();
		if(choice=='y')
		{
			System.out.println("\n ****************PRODUCT PURCHASED*******************");
			System.out.println("\n product id :" + product_id);
			System.out.println("\n product name :" + product_name);
			a.calculate_profit();
			System.out.println("\n THANK YOU!!!!");
		}
		else
		{
			
			System.out.println("\n THANK YOU!!!!");
		}
	}
}
