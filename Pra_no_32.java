import java.io.*;
class Pra_no_32
{
 public static void main(String args[])
  {
   try
    {
	 int size;
	 InputStream f=new FileInputStream(args[0]);
	 
	 System.out.println("Size of an file :"+(size=f.available()));
	 
	 char ary[]=new char[200];
	 for(int i=0;i<size;i++)
	 {
	  ary[i]=((char)f.read());
	  System.out.print(ary[i]);
	 }
	 f.close();
	}
   catch(Exception e)
    {
	 System.out.println("Exception");
	}   
  }
}