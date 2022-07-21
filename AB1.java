interface A
{
 void show();
}
interface B
{
 void disp();
}
class AB1 implements A,B
{
 public void show()
  {
   System.out.println("This is interface A");
  }
 public void disp()
  {
   System.out.println("This is interface B");
  }
  
public static void main(String args[])
 {
  AB1 obj=new AB1();
   obj.show();
   obj.disp();
 }  
}