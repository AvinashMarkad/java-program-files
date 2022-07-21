import java.awt.*;
import java.applet.*;
public class CheakBalanceApplet extends Applet
{
 
  int ac,bal;

 public void init()
  {
   ac=Integer.parseInt(getParameter("AC_NO"));
   bal=Integer.parseInt(getParameter("AC_BAL"));
  }
 
 public void paint(Graphics g)
  {
   if(bal<500)
   {
    g.drawString("LAW BALANCE",100,110);
   }
   else
   {
    g.drawString("BALANCE is SUFFICIANT",100,110);
   }
  }
}

/*
<Applet code="CheakBalanceApplet.class" width=900 height=900>
<param name="AC_NO" value="200"/>
<param name="AC_BAL" value="300"/>
</Applet>
*/