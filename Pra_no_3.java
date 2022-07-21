import java.util.*;
class Pra_no_3
{
  public static void main(String args[])
    {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any number :");
	  int num=sc.nextInt();
	  
	  if(num!=0)
	  {
		if(num>0)
		{
	     if(num%2==0)
		 {
		   System.out.println("Given Number Is Even");	 
		 }	 
		 else
		 {
		   System.out.println("Given number is Odd");	 
		 }
		}			
	  }
		  
	}
}