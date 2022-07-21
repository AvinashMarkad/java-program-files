import java.util.*;
class Pra_no_14
{
 public static void main(String args[])
  {
	//Scanner sc=new Scanner(System.in);  
   Vector v=new Vector();
   v.add(10);
   v.add(20);
   v.add(30);
   v.add(40);
   
   System.out.println(v);
   System.out.println(v.size());
   System.out.println(v.capacity());
   System.out.println(v.removeElement(10));
   System.out.println(v);
   System.out.println(v.add(60));
   
   Vector v1=new Vector(v);
   System.out.println(v1);
   System.out.println(v.firstElement());
   
  }
}