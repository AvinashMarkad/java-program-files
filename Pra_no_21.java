public class Pra_no_21 extends Thread
{
 public void run()
  {
   System.out.println("This is Thread program");
  }
 public static void main(String args[])
  {
   Pra_no_21 obj=new Pra_no_21();
    obj.start();   
  } 
}