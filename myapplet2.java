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