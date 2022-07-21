interface Salary
{
 int Basic_Salary=10000;
 void Basic_Sal();
}
class Employee implements Salary
{
 String name;
 int age;
 Employee(String n,int a)
  {
   n=name;
   a=age;
  }
  void display()
  {
   System.out.println("Name of emp :"+name);
   System.out.println("age of emp :"+age);
  }
 void Basic_Sal()
   {
    System.out.println("Basic Salary :"+Basic_Salary);
   }
}
class Gross_Salary extends Employee implements Salary
{
 int TA,DA,HRA;
 Gross_Salary(int T,int D,int H)
  {
   //super(n,b);
   T=TA;
   D=DA;
   H=HRA;
  }
  
  void Total_Sal()
  {
	int Total_Sal=Basic_Salary+TA+DA+HRA;
	
	System.out.println("total salary :"+Total_Sal);
   }
}
class EMPdetails
{
 public static void main(String args[])
  {
	  Employee obj1=new Employee("Avinash",20);
	  obj1.display();
	obj1.Basic_Sal();
   Gross_Salary obj=new Gross_Salary(1000,2000,7000);
    obj.Total_Sal();
  }
}