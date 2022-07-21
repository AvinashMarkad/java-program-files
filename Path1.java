class Bright
{

 void accept()
 {
  int a=100;
 
 
  
  System.out.println(a);
 }
 
 
}

class Path extends Bright
{
 void sam()
{
 int b=200;
 

 System.out.println(b);
 
}
}

class Path1
{

public static void main(String args[])
{
 Path p=new Path();
 
 p.accept();
 p.sam();

}
}