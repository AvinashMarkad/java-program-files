class Super
{  
 void Initilizatin()
  {
   int a=20;
   int b=10;
   }
}
class Chaild1 extends Super
{
 void add()
  {
   int c=a+b;
   System.out.println(c);
   }
}
class Chaild2 extends Super
{
 void Sub()
  {
   int d=a-b;
   System.out.println(d);
   }
}
class Lastclass
{
 public static void main(String args[])
  {
   Chaild1 ch1=new Chaild1();
   Chaild2 ch2=new Chaild2();
   
   ch1.Initilizatin();
   ch1.add();
   ch2.Initilizatin();
   ch2.Sub();
   
   }
 }
   
   