import java.applet.*;
import java.awt.*;
public class RecangleRed extends Applet
{
 public void paint(Graphics g)
  {
   g.setColor(Color.red);
   g.fillRect(100,110,100,110);
   
   g.setColor(Color.blue);
   g.drawString("Hello third year student",100,100);
  }
}
/*
<Applet code="RecangleRed" width=900 height=900>
</Applet>
*/