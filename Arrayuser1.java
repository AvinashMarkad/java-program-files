import java.util.*;
class Arrayuser1
    {
		public static void main(String arg[])
		{
	   int a;
	   Scanner sc=new Scanner (System.in);
	   System.out.println("enter the number");
	   a=sc.nextInt();
	   int ary[]= new int[a];
	   System.out.println("enter the element in stored in array");
	   for (int i=0;i<a;i++)
	   {
		   ary[i]=sc.nextInt();
	   }
	   for (int i=0;i<a;i++)
	   {
	     System.out.println(ary[i]);
	   }
	}
}
	   
	   
	   