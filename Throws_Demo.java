import java.io.IOException;
class Throws_Demo
{
 void mtd1() throws IOException
  {
   throw new IOException("This is Exception");
  }
 void mtd2()
  {
   try
    {
	 mtd1();
	}
   catch(Exception e)
    {
	 System.out.println("This is catch block");
	}   
  } 
 public static void main(String args[])
  {
   Throws_Demo obj=new Throws_Demo();
    obj.mtd2();
  }
}