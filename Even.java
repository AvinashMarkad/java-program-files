import java.util.Scanner;
public class Even
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Number:");
int a=sc.nextInt();
if(a>0)
{
if(a!=0)
{
if(a%2==0)
{
System.out.println("Given Number is Even");
}
else
{
System.out.println("Given Number is Odd");
}
}
}
}
}
