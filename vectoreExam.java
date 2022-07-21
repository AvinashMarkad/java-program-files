import java.util.*;
class vectoreExam
{
 public static void main(String args[])
  {
   Vector v=new Vector(5);
   v.add(5);
   v.add(15);
   v.add(25);
   v.add(35);
   v.add(45);
   
   System.out.println("Orignal elements"+v);
   
   v.insertElementAt((22),1);
   System.out.println("Orignal elements"+v);
   
   v.removeElementAt(0);
   v.removeElementAt(3);
   System.out.println("Orignal elements"+v);
  }
}