import java.util.Scanner;
public class avi
{

  int num1;
  int num2;
  //int num3;
  int x;

   avi(int x,int y)
    {
      num1=x;
      num2=y;
      //num3=c;
   }

   void show()
    {

      switch(x)
      {
       case 1:
       num3=num1+num2;
       System.out.println(num3);
        break;

       default:
      System.out.println("Chooce the correct case");
     }
   }

    public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
       int a;
       int b;
       //int c;
       System.out.println("Enter the value of a :");
       a=sc.nextInt();
       System.out.println("Enter the value of b :");
       b=sc.nextInt();

       avi co=new avi(int a,int b);
       co.show();

    }
}