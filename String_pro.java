import java.util.*;
class String_pro
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your name :");
   String name=sc.nextLine();

   int len=name.length();
   System.out.println(len-1);

   String up=name.toUpperCase();
   System.out.println(up);
  }
}
 