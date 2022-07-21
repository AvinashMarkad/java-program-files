class Pra_no_21_1 implements Runnable
{
 public void run()
  {
   System.out.println("This is Runnable program");
  }
 public static void main(String args[])
  {
   Pra_no_21_1 obj=new Pra_no_21_1();
   Thread th=new Thread(obj);
    th.start();
  } 
}