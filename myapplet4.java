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