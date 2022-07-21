class Pra_no_10_1
{
  //int num1,num2,num3;
  int num4=100;

 Pra_no_10_1(int a)
  {
   System.out.println("value of a :"+a);
  }
 Pra_no_10_1(int b,int c)
  {
   System.out.println("value of b :"+b);
   System.out.println("value of c :"+c);
  }
 Pra_no_10_1()
  {
   System.out.println("value of num4 : "+num4);
  } 
  
  public static void main(String args[])
   {
    Pra_no_10_1 obj=new Pra_no_10_1();
	Pra_no_10_1 obj1=new Pra_no_10_1(12);
	Pra_no_10_1 obj2=new Pra_no_10_1(60,70);
   }
}