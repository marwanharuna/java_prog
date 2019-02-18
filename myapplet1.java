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