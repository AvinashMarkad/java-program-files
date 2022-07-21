//Dcoder Project Wrick Basak
import java.util.*;
public class BillSystem
 {
    public static void main(String args[])
      {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no of slabs");
         int e=sc.nextInt();
         float TPrice=0;
         float TDis=0;
         float TGST=0;
         float Amount=0;
         float pAmount=0;
         
         String[] Name=new String[e];
         float[] price=new float[e];
         int[] Qty=new int[e];
         float[] Discount=new float[e];
         float[] GST=new float[e];
         float[] am=new float[e];
         boolean chk=true;
          System.out.println("\nName\t price \t Qty \t Discount \t GST \n");
            for(int n=0;n<e;n++)
             {
               Name[n]=sc.next();
               price[n]=sc.nextFloat();
               Qty[n]=sc.nextInt();
               Discount[n]=sc.nextFloat();
               GST[n]=sc.nextFloat();


               
               Discount[n]=Discount[n]*price[n]/100*Qty[n];
              GST[n]=(price[n]*Qty[n]-Discount[n])*GST[n]/100;
              TGST=TGST+GST[n];
               TPrice=TPrice+price[n]*Qty[n];
               TDis=TDis+Discount[n];



}




System.out.print("\nName\t price \t Qty \t Discount \t GST \t Amount \n");
for(int n=0;n<e;n++){
System.out.println(Name[n]+" \t"+price[n]+" \t"+Qty[n]+"     \t"+Discount[n]+"    \t"+GST[n]+"     \t"+(price[n]*Qty[n]-Discount[n]+GST[n]));




}
System.out.println("\nTotal Price : "+ TPrice);
System.out.println("Total Discount : "+ TDis);
System.out.println("Total GST : "+ TGST);
System.out.println("Total payable Amount : "+ ((TPrice-TDis)+TGST));











         
          



      }





 }