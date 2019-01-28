package ArrayListAutUnbox;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts1 {
    private  String myName;
    private  String myPhone;
    Contacts1(String myName,String myPhone)
    {
        this.myName=myName;
        this.myPhone=myPhone;
    }

    public String getMyName() {
        return myName;
    }

    public String getMyPhone() {
        return myPhone;
    }
    public static Contacts1 createContacts(String myName,String myPhone)
    {
        return new Contacts1(myName,myPhone);
    }
}
class Mobile1
{
    private  String myNumber;
    private ArrayList<Contacts1> myContacts;
    public  Mobile1(String myNumber)
    {
        this.myNumber=myNumber;
        this.myContacts=new ArrayList <Contacts1>();
    }
    public boolean addNewContact(Contacts1 contacts1)
    {
        if(findContacts(contacts1.getMyName())>=0)
        {
            System.out.println("Contact is already on file");
        }
        myContacts.add(contacts1);
        return true;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public  int findContacts(Contacts1 contacts1)
    {
        return this.myContacts.indexOf(contacts1);
    }
    public  int findContacts(String contactname) {
        for (int i = 0; i <= this.myContacts.size(); i++) {
            Contacts1 contacts1 = this.myContacts.get(i);
            if (contacts1.getMyName().equals(contactname)) {
                return i;
            }

        }
        return -1;
    }
    public boolean updateContact(Contacts1 oldcontacts,Contacts1 newContact)
    {
        int foundPosition=findContacts(oldcontacts);
        if(foundPosition<=0)
        {

            System.out.println(oldcontacts.getMyName()+",was not found");
            return  false;

        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldcontacts.getMyName()+",wss replaced with the new contact "+newContact.getMyName());
        return true;
    }
    public String queryContacts(Contacts1 contacts1)
    {
        if(findContacts(contacts1)>=0)
        {
            return  contacts1.getMyName();
        }
        return  null;
    }
    public Contacts1 queryContact(String findname)
    {
        int position=findContacts(findname);
        if(findContacts(findname)>=0)
        {
            return this.myContacts.get(position);
        }
        return null;
    }
    public void printContacts()
    {
        for(int i=0;i<this.myContacts.size();i++)
        {
            System.out.println((i+1)+"." +this.myContacts.get(i).getMyName()+"->"+ this.myContacts.get(i).getMyPhone());
        }
    }
    public boolean removeContacts(Contacts1 contacts1)
    {
        int foundposition =findContacts(contacts1);
                if(foundposition<0)
                {

                    System.out.println("The contact is not present in teh list ");
                    return false;
                }
                this.myContacts.remove(contacts1);
        System.out.println(contacts1.getMyName()+ ",was not found");
        return true;

    }
}
class MainListPhone
{
    private  static Scanner s=new Scanner(System.in);
  private static   Mobile1 mobilePhone=new Mobile1("03399 9990 7890");

    public static void main(String[] args) {
        boolean quit=false;
        startPhone();
        printActions();
        while(!quit)
        {System.out.println("\n Enter action: (6 to show available actions )");
            int action=s.nextInt();
            s.nextLine();
            switch (action)
            {
                case 0:
                    System.out.println("\nShutting down...");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break ;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;


            }


        }
    }
    private  static void addNewContact()
    {
        System.out.println("Enter new contact name :");
        String name =s.nextLine();
        System.out.println("Enter the phone number :");
        String phone=s.nextLine();
        Contacts1 newContact =Contacts1.createContacts(name,phone);
        if(mobilePhone.addNewContact(newContact))
        {
            System.out.println("New contact added name =" + name +"phone =" +phone );
        }
        else
        {
            System.out.println("Cannot add," + name+ " already on file :");
        }

    }
    private  static void   updateContact() {
        System.out.println("Enter existing contact name :");
        String name = s.nextLine();
        Contacts1 exitingContactRecord = mobilePhone.queryContact(name);
        if (exitingContactRecord == null) {
            System.out.println("contact not found ");
            return ;
        }
        System.out.println("Enter new contact name :");
        String newName=s.nextLine();
        System.out.println("Enter new contact phone number :");
        String newNumber =s.nextLine();
        Contacts1 newContact=Contacts1.createContacts(newName,newNumber);
        if(mobilePhone.updateContact(exitingContactRecord,newContact))
        {
            System.out.println("Contact successfully updated:");
        }
        else
        {
            System.out.println("Contact is not updated successfully:");
        }
    }
    private  static void   removeContact() {
        System.out.println("Enter existing contact name :");
        String name = s.nextLine();
        Contacts1 exitingContactRecord = mobilePhone.queryContact(name);
        if (exitingContactRecord == null) {
            System.out.println("contact not found ");
            return;
        }
        if(mobilePhone.removeContacts(exitingContactRecord))
        {
            System.out.println("Contact has been successfully deleted:");
        }
        else
        {
            System.out.println("Error deleting contact:");
        }
    }
    private  static void   queryContact() {
        System.out.println("Enter existing contact name :");
        String name = s.nextLine();
        Contacts1 exitingContactRecord = mobilePhone.queryContact(name);
        if (exitingContactRecord == null) {
            System.out.println("contact not found ");
            return;
        }
        System.out.println("Name" +exitingContactRecord.getMyName()+"phone number is:"+exitingContactRecord.getMyPhone());
    }
    private  static void startPhone()
    {
        System.out.println("Starting phone...");
    }
    private static  void printActions()
    {
        System.out.println("\n Available actions:\n press:");
        System.out.println("0-to shutdown \n" +"1-to print contacts \n" +"2 -to add a new contact \n" +"3 - to update an existing contact \n"+
                "4-to remove an existing contact \n" + "5-query if an existing contact exits \n "+
                "6-to print a list of available actions :");
        System.out.println("Choose your action ");
    }
}


