# java_prog
// implementing abstract class

import java.util.*;

abstract class myabstract
{
	abstract void disp();
	void show()
	{
		System.out.println("I am in abstract class but I am not abstract method");
	}
}

class mysubclass extends myabstract
{
	void disp()
	{
		System.out.println("I am in subclass");
	}
}

class abstract
{
	public static void main(String [] args)
	{
		mysubclass obj = new subclass();

		obj.disp();
		obj.show();
	}
}

// addition of two numbers

import java.util.*;

public class addition
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the first number:");
		a=sc.nextInt();

		System.out.println("\nEnter the second number:");
		b=sc.nextInt();
		c= a+b;
		System.out.println("\nThe sum is:" + c);
	}
}

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

// hierachial inheritance

import java.util.*;

class Bank
{
	double rate()
	{
		return 0.0;
	}
}
class SBI extends Bank
{
	double rate()
	{
		return 8.34;
	}
}

class Axis extends Bank
{
	double rate()
	{
		return 7.34;
	}
}

class ICICI extends Bank
{
	double rate()
	{
		return 9.34;
	}
}

class bankinheritance
{
	public static void main(String [] args)
	{
		SBI s = new SBI();
		Axis a= new Axis();
		ICICI c = new ICICI();

		System.out.println(s.rate());
		System.out.println(a.rate());
		System.out.println(c.rate());
	}
}

// calculator with the help of switchcase

import java.util.*;

class calculator
{
	public static void main(String [] args)
	{
		
		int x;
		int a,b,c;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		ch ='y';
	while(ch == 'y')
	{
		
		System.out.println("\n ************************CALCULATOR*********************");
		System.out.println("\n1.ADDITION \n2.SUBTRACTION \n3.DIVISION \n4.MULTIPLICATION \n5.MODULUS");
		System.out.println("\n Select which operation to perform:");
		x=sc.nextInt();
		
		switch(x)
		{
	
			case 1: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a+b;
				System.out.println("\n The sum is:" + c);
				break;

			case 2: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a-b;
				System.out.println("\n The remainder is:" + c);
				break;

			case 3: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a/b;
				System.out.println("\n The div is:" + c);
				break;

			case 4: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a*b;
				System.out.println("\n The product is:" + c);
				break;

			case 5: System.out.println("\n Enter the first number:");
				a= sc.nextInt();
				System.out.println("\n Enter the second number:");
				b= sc.nextInt();
				c=a%b;
				System.out.println("\n The mod is:" + c);
				break;
			default:System.out.println("\n Invalid choice!!!");
				break;
		}
	System.out.println("\n Do you wish to perform another operation:");
	ch = sc.next().charAt(0);
	}
	}
}

	
	// write a program which take string from user and count no of vowels, consonants, digits and spaces

import java.util.*;

class checking
{
	public static void main(String [] args)
	{
		String input = " ";

		int vowel=0,con=0,num=0,space=0,i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		input = sc.nextLine();
		
		n = input.length();
		for(i=0; i<n;i++)
		{

			if(input.charAt(i) == 'a'|| input.charAt(i) =='e'|| input.charAt(i) =='i'|| input.charAt(i) =='o'|| input.charAt(i) =='u')
			{
				vowel++;
			}
			else
			if( input.charAt(i) =='b'|| input.charAt(i) =='c'|| input.charAt(i) =='d'|| input.charAt(i) =='f'|| input.charAt(i) =='g'|| input.charAt(i) =='h'|| input.charAt(i) =='j'|| input.charAt(i) =='k'|| input.charAt(i) =='l'|| input.charAt(i) =='m'|| input.charAt(i) =='n'|| input.charAt(i) =='p'|| input.charAt(i) =='q'|| input.charAt(i) =='r'|| input.charAt(i) =='s'|| input.charAt(i) =='t'|| input.charAt(i) =='v'|| input.charAt(i) =='w'|| input.charAt(i) =='x'|| input.charAt(i) =='y'|| input.charAt(i) =='z')
			{
				con++;
			}

			else
			if(input.charAt(i) == 0|| input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) =='3'|| input.charAt(i) =='4'|| input.charAt(i) =='5'|| input.charAt(i) =='6'|| input.charAt(i) =='7'|| input.charAt(i) =='8'|| input.charAt(i) =='9')
			{
				num++;
			}
			else
			if(input.charAt(i) == ' ')
			{
				space++;
			}
			else
			{
					break;
			}
		}

	System.out.println("The Vowels are:" + vowel);
	System.out.println("The Consonants are:" + con);
	System.out.println("The Numbers are:" + num);
	System.out.println("The Spaces are:" + space);
	}
}


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

//constructor with and withiout parameter

import java.util.*;

class construct
{
	
