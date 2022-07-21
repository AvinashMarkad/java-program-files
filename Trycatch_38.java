import java.util.*;
class Trycatch_38
{
 public static void main(String args[])
  {
   int a,b,c;
   Scanner sc=new Scanner(System.in);
    try
	 {
	  System.out.println("Enter value of a :");
	  a=sc.nextInt();
	  System.out.println("Enter value of b :");
	  b=sc.nextInt();
	  c=a/b;
	  System.out.println("Division is="+c);
	 }
	catch(Exception e)
     {
	  System.out.println("Can't divide zero");
	 }
    finally
     {
	  System.out.println("End of program");
	 }	
  }
}