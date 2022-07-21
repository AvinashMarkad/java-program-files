class Circal
{
 float pi;
 float radius;
 Circal(float p,float rad)
  {
   p=pi;
   rad=radius;
  }
  void area()
   {
    float area=pi*radius*radius;
	System.out.println("Area of circle : "+area);
   }
  void display()
   {
   System.out.println("pi of circle : "+pi);
   System.out.println("rad of circle : "+radius);
   }  
}
class area
{
 public static void main(String args[])
  {
   Circal obj=new Circal(3.14f,100.0f);
    obj.area();
	obj.display();
  }
}