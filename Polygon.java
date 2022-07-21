import java.applet.*;
import java.awt.*;
public class Polygon extends Applet
{
 public void paint(Graphics g)
  {
	int x[]={100,200,300};
	int y[]={400,500,100};  
	  
	g.drawPolygon(x,y,3);
  } 
}
/*
<Applet code="Polygon" width="900" height="900">
</Applet>
*/