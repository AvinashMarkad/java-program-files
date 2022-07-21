import java.applet.*;
import java.awt.*;
public class ThreeColor extends Applet
{
 public void paint(Graphics g)
  {
   g.setColor(Color.pink);
   g.fillOval(100,130,70,70);
   g.setColor(Color.red);
   g.fillOval(100,230,70,70);
   g.setColor(Color.black);
   g.fillOval(100,330,70,70);
  }
}
/*
<Applet code="ThreeColor" width="900" height="900">
</Applet>
*/