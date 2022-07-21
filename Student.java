public class Student
{
public

int no;
float marks;

Student(int rno,float marks1)
{
rno=no;
marks1=marks;
}
void display()
{

System.out.println(no);
System.out.println(marks);
}

public static void main(String args[])
{

Student s1=new Student(10,89);
s1.display();
}
}; 