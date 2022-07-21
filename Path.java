public class Bright
{
 int a;
 
 void accept()
 {
  a=100;
  
  System.out.println(a);
 
 }
 
}

public class Path extends Bright
{
 int b=200;

 void sam()
 { 

 System.out.println(b);
  
  }

}

public class Path1
{

public static void main(String args[])
{
 Path p=new Path();
 
 p.accept();
 p.sam();

}
}