import java.util.*;
public class Pcons
{
    int a,b,c,d,e,f;
 
    Pcons(int a,int b,int c,int d,int e,int f)
         {
         
         this.a=a;
         this.b=b;
         this.c=c;
         this.d=d;
         this.e=e;
         this.f=f;
         
         }


    void show()
        {
       
   
     System.out.println("Addition of two numbers :"+c);
     System.out.println("Substraction of two numbers :"+d);
     System.out.println("Multiplication of two numbers :"+e);
     System.out.println("Division of two numbers :"+f);
    
         }
public static void main(String args[])
        {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers :");
    int a=sc.nextInt();
    int b=sc.nextInt();

    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a/b;

   Pcons pc=new Pcons(a,b,c,d,e,f);
   pc.show();
       }
}
     

   