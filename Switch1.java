import java.util.*;
public class Switch1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
System.out.println("Choose any case:");
System.out.println("Press 1.For Add:\nPress 2.For Sub:\nPress 3.For Multiplication:\nPress 4.Div:\nPress 5.Odd Or Even:\nPress 6.For Negetiv Or Positive:");
c=sc.nextInt();

switch(c)
{
case 1:      
System.out.println("Enter First number:");
a=sc.nextInt();
System.out.println("Enter Second Number:");
b=sc.nextInt();
d=a+b;
System.out.println("Addition of 1st and 2nd number is:"+d);
break;


case 2:       
System.out.println("Enter First number:");
a=sc.nextInt();
System.out.println("Enter Second Number:");
b=sc.nextInt();
d=a-b;
System.out.println("Subtraction of 1st and 2nd number is:"+d);
break;

case 3:
System.out.println("Enter First number:");
a=sc.nextInt();
System.out.println("Enter Second Number:");
b=sc.nextInt();
d=a*b;
System.out.println("Multiplication of 1st and 2nd number is:"+d);
break;

case 4:     
System.out.println("Enter First number:");
a=sc.nextInt();
System.out.println("Enter Second Number:");
b=sc.nextInt();
d=a/b;
System.out.println("Division of 1st and 2nd number is:"+d);
break;

case 5:      
System.out.println("Enter Any number:");
a=sc.nextInt();
if(a%2==0)
{
System.out.println(a+" is Evem Number");
}
else
{
System.out.println(a+" is Odd Number");
}
break;

case 6:      
System.out.println("Enter Any number:");
a=sc.nextInt();
if(a>0)
{
System.out.println(a+" is Positive Number");
}
else
{
System.out.println(a+" is Negetive Number");
}
break;

default:
System.out.println("Choose correct value OR Enter the correct value");
}
}
}