class Overriding
{
 void show()
 {
  System.out.println("This is my first class method");
 }
} 
class Overriding1_39 extends Overriding
{
 void show()
 {
  super.show();
  System.out.println("This is may second class method");
 }
 public static void main(String args[])
 {
  Overriding1_39 obj=new Overriding1_39();
   obj.show();
 }
}