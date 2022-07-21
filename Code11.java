import java.util.*;
 
public class Main3 extends Code11{
     public static void main(String arg[]){
	   Code11 obj = new Code11();
     }
}
class Code11
 {
 public  Code11()
  
   {
   // Scanner s = new Scanner (Scanner .in);
    ArrayList<String> Book=new ArrayList<>();
    Book.add("The life of Mahatma Gandhi");
    Book.add("Two Treatises of Government");
    Book.add("The spirit of the laws");
    Book.add("A Suitable Boy");
   
      ArrayList<String> Author=new ArrayList<>();
      Author.add("Author of The life of Mahatma Gandhi book is mahatma gandhi");
      Author.add("Author of Two Treatises of Government is john locke");
      Author.add("Author of The spirit of the laws is Montesquieu");
      Author.add("Author of A Suitable Boy is vikram seth");
      
      ArrayList<String> Book2=new ArrayList<>();
      
  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 0 to start the process");
   int input =sc.nextInt();
  
   
  switch(input)
 
  {
   case 0:
     {
     

     Scanner obj=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=obj.nextLine();

     
     while(true)
  {
    
     Scanner s =new Scanner(System.in);
     System.out.println("Enter 1 for print available books,2 for see  the authorof books,   3 for add books,4 for issue book 5 for return issue book");
     int i=s.nextInt();
     switch(i)
     {
     case 1:
     {
      System.out.println(Book);

      break;
     }
     
     case 2:
     {
      
      System.out.println(Author);
      break;
     }
     
      case 3:
      {
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the book that you want to add");
        String b=sc2.nextLine();
        Book.add(b);
     
         
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the author of the book that you added");
        String author=scanner.nextLine();
        Author.add("Author of"+b+"is"+author);
        System.out.println("Book has been added");
        break;
      }
    
     case 4:
       {
    
       Scanner scan2=new Scanner(System.in);
        System.out.println("Enter your name");
        String name2=scan2.nextLine();
        
       if(name.equalsIgnoreCase(name2))
       {
       
       Scanner sss=new Scanner(System.in);
       System.out.println("Enter the book index that you want to issue");
       int input2=sss.nextInt();
       Book2.add(Book.remove(input2));
       Calendar c=Calendar.getInstance();
       long Date=c.get(Calendar.DATE);
       long Month=c.get(Calendar.MONTH)+1;
       long Year=c.get(Calendar.YEAR);
       System.out.println("The book has been issued on"+Date+"/"+Month+"/"+Year);
       }
       
       else{
         System.out.println("Invalid name");
       }
      break;
      }
    case 5:
      {
       Scanner ssss=new Scanner(System.in);
       System.out.println("Enter the index of the book that you had issued and you want to return it");
       int ii=ssss.nextInt();
       Book.add(Book2.remove(ii));
        break;    
  }
    } 
     }
     }
     }
     } 
   }