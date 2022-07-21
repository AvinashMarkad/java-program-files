import java.util.*;
class Vector1
{
   void accept()
    {
	int c;
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter Password to write story");
	c=sc1.nextInt();
	
	switch(c)
	{
	case 4030:
     
     Vector<String> story=new Vector<>();

     Scanner sc2=new Scanner(System.in);
    
     System.out.println("Enter today story :");
     String s1=sc2.nextLine();
     
     story.add(s1);     


     System.out.println(story);    
      break;
	  
	  default:
	  System.out.println("Plz Enter valid Password");
      }

    }

} 

class Vector2 extends Vector1
{
  void accept2()
   {
    int d;
	Scanner sc3=new Scanner(System.in);
	System.out.println("Enter Password to write story");
	d=sc3.nextInt();
	
	switch(d)
	{
	case 4030:
	
    Vector<String> story1=new Vector<>();

     Scanner sc4=new Scanner(System.in);
    
     System.out.println("Enter your future planes :");
     String s2=sc4.nextLine();
     
     story1.add(s2);     


     System.out.println(story1); 
	 break;
	 
	 default:
	 System.out.println("Plz Enter valid Password");
     }
     }
}
class Vectorlast
{
 public static void main(String args[])
  {
  
  Vector2 v2=new Vector2();

   v2.accept();
   v2.accept2();
  }
    
}