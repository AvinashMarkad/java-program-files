class Father
{
 void show1()
 {
  System.out.println("This is Parent class");
 }
}
class Brother extends Father
{
 void show2()
 {
  System.out.println("This is Chaild class 1");
 }
}
class Sister extends Father
{
 void show3()
 {
  System.out.println("This is Chaild class 2");
 }
}
class Hirarchical
{
 public static void main(String args[])
 {
  Brother bro=new Brother();
  bro.show1();
  bro.show2();
  Sister sis=new Sister();
  sis.show1();
  sis.show3();
 }
}