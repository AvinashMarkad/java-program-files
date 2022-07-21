import java.io.IOException;
class A_Pra26_27
{
 void show()throws IOException
 {
  throw new IOException("Device Error");
 }
 void display()
  {
   try
    {
	 show();
	}
	catch(Exception e)
	 {
	  System.out.println("Exception Handled");
	 }
  }
  public static void main(String args[])
   {
     A_Pra26_27 obj=new A_Pra26_27();
	 obj.display();
   }
}