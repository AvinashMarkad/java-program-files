import java.util.*;
class Pra_no_6_1
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter the starting number");
   int a=sc.nextInt();
   
   System.out.println("Enter the last number :");
   int b=sc.nextInt();
   
   int i=a;
   
   do
    {
	 System.out.println(i);
	 i++;
	}
	while(i<=b);
  }
}