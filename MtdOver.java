class MtdOver1
{
 /*void show()
  {
   System.out.println("Mtd one");
  }*/
}
class MtdOver2 extends MtdOver1 
{
 void show()
  {
   System.out.println("Mtd two");
  }
}
class MtdOver
{
 public static void main(String args[])
  { 
   MtdOver2 obj=new MtdOver2();
   obj.show();
  }
}
