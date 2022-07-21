import java.util.*;
class Pra_no_13_1
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter the length of an array");
   int len=sc.nextInt();
   
   int arry[]=new int[len];
   
   System.out.println("Enter the "+len+" Elements");
   for(int i=0;i<len;i++)
    {
	 arry[i]=sc.nextInt();
	}
   System.out.println("Elements in array");
    for(int i=0;i<len;i++)
     {
	  System.out.println(arry[i]);
	 }	
  }
}