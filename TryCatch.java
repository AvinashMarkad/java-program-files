import java.util.*;
class TryCatch
{
 public static void main(String args[])
  {
   try
    {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the value of A :");
	 int a=sc.nextInt();
	 System.out.println("Enter the value of B :");
	 int b=sc.nextInt();
	 int div=a/b;
	 System.out.println("Result is :"+div);
	}
   catch(Exception e)
    {
	  System.out.println("Plz can't Enter the 'Zero'");
	}   
   finally
    {
	  System.out.println("End program");
	}   
  }
}