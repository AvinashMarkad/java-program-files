class SBI
{
 void bank()
  {
   System.out.println("SBI rate of Intrest : 8");
  }
}
class MBK extends SBI
{
 void bank()
  {
   super.bank();
   System.out.println("MBK rate of Intrest : 9");
  }
  public static void main(String args[])
  {
   MBK obj=new MBK();
    obj.bank();
  }
}
