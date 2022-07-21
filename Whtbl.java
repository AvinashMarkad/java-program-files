import java.util.*;
class Whtbl
{
public static void main(String args[])
{
int a,i;
int j=1;

Scanner sc=new Scanner(System.in);

System.out.println("Enter you have table:");
i=sc.nextInt();

while(j<=10)
{
a=i*j;
System.out.println(a);
j++;
}
}
}
