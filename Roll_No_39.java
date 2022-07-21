interface A
{
 void show();
}
interface B
{
 void show1();
}
class Roll_No_39 implements A,B
{
 public void show()
  {
   System.out.println("This is first interface ");
  }
  
  public void show1()
   {
    System.out.println("This is second interface");
   }
   
   public static void main(String args[])
   {
	   Roll_No_39 obj=new Roll_No_39();
	    obj.show();
		obj.show1();
   }
}