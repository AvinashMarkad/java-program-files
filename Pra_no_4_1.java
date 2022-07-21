import java.util.*;
class Pra_no_4_1
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int num1,num2,max;
   System.out.println("Enter the value of num1 : ");
   num1=sc.nextInt();
   System.out.println("Enter the value of num2 : ");
   num2=sc.nextInt();
   
   max=(num1>num2) ? num1:num2;
   
   System.out.println("Big number in given numbers :"+max);
  } 
}