interface Super1
{
 void mtd1();
}
interface Super2
{
 void mtd2();
}
class Sub1 implements Super1,Super2
{
 public void mtd1()
  {
   System.out.println("This is first super class");
  }
 public void mtd2()
  {
   System.out.println("This is second super class");
  }
public static void main(String args[])
 {
  Sub1 obj=new Sub1();
   obj.mtd1();
   obj.mtd2();
 }  
}