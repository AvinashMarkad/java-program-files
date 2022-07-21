import java.util.*;
class Pra_no_25
{
 public static void main(String args[])
  {
   try
    {
	 Scanner sc=new Scanner(System.in);
	 int a,b,c;
	 
	 System.out.println("Enter the value of a");
	 a=sc.nextInt();
	 System.out.println("Enter the value of b");
	 b=sc.nextInt();
	 
	 c=a/b;
	 
	 System.out.println("Answer :"+c);
	}
   catch(Exception e)
    {
	 System.out.println("Can't divide zero");
	}   
   finally
    {
	 System.out.println("End Program");
	}   
  }
}