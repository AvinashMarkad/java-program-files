import java.util.*;
class Bank
{
    private String accno;
    private String name;
    private Long balance;

    Scanner KB=new Scanner(System.in);
    void openAccount()
    {
        System.out.println("Enter Account number:");
        accno=KB.next();
        System.out.println("Enter Name:");
        name=KB.next();
        System.out.println("Enter Balance:");
        balance=KB.nextLong();

    }

    void showAccount()
    {
        System.out.println(accno+","+name+","+balance);
        
    }

    void deposit()
    {
        Long amt;

        System.out.println("Enter Amount U want to deposit:");
        amt=KB.nextLong();
        balance=balance+amt;
        
    }

    void Withdrawal()
    {
        Long amt;
        System.out.println("Enter Amaunt U want withdraw:");
        amt=KB.nextLong();

        if(balance>=amt)
        {
            balance=balance-amt;
        }
        else
        {
            System.out.println("less balance:");
        }
    }
    boolean search(String acn)
    {
        if(accno.equals(acn))
        {
            showAccount();
            return(true);
        }
        return(false);
    }
}
class ExBank
{
    public static void main(String args[])
    {
        Scanner KB=new Scanner(System.in);

        System.out.println("How many cus. u. want to input:");
        int n=KB.nextInt();

        Bank c[]=new Bank[n];
        for(int i=0;i<c.length;i++)
        {
            c[i]=new Bank();
            c[i].openAccount();
        }
        int ch;
        do
        {
            System.out.println("Main menu\n1.dip all\n2.serch by acc\n3.depo\n4.withdrow\n5.Exit:");

        System.out.println("U r Choice:");
        ch=KB.nextInt();
        switch(ch)
        {
            case 1:
for(int i=0;i<c.length;i++)
{
    c[i].showAccount();
}
break;

case 2:
System.out.println("Enter Account number u want to search....:");
        String acn=KB.next();
        boolean found=false;
        for(int i=0;i<c.length;i++)
        {
            found=c[i].search(acn);
            if(found)
            {
                break;
            }
        }

        if(!found)
        {
            System.out.println("Search   failed..not Exist..");
        }
        break;

        case 3:
        System.out.println("Enter Account number:");
        acn=KB.next();
        found=false;
        for(int i=0;i<c.length;i++)
        {
            found=c[i].search(acn);
            if(found)
            {
                c[i].deposit();
                break;
            }
        }
        if(!found)
        {
            System.out.println("serch fal acc no exit:");
        
        }
        break;

        case 4:
        System.out.println("Enter Account number:");
        acn=KB.next();
        found=false;
        for(int i=0;i<c.length;i++)
        {
            found=c[i].search(acn);
            if(found)
            {
                c[i].Withdrawal();
                break;
            }
        }
        if(!found)
        {
            System.out.println("not exist:");
        
        }
        break;

        case 5:
        System.out.println("Good bye...:");
        break;
        
        }
        }
        while(ch!=5);
    }
}