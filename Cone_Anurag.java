import java.io.*;
import java.awt.*;;
import java.applet.*;

//<Applet code="Cone" WIDTH="800" HEIGHT="400"></Applet>


public class Cone_Anurag extends Applet
{
   public void paint(Graphics g)
   {
     setBackground(Color.yellow);
     g.setColor(Color.black);

    /*To draw an cone*/
    g.drawOval(200,80,200,50);
    g.drawLine(200,100,300,500);
    g.drawLine(400,100,300,500);
 
    /*To draw a cylinder*/
   g.drawOval(500,60,200,50);
   g.drawLine(500,80,500,300);
   g.drawLine(700,80,700,300);
   g.drawOval(500,280,200,50);
   }
}