import java.awt.*;
import java.applet.*;
public class TringlePoly extends Applet
{
 public void paint(Graphics g)
  {
   int x[]={110,180,30,110};
   int y[]={30,100,100,30};
   
   g.setColor(Color.red);
   g.fillPolygon(x,y,4);
   
   g.drawString("Tringle",80,40);
  }
} 
/*
<Applet code="TringlePoly" width=900 height=900>
</Applet>
*/