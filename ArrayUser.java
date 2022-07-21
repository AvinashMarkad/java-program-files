import java.util.*;
class ArrayUser
{
  public static void main(String args[])
  {
    int len;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the array length:");
	len=sc.nextInt();
	
	int a[]=new int[len];
	
	System.out.println("Enter element store im array:");
	for(int i=0;i<len;i++)
	{
	  a[i]=sc.nextInt();
	}
	System.out.println("Elemrnt in array:");
	for(int i=0;i<len;i++)
	{
	System.out.println(a[i]);
	}
  }
}