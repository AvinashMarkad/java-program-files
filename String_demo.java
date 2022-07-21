public class String_demo
{
  public static void main(String args[])
  {
    String s1="Yogesh";
	System.out.println("First string:"+s1);
	
	String s2="Jadhav";
	System.out.println("Second string:"+s2);
	
	String s=s1.concat(s2);
	System.out.println("Joined the String:"+s);
	
	int len=s1.length();
	System.out.println("Length of the String s1:"+len);
	
	boolean d=s1.isEmpty();
	System.out.println("is string empty:"+d);
	
	System.out.println("Lower case:"+s1.toLowerCase());
	
	System.out.println("Upper case:"+s1.toUpperCase());
	
  }
}