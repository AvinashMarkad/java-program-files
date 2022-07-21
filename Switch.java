 import java.util.*;
public class Switch
{
public static void main(String arg[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
a=sc.nextInt();
System.out.println("Enter the number");
b=sc.nextInt();
System.out.println("Press 1.For Addition\nPress 2.For Subtraction\nPress 3.For Multiplication\nPress 4.For Devidation");
d=sc.nextInt();
switch(d)
{
case 1:
d=a+b;
System.out.println(d+" Addition of a and b");
break;
case 2:
d=a-b;
System.out.println(d+" Subtraction of a and b");
break;
case 3:
d=a*b;
System.out.println(d+" Multiplication of a and b");
break;
case 4:
d=a/b;
System.out.println(d+" Devision of a and b");
break;

default:
{
System.out.println("Choose correct case");
}
}
}
}



