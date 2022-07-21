public class Parameter
{
   int a;
   
   Parameter(int c)
   {
     a=c;
	
   }
   
  public static void main(String srgs[])
  {
    Parameter r=new Parameter(123);
	
	System.out.println(r.a);
	
  }
}