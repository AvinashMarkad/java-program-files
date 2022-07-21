import java.util.*;
class Vector1
{
   void accept()
    {
     
     Vector<String> story=new Vector<>();

     Scanner sc=new Scanner(System.in);
    
     System.out.println("Enter today story :");
     String s1=sc.nextLine();
     
     story.add(s1);     


     System.out.println(story);    


    }

} 

class vector2 extends vector1
{
  void accept2()
   {
    Vector<String> story1=new Vector<>();

     Scanner sc=new Scanner(System.in);
    
     System.out.println("Enter old story :");
     String s2=sc.nextLine();
     
     story.add(s2);     


     System.out.println(story1); 
     }
}
class Vector3

public static void main(String args[])
{
  
  Vector2 v2=new Vector2();

   v2.accept();
   v2.accept2();
}
    