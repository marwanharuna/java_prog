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