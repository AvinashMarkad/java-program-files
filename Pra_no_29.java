import java.applet.*;
import java.awt.*;
public class Pra_no_29 extends Applet
{
 public void init()
  {
   setBackground(Color.yellow);
   setForeground(Color.red);
  }
 public void paint(Graphics g)
 {
	g.setColor(Color.green);
	g.drawRect(100,200,300,300);
	
	g.setColor(Color.red);
	g.fillRect(250,500,300,300);
 } 
}
/*
<Applet code="Pra_no_29" width="900" height="900">
</Applet>
*/