	construct()
	{
		System.out.println("from constructor");
	}
	construct(int a)
	{
		System.out.println(a);
	}
	public static void main(String [] args)
	{	
		Scanner sc = new Scanner (System.in);
		
		construct a = new construct();
		construct b = new construct(5);
	}
}

// check static variable

import java.util.*;

class counter
{
	static int count=0;
	
	counter()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String [] args)
	{
	counter c1 = new counter();
	counter c2 = new counter();
	counter c3 = new counter();
	}
}

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
			
			
// WAP to create astring calculator where you have to implement all string buffer class methods

import java.util.*;

class evaluation3
{
	public static void main(String [] args)
	{
	
int y = 1;

	while(y == 1)
	{
		StringBuffer input = new StringBuffer("Hello lab evaluation");
	int n,s,e,o;
	
	String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("********************STRINBUFFER CALCULATOR*****************");
	System.out.println("1. Length");
	System.out.println("2. Capacity");
	System.out.println("3. charAT");
	System.out.println("4. Insert string");
	System.out.println("5. Insert char");
	System.out.println("6. Append");
	System.out.println("7. Reverse");
	System.out.println("8. Replace");
	System.out.println("Enter option:");
	o = sc.nextInt();
	if(o == 1)
	{
	System.out.println("The length of string is:" + input.length());
	}
	else
	if(o == 2)
	{
	System.out.println("The capacity of string is:" + input.capacity());
	}
	else
	if(o == 3)
	{
	System.out.println("The character at position 2 of string is:" + input.charAt(2));
	}
	else
	if(o == 4)
	{
	System.out.println("Enter the string to insert:");
	str = sc.next();
	System.out.println("Enter the position to insert:");
	n = sc.nextInt();
	System.out.println("The new String added is:" + input.insert(n,str));
	}
	else
	if( o== 5)
	{
	System.out.println("Enter the position to insert:");
	n = sc.nextInt();
	System.out.println("The new char added is:" + input.insert(n,'h'));
	}
	else
	if(o == 6)
	{
	System.out.println("Enter the String to add:");
	str = sc.next();
	System.out.println("The value appended is:" + input.append(str));
	}
	else
	if(o == 7)
	{
	System.out.println("The string reversed:" + input.reverse());
	}
	else
	if(o == 8)
	{
	System.out.println("Enter the String to add:");
	str = sc.next();
	System.out.println("Enter the position to start:");
	s = sc.nextInt();
	System.out.println("Enter the position to end:");
	e = sc.nextInt();
	System.out.println("The new String replaces is:" + input.replace(s,e,str));
	}
	else
	{
		System.out.println(" Wrong option!!!");
	}
	System.out.println("Do you wish to continue 1/0:");
	y = sc.nextInt();
	}

   }
}

//wap which calculate volume of a box from take length from base class and apply super key

import java.util.*;

class A
{
	int a,n;
	Scanner sc = new Scanner(System.in);
	void cal()
	{
		System.out.println("Enter the length of cube:");
		a = sc.nextInt();
		n = a*a*a;
	}
}
class B extends A
{

	void print()
	{
		cal();
		System.out.println("The volume of cube is:" + super.n);
	}
}

class evaluation4
{
	public static void main(String [] args)
	{
		B b = new B();

		b.print();
	}
}

// write a program to implement any 10 string methods

import java.util.*;

class examination
{
	public static void main(String [] args)
	{
		String s1 = "Hello world";
		String s2 = " world";

		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.trim());
	}
}

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

// wap to print first character from each word in a sentence

import java.util.*;

class firstwordinsentence
{
	public static void main(String [] args)
	{
	
		String input = " ";
		int i,n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		input = sc.nextLine();

		n=input.length();
		System.out.println(input.charAt(0));
		for(i=0;i<n;i++)
		{
			if(input.charAt(i) == ' ')
			{
			System.out.println(input.charAt(i+1));
			}
		}
	}
}


// inheritance in java

import java.util.*;

class A
{
	void disp()
	{
		System.out.println("i am in A");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("i am in B");
	}
}

class inherit
{
	public static void main(String [] args)
	{
		B b1 = new B();
		b1.disp();
		b1.show();
	}
}

// using constructor in inheritance

import java.util.*;

class A
{
	int x;
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = sc.nextInt();
	}
	void show()
	{
		System.out.println("The value entered is:" + x);
	}
	A()
	{	
		System.out.println("Constructor Activated");
	}
}

class inherit1
{
	public static void main(String [] args)
	{
		A a1 = new A();
		a1.read();
		a1.show();
	}
}

// making of inner class

import java.util.*;

class innerclass
{
	

	class inside
	{
		public void show()
		{
			System.out.println("From the inside class!!!");
		}
	}

