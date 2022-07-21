class A
{
 void show()
  {
   System.out.println("This is class A");
  }
}
class B extends A
{
 void show()
  {
   System.out.println("This is class B");
  }
}
class C extends B 
{
 void show()
  {
   System.out.println("This is class C");
  }
}
class Expoly
{
 public static void main(String args[])
  {
   A ref;
   ref=new A();
   ref.show();
   ref=new B();
   ref.show();
   ref=new C();
   ref.show();
  }
}