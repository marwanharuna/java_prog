

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