package ArrayListAutUnbox;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    private  String name;
    private  String phon_no;
    public  Contacts(String name,String phon_no)
    {
        this.name=name;
        this.phon_no=phon_no; }

    public String getName() {
        return name;
    }

    public String  getPhon_no() {
        return phon_no;
    }
    public static  Contacts createContact(String name,String phon_no)
    {
        return new Contacts(name,phon_no);
    }
}
class MobilePhone {
    private String myNumber;

    private ArrayList <Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList <Contacts>();
    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact is already on file:");
            return false;
        }

        myContacts.add(contacts);
        return true;
    }

    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    public boolean updateContact(Contacts oldcontact, Contacts newContacts) {
        int foundPosition = findContact(oldcontact);
        if (foundPosition < 0) {
            System.out.println(oldcontact.getName() + ",was not found.");
            return  false;
        }
        this.myContacts.set(foundPosition, newContacts);
        System.out.println(oldcontact.getName() + ",was replaced with" + newContacts.getName());
        return true;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);

            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }public   Contacts queryContact(String name)
    {
        int position=findContact(name);
        if(position>=0) {
            return this.myContacts.get(position);
        }
        return  null;
    }

    public  String queryContact(Contacts contacts)
    {
        if(findContact(contacts)>=0)
        {
            return  contacts.getName();

        }
        return null;
    }

    public  void printContacts()
    {
        System.out.println("Contact list :");
        for(int i=0;i<this.myContacts.size();i++)
        {
            System.out.println((i+1)+"." + this.myContacts.get(i).getName()+"->" + this.myContacts.get(i).getPhon_no());
        }
    }
    public  boolean removeContact(Contacts contact)
    {
        int foundPosition=findContact(contact);
        if(foundPosition<0)
        {
            System.out.println(contact.getName()+" ,was not found ");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+ ",was not found ");
        return true;
    }
}
class Main
{
    private static  Scanner s=new Scanner(System.in);
    private  static MobilePhone mobilePhone=new MobilePhone("03990 03339 339");
    public static void main(String[] args) {
        boolean quit =false;
        startPhone();
        printActions();
        while(!quit)
        {
            System.out.println("\n Enter action: (6 to show available actions )");
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
        Contacts newContact =Contacts.createContact(name,phone);
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
        Contacts exitingContactRecord = mobilePhone.queryContact(name);
        if (exitingContactRecord == null) {
            System.out.println("contact not found ");
            return ;
        }
        System.out.println("Enter new contact name :");
        String newName=s.nextLine();
        System.out.println("Enter new contact phone number :");
        String newNumber =s.nextLine();
        Contacts newContact=Contacts.createContact(newName,newNumber);
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
        Contacts exitingContactRecord = mobilePhone.queryContact(name);
        if (exitingContactRecord == null) {
            System.out.println("contact not found ");
            return;
        }
        if(mobilePhone.removeContact(exitingContactRecord))
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
        Contacts exitingContactRecord = mobilePhone.queryContact(name);
        if (exitingContactRecord == null) {
            System.out.println("contact not found ");
            return;
        }
        System.out.println("Name" +exitingContactRecord.getName()+"phone number is:"+exitingContactRecord.getPhon_no());
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
