import java.io.*;
class LastPro
{
 public static void main(String args[])
  {
    try
	 {
	   int size;
	   InputStream f=new FileInputStream(args[0]);
	   System.out.println("Size of Given File : "+(size=f.available()));
	   char str[]=new char[200];
       for(int i=0;i<size;i++)
        {
		 str[i]=((char)f.read());
		 System.out.print(str[i]);
		}	   
	   f.close();	 
	 }
	catch(Exception e)
     {
	  System.out.println("Exception");
	 }	
  }
}