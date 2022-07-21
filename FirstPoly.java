import java.applet.*;
import java.awt.*;
public class FirstPoly extends Applet
{
  public void paint(Graphics g)
  {
   //setSize(200,200);  
   int x[]={50,100,100,150,150,200};
   int y[]={125,50,200,50,200,125};
   g.drawPolygon(x,y,6);
  }
}

/*
<applet code="FirstPoly" width=1920 height=1080>
</applet>
*/