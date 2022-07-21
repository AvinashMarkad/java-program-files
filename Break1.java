import java.util.*;
class Break1
{
public static void main(String args[])
{
int a,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
i=sc.nextInt();
for(a=1;a<=i;a++)
{
System.out.println(a);
if(a==50)
{
break;
}
}
}
}
