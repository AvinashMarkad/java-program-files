// PersonalInformation.java
// Programmed by Y.
// 03/14/2012
// This is a class called PersonalInformation that holds different data: name, address, age, and phone number.
// Chapter 6, #3.

   public class PersonalInformation
   {
      private String name; 				// Name
      private String address; 			// Address
      private int age; 			  			// Age
      private int phonenumber;			// Phone number   
   
      PersonalInformation(String Name, String Address, int Age, int PhoneNumber)
      
      {
         name = Name;
         address = Address;
         age = Age;
         phonenumber = PhoneNumber;
      }
   
   	
   
   	
      public String getName(String Name)
      {
      		
      
         return name;
      }
   	
   
   
      public String getAddress()
      {
        
         return address;
      
      }
   
   
      public int getAge()
      {
      
      
         return age;
      }
   
   
      public int setPhoneNumber()
      {
      
         return phonenumber;
      }
   }














// PersonalInformationDemo.java
// This is a program called PersonalInformationDemo that creates 3 instances of personal data:
// 1. My own information, 2. Friends' information, and 3. Family members' information.
// Programmer: Y
// CISC115
// Chapter 6, Programming Challenge #3 Personal Information Class.
// 3/14/2012

//import java.lang.*;

 import java.util.Scanner; 	// imports the package necessary to use the Scanner class.

   public class PersonalInformationDemo
   
   {
      public static void main(String[] args)
		
      {
		
		Scanner keyboard = new Scanner(System.in); // declares scanner output object as keyboard

         String Name;			// Name
         String Address;		// Address
         int Age;					// Age
         long PhoneNumber;	// Phone number
      	
          
         //PersonalInformation personalinformation = new PersonalInformation(Name,    Address, Age, PhoneNumber);
			
			 		
			{
			// Get the user's name.
         System.out.print("What is your name? ");
         Name = keyboard.nextLine();
      	
      	// Get the user's address.
         System.out.print("What is your full address? ");
         Address =  keyboard.nextLine();
      	
      	// Get the user's age.
			System.out.print("What is your age? ");
         Age = keyboard.nextInt();
      	
      	// Get the user's phone number.
         System.out.print("Type your 10-digit phone number: ");
         PhoneNumber = keyboard.nextLong();
      	}
      	  	
      						
		  
         for(int i = 1; i <= 3; i++)
         {
            System.out.println("Your name is " + Name);
         
         
            System.out.println("Your address is " + Address);	
					
	   System.out.println("Your age is " + Age);
					
	  System.out.println("Your phone number is " + PhoneNumber);
		
							
         }
         
   }
		  
 }