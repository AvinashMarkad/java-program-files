import java.util.*;
public class Foreven 
{
public static void main(String args[])
{
int a,i;
Scanner sc=new Scanner(System.in);

System.out.println("Enter up to you have Even Number:");
a=sc.nextInt();

for(i=1;i<=a;i++)
{
if(i%2==0)
  {
   System.out.println(i);
   }
}
}
}
