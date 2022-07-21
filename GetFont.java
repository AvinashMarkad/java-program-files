import java.awt.*;
import java.applet.*;
public class SetFont extends Applet
{
   public void paint(Graphics g)
    { 
	 Font font=new Font("Arial",Font.ITALIC,20);
	 g.setFont(font);
	 g.drawString("Avinash",100,210);
  }
}
/*
<Applet code="GetFont" width="900" height="900">
</Applet>
*/

