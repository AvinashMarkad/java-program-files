import java.util.*;
import java.io.*;
class Entry
{
public String name,quantity,note;

}
public class C
{
public static Entry[] entryList;
public static int num_entries;
public static Scanner stdin=new Scanner(System.in);
public static void main(String args[]) throws Exception
{
int i;
char c;
String code,command;
entryList=new Entry[200];
num_entries=0;
command=null;
c=' ';
readInventory("inventory.txt");
System.out.println("Codes are entered as 1 to 8 characters\nUse\n'e' for enter\n'f' for find\n'l' for listing all the entries\n'q' to quit.\n");
while(c!='q')
{
System.out.print("Command\t:");
command=stdin.next();
c=command.charAt(0);
switch(c)
{
case 'e':
addItem();break;
case 'f':
code=stdin.next();
stdin.nextLine();
i=index(code);
if(i>=0)
    displayEntry(entryList[i]);
else
    System.out.print("No entry with code\t"+code);break;
case 'l':
listAllItems();break;
case 'q':
CopyInventoryToFile("inventory.txt");
System.out.println("Quitting the application.all the entriess are stored in the file inventory.txt");
break;
default: 
System.out.println("Invalid command ");
} } }
public static void readInventory(String FileName)throws Exception
{
File F;
F=new File(FileName);
Scanner s=new Scanner(F);
while(s.hasNextLine()) {
entryList[num_entries]=new Entry();
entryList[num_entries].name=s.next();
entryList[num_entries].quantity=s.next();
entryList[num_entries].note=s.nextLine();
num_entries++;
}
s.close();
}
public static void addItem() {
System.out.println("Enter Code");
String name=stdin.next();
String quantity;
stdin.nextLine();
entryList[num_entries]=new Entry();
entryList[num_entries].name=name;
System.out.println("Enter Quantity");
quantity=stdin.nextLine();
entryList[num_entries].quantity=quantity;
System.out.println("Enter Notes");
entryList[num_entries].note=stdin.nextLine();
num_entries++;
}
public static int index(String Key){
for(int i=0; i<num_entries;i++)
{
 if(entryList[i].name.equalsIgnoreCase(Key))
  return i;
}
return -1;
}
public static void displayEntry(Entry item){
System.out.println("\t"+item.name+"\t"+item.quantity+"\t"+item.note);
}
public static void listAllItems(){
 int i=0;
while(i<num_entries)
{
 displayEntry(entryList [i]);
i++;
} }
public static void CopyInventoryToFile(String FileName) throws Exception{
FileOutputStream out=new FileOutputStream(FileName);
PrintStream p=new PrintStream(out);
for(int i=0;i<num_entries;i++)
{
p.println(entryList[i].name+"\t"+entryList[i].quantity+"\t"+entryList[i].note);
}
}
}