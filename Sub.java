class Super
{
 void show()
 {
  System.out.println("This is Super Class");
 }
}
class Sub extends Super
{
 void show2()
 {
  System.out.println("This is Sub class extends from Super class");
 }
  public static void main(String args[])
  {
  Sub obj=new Sub();
  obj.show();
  obj.show2();
 }
}