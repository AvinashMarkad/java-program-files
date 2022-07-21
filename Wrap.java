public class Wrap
{
 public static void main(String args[])
 {
  System.out.println("Wraper class using Integer");
  int a=10;
  Integer b=a;
  Integer c=Integer.valueOf(b);
  System.out.println("Value of variable a is :"+a);
  System.out.println("Value of variable b is :"+b);
  System.out.println("Value of variable c is :"+c);
  
  System.out.println("Wraper class using Character");
  char i='A';
  Character j=i;
  Character k=Character.valueOf(j);
  System.out.println("Value of variable i is :"+i);
  System.out.println("Value of variable j is :"+j);
  System.out.println("Value of variable k is :"+k);
 }
}