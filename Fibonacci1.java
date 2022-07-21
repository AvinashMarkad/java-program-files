class Fibonacci1
{
 public static void main(String args[])
 {
  int a=1,b=1;
   int c;
   System.out.println(a);
   System.out.println(b);

   for(int i=1;i<=9;i++)
   {

    c=a+b;
   System.out.println(""+c);

    a=b;
    b=c;

   }
  
 }
}