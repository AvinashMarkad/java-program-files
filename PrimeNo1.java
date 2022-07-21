import java.util.*;
class PrimeNo1
{
 public static void main(String args[])
 {
  int no;
  Scanner sc=new Scanner(System.in);
System.out.println("Enter any number to check prime number or not prime number");
no=sc.nextInt();
  int temp=0;
  for(int i=2;i<=no-1;i++)
   {
    if(no%i==0)
     {
      temp=temp+1;
     }
   }
  if(temp==0)
  {
   System.out.println(no+" is prime number");
  }
  else
  {
   System.out.println(no+" is not prime number");
  }
 }
}