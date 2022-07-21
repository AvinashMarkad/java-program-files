import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet
{
  public void paint(Graphics g)
  {
   g.drawString("Simple Applet",150,150);
  }
}

/*
<applet code="FirstApplet" width=500 height=500>
</applet>
*/