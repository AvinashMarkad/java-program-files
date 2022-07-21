import java.util.*;
import java.io.*; 
class FileReading
{
 public static void main(String args[])
  {
	  try{
		  
          int size;
          Scanner sc=new Scanner(System.in);
          InputStream rf=new FileInputStream(args[0]);
          System.out.println("Size of given file : "+(size=rf.available()));
          char ary[]=new char[200];
          for(int i=0;i<size;i++)
         {
	      ary[i]=((char)rf.read());
	      System.out.print(ary[i]);
	     }
	    rf.close();
	  }
	 catch(Exception e)
	 {
		System.out.println("Exception............!"); 
	 }	 
   }
}