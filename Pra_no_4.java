import java.util.*;
class Pra_no_4
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int num1,num2,num3,sw;

     System.out.println("Press 1.For Addition"+'\n'+"Press 2.For Substraction"+'\n'+"Press 3.For Multiplication"+'\n'+"Press 4.For Division"+'\n'+"Press 5.For Check Even or Odd number");	
     sw=sc.nextInt();

     switch(sw)
	 {
		case 1:
          System.out.println("Enter the value of Num 1 :");
          num1=sc.nextInt();
          System.out.println("Enter the value of Num 2 :");
          num2=sc.nextInt();		   
		  num3=num1+num2;
		  System.out.println("Addition of num1 and num2 : "+num3);
		  break;

        case 2:
          System.out.println("Enter the value of Num 1 :");
          num1=sc.nextInt();
          System.out.println("Enter the value of Num 2 :");
          num2=sc.nextInt();		   
		  num3=num1-num2;
		  System.out.println("Substraction of num1 and num2 : "+num3);
		  break;  

        case 3:
          System.out.println("Enter the value of Num 1 :");
          num1=sc.nextInt();
          System.out.println("Enter the value of Num 2 :");
          num2=sc.nextInt();		   
		  num3=num1*num2;
		  System.out.println("Multiplication of num1 and num2 : "+num3);
		  break;	

        case 4:
          System.out.println("Enter the value of Num 1 :");
          num1=sc.nextInt();
          System.out.println("Enter the value of Num 2 :");
          num2=sc.nextInt();		   
		  num3=num1/num2;
		  System.out.println("Division of num1 and num2 : "+num3);
		  break;		  
		  
		case 5:
          System.out.println("Enter the value of Num 1 :");
          num1=sc.nextInt();
          if(num1%2==0)
		  {
			System.out.println("Given number is Even");  
		  }
		  else
		  {
			System.out.println("Given number is Odd");  
		  }
		  break;  
		default:
		  System.out.println("Plz Choose valid case");
	 }	 
  }  
}