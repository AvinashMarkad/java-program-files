import java.util.*;
interface Salary
{
 double Basic_Salary=10000;
 void Basic_Sal();
}
class Employee 
{
 String name;
 int age;
 Employee(String n,int a)
  {
   n=name;
   a=age;
  } 
 void Display()
  {
   System.out.prinltn("Enter emp name :"+name);
   System.out.prinltn("Enter emp age :"+age);
  }
}
class Gross_Salary extends Employee implements Salary
{
 
 double TA,DA,HRA;
 Gross_Salary(double T;double D,double H)
  {
   T=TA;
   D=DA;
   H=HRA;
  } 
  void Basic_Sal()
   {
    System.out.println("Basic Salary :"+Basic_Salary)
   }
  void Total_Sal()
   { 
    System.out.println("Total Salary :"+Basic_Salary+TA+DA+HRA);
   }
}
class Finalemp
{
 public static void main(String args[])
  {
   Employee obj1=new Employee("Avinash",19);
   Gross_Salary	obj=new Gross_Salary(1000,2000,7000);
   obj.Display();
   obj.Basic_Sal();
   obj.Total_Sal();
  }
}
