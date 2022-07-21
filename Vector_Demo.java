import java.util.*;
public class Vector_Demo
{
  public static void main(String args[])
  {
    Vector v=new Vector();
	v.add(10);
	v.add(30);
	v.add(40);
	v.add(50);
	v.add(60);
	
	System.out.println("Elements in vector before inserting:"+v);
	
	v.add(2);
	
	System.out.println("Elemrnt in vector after inserting:"+v);
  }
}