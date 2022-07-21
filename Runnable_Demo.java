public class Runnable_Demo implements Runnable
{
 public void run()
  {
   for(int i=0;i<=5;i++)
    {
	 System.out.println("Computer");
	}
	 System.out.println("Program Ends");
  }
  public static void main(String args[])
   {
    Runnable_Demo obj=new Runnable_Demo();
	Thread th=new Thread(obj);
	 th.start();
   }
}