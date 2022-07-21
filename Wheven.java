import java.util.*;
class Wheven
{
public static void main(String args[])
{
int a;
int i=1;

Scanner sc=new Scanner(System.in);

System.out.println("Enter you have up to Even number:");
a=sc.nextInt();

while(i<=a)
{
if(i%2==0)
System.out.println(i);
i++;
}

}
}

