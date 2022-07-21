import java.io.*;
class bill
{
    int itemno;
    String itemname;
    int qty;
    int price;
    int tprice;
    bill(int no,String na,int q,int pr,int tp)
    {
        itemno=no;
        itemname=na;
        qty=q;
        price=pr;
        tprice=tp;
    }
    void display()
    {
        tprice=price*qty;
        System.out.println("\t|"  +itemno+"\t"  +itemname+"\t  "+qty+"   \t"+price+"\t"  +tprice+"|\t");
    
    }
}
class Program 
{
    public static void main(String a[])throws IOException
        {
        int x=0;
        int total=0;
        DataInputStream di=new DataInputStream(System.in);
        System.out.println("\t**\t\t\t Welcome to DJ Mall\t\t**\t\n");
        System.out.println("\tEnter the item purchased");
        x=Integer.parseInt(di.readLine());
        bill ob[]=new bill[x];
    System.out.println("------------------------------------------------------------");
        System.out.println("\tEnter bill details\n\titem no\n\titem name\n\tqty\n\tprice");
        System.out.println("------------------------------------------------------------\n");
        for(int i=0;i<x;i++)
        {
            
int itemno=Integer.parseInt(di.readLine());
            String itemname=di.readLine();
            int qty=Integer.parseInt(di.readLine());
            int price=Integer.parseInt(di.readLine());
            int tprice=price*qty;
            ob[i]=new bill(itemno,itemname,qty,price,tprice);
        }
        System.out.println("\t|no\titem name\tqty\tprice\ttprice|\t\n");
        for(int i=0;i<x;i++)
        {
            total=total+ob[i].tprice;
            ob[i].display();
        
}
       System.out.println("total is "+total);
    }
}