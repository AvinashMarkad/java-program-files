class Thread_Demo extends Thread
{
 public void run()
  {
   for(int i=0;i<=5;i++)
    {
	 System.out.println("Welcome");
	}
	System.out.println("This is the end");
  }
  public static void main(String args[])
   {
    Thread_Demo obj=new Thread_Demo();
	 obj.start();
   }
}