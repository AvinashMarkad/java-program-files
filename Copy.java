import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Copy
{
  public static void main(String args[])throws IOException
	{
	  FileInputStream r=new FileInputStream("C:\\Users\\marka\\Desktop\\Tata.txt");
      FileOutputStream w=new FileOutputStream("C:\\Users\\marka\\Desktop\\Tata1.txt");

      int i;

      while((i=r.read())!=-1)
	  {
		w.write((char)i);  
	  }	
      System.out.println("Copied data.....");	  
	}
}