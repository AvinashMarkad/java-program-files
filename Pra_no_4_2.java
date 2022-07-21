import java.util.*;
class Pra_no_4_2
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int num1,num2,sum;
	
	System.out.println("Enter the value of num 1 : ");
	num1=sc.nextInt();
	System.out.println("Enter the value of num 2 : ");
	num2=sc.nextInt();
	
	sum=(num1>num2) ? (num1+num2):(num1-num2);
	if(sum>0)
	{
	System.out.println("Sum of num1 and num2 : "+sum);
	}
	else if (sum<0)
	{
     System.out.println("Sub of num1 and num2 :"+sum);		
	}
	else
	{
	 System.out.println("Plz Don't Enter same numbers");	
	}
  }
}