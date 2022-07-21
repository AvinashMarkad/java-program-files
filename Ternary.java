import java.util.*;
public class Ternary
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the First number:");
a=sc.nextInt();

System.out.println("Enter the Second number:");
b=sc.nextInt();

c=(a>b) ? (a+b) : (a-b);

if(c>0)
{
System.out.println(c+" is the addition of first and second number");
}
else if(c<0)
{
System.out.println(c+" is the substraction of first and second number");
}
else
{
System.out.println("Plz do not enter equal number or plz enter correct value");
}
}
}

