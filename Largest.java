import java.util.*;
public class Largest
{
public static void main(String args[])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three integer:");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();

if(x>y && x>z)
{
System.out.println("First num largest:");
}
else if(y>x && y>z)
{
System.out.println("Second num largest:");
} 
else if(z>x && z>y)
{
System.out.println("Third num largest:");
} 
else
{
System.out.println("The number not Disting:");
}
}
}




