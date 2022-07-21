class person
{
 void getperson()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Name of Person :");
   String name=sc.nextLine();
   
   System.out.println("Enter the Age of Person :");
   int age=sc.nextint();
  }
}
class employee extends person
{
 void getemployee()
  {
   Scanner sc=new Scanner(System.in);  
   System.out.println("Enter the employee destination :");
   String emp_destination=sc.nextLine();
   
   System.out.println("Enter the employee salary :");
   int emp_salary=sc.nextint();
  }
 void show()
  {
   System.out.println("Name of Person :"+name);
   System.out.println("Age of Person :"+age);
   System.out.println("employee destination :"+emp_destination);
   System.out.println("employee salary :"+emp_salary);
  } 
}
class EMP
{
 public static void main(String args[])
  {
   employee obj=new employee();
    obj.getperson();
	obj.getemployee();
	obj.show();
  }
}