	public static void main(String [] args)
	{

		System.out.println("From main!!!");
		innerclass obj = new innerclass();
		obj.obj1.show();

	}

	inside obj1 = new inside();
	
}

// largest among 3 nos.

import java.util.*;

public class largest
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c;		
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("\nEnter the second number:");
		b=sc.nextInt();
		System.out.println("\nEnter the third number:");
		c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println("\n The greatest is:" + a);
		}
		else
		if(b>a && b>c)
		{
			System.out.println("\n The greatest is:" + b);
		}
		else
		if(c>a && c>b)
		{
			System.out.println("\n The greatest is:" + c);
		}
		else
		{
			System.out.println("\n They are all the same!!!");
		}
	}
}

// wap to count no of lowercase and uppercase in a sentence.

import java.util.*;

class loweruppercaseinsentence
{
	public static void main(String [] args)
	{
		String input = " ";
		char cmp = ' ';
		
		int i,n,upper=0,lower=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		input= sc.nextLine();
	
		n=input.length();

		for(i=0;i<n;i++)
		{
			cmp = input.charAt(i);
			String str=String.parseString(cmp);
			if(cmp == str.toUpperCase())
			{
				upper++;
			}
			else
			if(cmp == str.toLowerCase())
			{
				lower++;
			}
			else
			{
				break;
			}
		}

		System.out.println("The amount of upper case is:"+ upper);
		System.out.println("The amount of lower case is:"+ lower);
	}
}

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


// wap to print each character occuring at index position multiple of 3

import java.util.*;

class multipleof3
{
	public static void main(String [] args)
	{
		String input = " ";
		int n,i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the word:");
		input= sc.nextLine();

		n= input.length();
	
		for(i=2;i<n;i+=3)
		{
			System.out.println(input.charAt(i));
		}
	}
}		


// implementing abstract class

import java.util.*;

abstract class myyabstract
{
	abstract void disp();
	void show()
	{
		System.out.println("I am in abstract class but I am not abstract method");
	}
}

class mysubclass extends myyabstract
{
	void disp()
	{
		System.out.println("I am in subclass");
	}
}

class myabstract
{
	public static void main(String [] args)
	{
		mysubclass obj = new mysubclass();

		obj.disp();
		obj.show();
	}
}



import java.applet.*;
import java.awt.*;

public class myapplet extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		g.drawString("Hello world",60,60);
		g.drawLine(30,20,40,20);
		g.drawRect(50,50,150,150);
		g.fillRect(270,270,300,300);
		g.setColor(Color.red);
		g.drawOval(90,90,100,100);
		g.fillOval(90,90,100,100);

		g.setColor(Color.pink);
		g.fillRect(250,20,500,250);
		g.setColor(Color.blue);
		g.fillRect(275,25,475,225);
		g.setColor(Color.yellow);
		g.fillRect(300,30,450,200);
		g.setColor(Color.green);
		g.fillRect(325,35,425,175);
	}
}

/*
<html>
<body>
<applet code="myapplet1.class" height="350" width="350"> </applet>
</body>
</html>
*/

import java.applet.*;
import java.awt.*;
public class myapplet1 extends Applet
{
	int num1 =10;
	int num2 =20;
	int res = num1+num2;

	
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);

		g.drawString("Addition of" + num1 +" and "+num2 +" is:"+ String.valueOf(res),120,120);
		g.drawString(String.valueOf(res),60,60);
	}
}

/*
<html>
<body>
<applet code="myapplet2.class" height="350" width="350"></applet>
</body>
</html>
*/

import java.applet.*;
import java.awt.*;

public class myapplet2 extends Applet
{
	Label l1,l2;
	TextField tx1,tx2;
	Button b1;
	
	public void init()
	{
	
		l1= new Label("Enter num1:");
		add(l1);
		tx1 = new TextField(10);
		add(tx1);
		l2 = new Label("Enter num2");
		add(l2);
		tx2 = new TextField(10);
		add(tx2);
		b1 = new Button("Result");
		add(b1);
	}

	public void paint(Graphics g)
	{
		String strnum1 = tx1.getText();
		String strnum2 = tx2.getText();

		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);

		int res = num1 + num2;
		g.drawString(String.valueOf(res),160,160);
	}

	public class addition extends Applet
	{
		public boolean action(Event e, Object o)
		{
			repaint();
			return true;
		}
	}
}

/*
<html>
<body>
<applet code="myapplet3.class" height="350" width="350"></applet>
</body>
</html>
*/

import java.applet.*;
import java.awt.*;

public class myapplet3 extends Applet
{
	Label l1;
	TextField tx1;
	Button b1;

	public void init()
	{
		
		l1 = new Label("Enter a number");
		add(l1);
		tx1 = new TextField(10);
		add(tx1);
	}

