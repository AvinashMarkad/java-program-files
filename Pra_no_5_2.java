import java.util.*;
class Pra_no_5_2 
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int num1;
	
	System.out.println("Enter number up to you have even numbers :");
	num1=sc.nextInt();
	
	for(int i=0;i<=num1;i++)
	 {
	   if(i%2==0)
	    {
		  System.out.println(i);
		}
	 }
  }
}
