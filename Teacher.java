import java.util.*;
class student
{
    int srno,rollno,mrk1,mrk2,mrk3,mrk4,mrk5,total,std;
    String name,course,div;
    float per;
    Scanner sc=new Scanner(System.in);
    
    public student()
    {
        System.out.println();
        System.out.println("Enter serial no.:");
        srno=sc.nextInt();
        System.out.println("Enter course name:");
        course=sc.next();
        System.out.println("Enter roll no:");
        rollno=sc.nextInt();
        System.out.println("Enter student name:");
        name=sc.next();
        System.out.println("Enter std:");
        std=sc.nextInt();
        System.out.println("Enter div:");
        div=sc.next();
        System.out.println("Enter mrk1:");
        mrk1=sc.nextInt();
        System.out.println("Enter mrk2:");
        mrk2=sc.nextInt();
        System.out.println("Enter mrk3:");
        mrk3=sc.nextInt();
        System.out.println("Enter mrk4:");
        mrk4=sc.nextInt();
        System.out.println("Enter mrk5:");
        mrk5=sc.nextInt();
    }
    
     void totalmarks()
    {
        total=mrk1+mrk2+mrk3+mrk4+mrk5;
        System.out.println("Total is:"+total);
    }
    
    void showstudentdetails()
    {
        System.out.println("Roll no:"+rollno);
        System.out.println("Student name:"+name);
        System.out.println("course:"+course);
        System.out.println("std:"+std);
        System.out.println("div:"+div);
        System.out.println("mrk1:"+mrk1);
        System.out.println("mrk2:"+mrk2);
        System.out.println("mrk3:"+mrk3);
        System.out.println("mrk4:"+mrk4);
        System.out.println("mrk5:"+mrk5);
        System.out.println("total:"+total);
        System.out.println("mrk1:"+mrk1);
        System.out.println("per:"+per);
    }
    
    public void percent()
    {
        per=(float)total*100/500;
        System.out.println("percent is:"+per);
    }
}


public class Teacher
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the number of Student list:");
        int n=sc.nextInt();
        student s[]=new student[n+1];
        for(int i=1;i<s.length;i++)
        {
            System.out.println("SrNo :"+i);
            s[i]=new student();
        }
        
        int ch;
        do
        {
             System.out.println();
             System.out.println("Main Menu\n 1.Show Student Details\n 2.Marks Details\n3.Exit");    
             System.out.println();
             System.out.println("Select your Choice:");
             ch=sc.nextInt();
             System.out.println();
             switch(ch)
             {
                 case 1:
                 System.out.println("Select SrNo:");
                 int a1=sc.nextInt();
                 System.out.println();
                s[a1].totalmarks();
                 s[a1].percent();
                 s[a1].showstudentdetails();
                 break;
                 
                 case 2:
                 System.out.println("Select SrNo:");
                 int a2=sc.nextInt();
                 System.out.println();
                 s[a2].totalmarks();
                 s[a2].percent();
                 break;
                 
                 case 3:
                 System.out.println("Thank you...");
             }
        }
        while(ch!=3);
    }
}

