import java.util.*;
class Sum_of_digit
{
 public static void main(String args[])
 {
  int a;
  int temp;
   int sum=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter any number :");
a=sc.nextInt();

   while(a>0)
    {
     temp=a%10;
     sum=sum+temp;
     a=a/10;
    }
  System.out.println("Sum of digit :"+sum);
 }
}