	public void paint(Graphics g)
	{
		String strnum1 = tx1.getText();
		int num1 = Integer.parseInt(strnum1);

		if(prime(num1))
		{
			g.drawString("prime number",1,20);
		}
		else{
			g.drawString("Not prime number",1,20);
		    }
	
	}
		public boolean prime(int n)
		{
			if(n<=1)
			{
			return false;
			}
	else{
			for(int i = 2;i<n;i++)
			{
			if(n%i==0)
			{
			return false;
			}
			else
			{
			return true;
			}
			}
		}
	return true;
		}
	public boolean action(Event e, Object o)
		{
			repaint();
			return true;
		}
	
}

import java.applet.*;
import java.awt.*;

public class myapplet4 extends Applet
{
	String s1;
	
	public void paint(Graphics g)
	{
		s1 = getParameter("abc");
		s1 = "This flower is " + s1;

		g.drawString(s1,1,20);
	}
}

// my first java prog
class myfirstJavaApp
{
	public static void main(String [] args)
	{
	System.out.println("hello kumar");
	}
}


// using interface

import java.util.*;

interface A
{
	void disp1();
	/* default */static void disp2()
	{
		System.out.println("Hello disp2");
	}
}

class B implements A
{
	public void disp1()
	{
		System.out.println("Hello disp1");
	}
}

class myinterface
{
	public static void main(String [] args)
	{
		B b= new B();
		b.disp1();
		A.disp2();
	}
}

// checking of outer and inner class in java

import java.util.*;

class outerclass
{
	
	class innerclass
		{
			

			void show()
			{
				System.out.println("This is inner class!!!");
			}
		}
	void disp()
	{
		System.out.println("This is outer class!!!");
	}
}
class mymain
{
	public static void main(String [] args)
	{
		outerclass obj = new outerclass();
		obj.show();
	}
}

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


// checking static variable 

import java.util.*;

class staticstudent
{
	int rollno;
	String name;
	static String college;

	public staticstudent()
	{
		this.rollno = rollno;
		this.name = name;
		this.college = "ABC";
	}

	public static void main(String [] args)
	{
		staticstudent s1 = new staticstudent();
		staticstudent s2 = new staticstudent();

		s1.rollno =1111;
		s1.name = "rahul";
		
		s2.rollno = 2222;
		s2.name = "mandeep";
		s2.college = "XYZ";

		System.out.println("\n Rollno:" + s1.rollno + "\n" + "Name:" + s1.name + "\ncollege:" + s1.college);
		System.out.println("\n Rollno:" + s2.rollno + "\n" + "Name:" + s2.name + "\ncollege:" + s2.college);
	}
}

// string buffer

import java.util.*;

class stringbuffer
{
	public static void main(String [] args)
	{
		StringBuffer s1 = new StringBuffer("hello");
		System.out.println(s1.capacity());
		s1.append("world");
		System.out.println(s1.capacity());
		s1.append("hello");
		System.out.println(s1.capacity());
		s1.append("hhelloo");
		System.out.println(s1.capacity());
		s1.append("world");
		System.out.println(s1.capacity());
		s1.append("hello");
		System.out.println(s1.capacity());
		s1.append("hhellooo");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.charAt(10));
		System.out.println(s1.reverse());
		System.out.println(s1.replace(5,10," marwan "));
		System.out.println(s1.insert(12," welcome "));
		System.out.println(s1.insert(27,'H'));
	}
}

// starting of string

import java.util.*;

class stringintro
{
	public static void main(String [] args)
	{
		String s1 = " sachin ";
		String s2 = " tendulkar ";
		String s3 = new String (" sachin ");

		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.charAt(3));
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.replace('a','e'));
	}
	
}

//program to swap two nos. without third variable

import java.util.*;

class swapping
{
	public int x;
	public int y;
	public void change(int x,int y)
	{
	Scanner sc= new Scanner(System.in);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("\n The value after swap is:"+ x + y);
	}
}

class swap
{
	public static void main(String [] args)
		{
			Scanner sc= new Scanner(System.in);
			swapping call= new swapping();
			int a,b;
			System.out.println("\n Enter the values of A and B to swap:");
			a=sc.nextInt();
			b=sc.nextInt();
			call.change(a,b);
		}
}

// wap to count no of words in a sentence

import java.util.*;

class wordcountinsentence
{
	public static void main(String [] args)
	{
		String input = " ";

		int i,n,c=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence:");
		input= sc.nextLine();

		n= input.length();

		for(i=0;i<n;i++)
		{
			if(input.charAt(i) == ' ')
			{
				c++;
			}
		}
		c=c+1;
		System.out.println("There are " + c + " words in the sentence");
	}
}



