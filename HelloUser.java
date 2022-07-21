import java.awt.*;
import java.applet.*;
public class HelloUser extends Applet
{
 String str;

 public void init()
  {
   str=getParameter("UsearName");
   str="Hello "+str;
  }
  
 public void paint(Graphics g)
  {
   g.drawString(str,10,100);
  } 
} 

/*
<Applet code="HelloUser" width=900 height=900>
<PARAM NAME="UsearName" VALUE=Samarth>
</Applet>
*/