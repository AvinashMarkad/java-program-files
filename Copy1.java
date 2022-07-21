import java.io.*;
class Copy1
{
 public static void main(String args[])throws IOException
  {
   FileInputStream rf=new FileInputStream("C:\\Users\\marka\\Desktop\\Tata.txt");
   FileOutputStream wf=new FileOutputStream("C:\\Users\\marka\\Desktop\\Tata2.txt");
   int i;
   while((i=rf.read())!=-1)
   {
    wf.write((char)i);
   }
   System.out.println("Copide data................!");
  }
}