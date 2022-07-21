class a
{
 void show()
  {
   System.out.println("This is super class");
  }
}
class b extends a
{
 void show()
  {
   super.show();
   System.out.println("This is sub class");
  }
}
class Pra_no_17
{
 public static void main(String args[])
  {
   b obj=new b();
    obj.show();
  }
}