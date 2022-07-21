import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        System.out.println("Hi, Welcome to user managment system, Please choose:");
        while (true) {
            System.out.format("1) ADD member\n2) DELETE member\n3) EDIT member\n4) SHOW member\n5) SHOW all member\n6)EXIT\n");
            choose = scanner.nextInt();
            if (choose == 1)
                User.addMember();
            else if (choose == 2)
                User.deleteMember();
            else if (choose == 3)
                User.editMember();
            else if (choose == 4)
                User.searchMember();
            else if (choose == 5)
                User.showAllMember();
            else if (choose == 6)
                break;
            else
                System.out.println("You entered WRONG number!!!! Try Again...");
        }
    }
}
import java.util.*;

public class User {
    static int i = 0;
    static int idMaker = 0;
    static String nameAll = "";
    static String ageAll = "";
    static String idAll = "";
    static String genderAll = "";

    public static void addMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Please enter the user %d name:", i + 1);
        String name = scanner.nextLine();
        System.out.format("Please enter the user %d age:", i + 1);
        String age = scanner.nextLine();
        System.out.format("Please enter the user %d gender:", i + 1);
        String gender = scanner.nextLine();
        nameAll += name + "   ";
        ageAll += age + "   ";
        idAll += "9821000" + (++idMaker) + "   ";
        genderAll += gender.toUpperCase() + "   ";
        i++;
    }

    public static void deleteMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Please enter the user id that you want to remove:");
        String idRemove = scanner.nextLine();
        int j = -1;
        String[] nameArr = nameAll.split(" {3}");
        String[] ageArr = ageAll.split(" {3}");
        String[] idArr = idAll.split(" {3}");
        String[] genderArr = genderAll.split(" {3}");
        for (int m = 0; m < idArr.length; m++) {
            if (idRemove.equals(idArr[m]))
                j = m;
        }
        if (j == -1) {
            System.out.println("The ID that you Entered id not EXISt!!!! Try again...");
            User.deleteMember();
        } else {
            nameAll = "";
            ageAll = "";
            idAll = "";
            genderAll = "";
            for (int m = 0; m < nameArr.length; m++) {
                if (m != j) {
                    nameAll += nameArr[m] + "   ";
                    ageAll += ageArr[m] + "   ";
                    idAll += idArr[m] + "   ";
                    genderAll += genderArr[m] + "   ";
                }
                i--;
            }
        }
    }

    public static void editMember() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int j = -1;
        String[] nameArr = nameAll.split(" {3}");
        String[] ageArr = ageAll.split(" {3}");
        String[] idArr = idAll.split(" {3}");
        String[] genderArr = genderAll.split(" {3}");
        String name, age, gender;
        System.out.format("Please enter the user id that you want to edit:");
        String idEdit = scanner.nextLine();
        for (int m = 0; m < idArr.length; m++) {
            if (idEdit.equals(idArr[m]))
                j = m;
        }
        if (j == -1) {
            System.out.println("The ID that you Entered id not EXISt!!!! Try again...");
            User.editMember();
        } else {
            System.out.format("What do you want to edit?\n1) Name\n2) Age\n3) Gender\n");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.format("Please enter the user new name:\n");
                name = scanner.nextLine();
                for (int m = 0; m < idArr.length; m++) {
                    if (idEdit.equals(idArr[m]))
                        nameArr[m] = name;
                }
            } else if (choice == 2) {
                System.out.format("Please enter the user new age:\n");
                age = scanner.nextLine();
                for (int m = 0; m < idArr.length; m++) {
                    if (idEdit.equals(idArr[m]))
                        ageArr[m] = age;
                }
            } else if (choice == 3) {
                System.out.format("Please enter the user new gender:\n");
                gender = scanner.nextLine();
                for (int m = 0; m < idArr.length; m++) {
                    if (idEdit.equals(idArr[m]))
                        genderArr[m] = gender.toUpperCase();
                }
            }
            nameAll = "";
            ageAll = "";
            idAll = "";
            genderAll = "";
            for (int m = 0; m < nameArr.length; m++) {
                nameAll += nameArr[m] + "   ";
                ageAll += ageArr[m] + "   ";
                idAll += idArr[m] + "   ";
                genderAll += genderArr[m] + "   ";
            }
        }
    }

    public static void searchMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Please enter the user id that you want to see:");
        String idSee = scanner.nextLine();
        int j = -1;
        String[] nameArr = nameAll.split(" {3}");
        String[] ageArr = ageAll.split(" {3}");
        String[] idArr = idAll.split(" {3}");
        String[] genderArr = genderAll.split(" {3}");
        for (int m = 0; m < idArr.length; m++) {
            if (idSee.equals(idArr[m]))
                j = m;
        }
        if (j == -1) {
            System.out.println("The ID that you Entered id not EXISt!!!! Try again...");
            User.searchMember();
        } else {
            System.out.format("Name \t\t\tAge \t\t\tID \t\t\tGender\n");
            for (int m = 0; m < idArr.length; m++) {
                if (idSee.equals(idArr[m])) {
                    System.out.format("%s \t\t\t%s \t\t\t%s \t\t\t%s\n", nameArr[m], ageArr[m], idArr[m], genderArr[m]);
                }
            }
        }
    }

    public static void showAllMember() {
        System.out.format("Name \t\t\tAge \t\t\tID \t\t\tGender\n");
        String[] nameArr = nameAll.split(" {3}");
        String[] ageArr = ageAll.split(" {3}");
        String[] idArr = idAll.split(" {3}");
        String[] genderArr = genderAll.split(" {3}");
        for (int m = 0; m < idArr.length; m++) {
            System.out.format("%s \t\t\t%s \t\t\t%s \t\t\t%s\n", nameArr[m], ageArr[m], idArr[m], genderArr[m]);
        }
    }
}