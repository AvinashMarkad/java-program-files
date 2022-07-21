import java.awt.*;
import java.applet.Applet;
public class AppletFirst extends Applet
{
 public void paint(Graphics g)
   {
	/*for(int i=0;i<=4;i++)
	{		
     if(i%2==0)
      g.drawOval(150,i*95,80,80);
     else
	 // g.drawOval(150,i*95,80,50);
      g.fillOval(150,i*95,80,80);*/
     
     g.drawString("AVI",350,350);
    
    /*g.drawLine(155,155,10,200);
    g.drawRect(88,88,88,99);
    g.drawOval(111,111,100,100);
    g.drawOval(144,144,100,150);	
	g.drawArc(177,177,100,100,120,80);
	
	 int a1[]={20, 120, 220, 20};
     int b1[]={20, 120, 20, 20};
     int n1=4;
     int a2[]= {120, 220, 220, 120};
     int b2[]= {120, 20, 220, 120};
     int n2=4;
	  g.drawPolygon(a1,b1,n1);
      g.fillPolygon(a2,b2,n2);*/
 }
}
/*
<applet code="AppletFirst" width=800 height=810>
</applet>
*/