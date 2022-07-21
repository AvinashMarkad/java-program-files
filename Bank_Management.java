import java.util.*;

public class Bank_Management {

    static int option, balance, deposit_money, withdraw_money;
    static long phone_number, adhaar, pan, random;
    static String name, male;
    static double account_no;

    static int min = 10;
    static long max = 1000000001;

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("            **********BANK MANAGEMENT SYSTEM**********");

        do {
            interfac();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Add_Account();
                    break;

                case 2:
                    Detail_Account();
                    break;

                case 3:
                    Delete_Account();
                    break;

                case 4:
                    Add_Money();
                    break;

                case 5:
                    Withdraw_Money();
                    break;
            }
        } while (option != 6);

        sc.close();
    }

    public static void interfac() {

        Scanner ch = new Scanner(System.in);

        System.out.println("\n      CREATE ACCOUNT    (1)");
        System.out.println("      CHECK DETAILS     (2)");
        System.out.println("      DELETE ACCOUNT    (3)");
        System.out.println("      DEPOSIT MONEY     (4)");
        System.out.println("      WITHDRAW MONEY    (5)");
        System.out.println("           EXIT         (6)");
        System.out.print("     CHOOSE ANY OPTION : ");

        ch.close();

    }

    // add account
    public static void Add_Account() {

        Scanner add = new Scanner(System.in);

        System.out.print("ENTER THE FULL NAME : ");
        name = add.nextLine();

        System.out.print("\nENTER THE E-MAIL : ");
        male = add.nextLine();

        System.out.print("\nENTER THE PHONE NUMBER : ");
        phone_number = add.nextLong();

        System.out.print("\nENTER YOUR ADHAR CARD NUMBER : ");
        adhaar = add.nextInt();

        System.out.print("\nENTER THE PAN CARD NUMBER : ");
        pan = add.nextInt();

        System.out.print("\nENTER THE AMMOUNT TO DEPOSIT : ");
        balance = add.nextInt();

        double random = min + Math.random() * (max - min);
        System.out.println("\n YOUR ACCOUNT NUMBER : " + (int) random);

        System.out.println("\nACCOUNT CREATED SUCCESSFULLY !");

        add.close();

    }

    // detail account :
    public static void Detail_Account() {
        System.out.print("\n    NAME : " + name);

        System.out.print("\n    MALE : " + male);

        System.out.print("\n    PHONE NUMBER : " + phone_number);

        System.out.print("\n    ADHAAR NUMBER : " + adhaar);

        System.out.print("\n    PAN CARD NUMBER : " + pan);

        System.out.print("\n    ACCOUNT NUMBER : " + (int) random);

        System.out.println("\n    BALANCE : " + balance);
    }

    // delete account :
    public static void Delete_Account() {
        name = null;
        male = null;
        phone_number = 0;
        balance = 0;
        System.out.println("account number cannot be delete ..!");

        System.out.println("\nACCOUNT DELETED SUCCESSFULLY ! ");

    }

    // deposit money
    public static void Add_Money() {
        Scanner deposit = new Scanner(System.in);

        System.out.print("\n    ENTER THE AMMOUNT : ");
        deposit_money = deposit.nextInt();

        balance = balance + deposit_money;

        System.out.println("\n  AMMOUNT ADDED SUCCESSFULLY !");

        deposit.close();
    }

    public static void Withdraw_Money() {
        Scanner withdraw = new Scanner(System.in);

        System.out.print("\n    ENTER THE AMMOUNT : ");
        withdraw_money = withdraw.nextInt();
        if (withdraw_money <= balance) {

            balance = balance - withdraw_money;

            System.out.println("\n  AMMOUNT WITHDRAWEL SUCCESSFULLY !");

        }

        else
            System.out.println("\n  AMMOUNT IS GREATER THAN BALANCE !");

        withdraw.close();
    }
}
