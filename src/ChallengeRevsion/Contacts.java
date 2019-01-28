package ChallengeRevsion;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
    private String Phone_No;
    private  String Name;
    public Contacts(String Phone_No,String Name)
    {
        this.Name=Name;
        this.Phone_No=Phone_No;
    }

    public String getName() {
        return Name;
    }

    public String getPhone_No() {
        return Phone_No;
    }
    public  Contacts createContact(String Name,String Phone_No)
    {
        return  new Contacts(Phone_No,Name);
    }
}
class MobilePhone
{
    private  String My_Number;
    private ArrayList<Contacts> contacts;
    public MobilePhone(String My_Number)
    {
        this.My_Number=My_Number;
        this.contacts=new ArrayList <Contacts>();
    }
    public boolean addNewContact(Contacts contacts)
    {
        if(findContacts(contacts.getName())>=0)
        {
            System.out.println("The contact you are trying to add already exists ");
            return  false;
        }
        this.contacts.add(contacts);
        return true;
    }
    public int findContacts(String Name)
    {
        for(int i=0;i<this.contacts.size();i++)
        {
            Contacts existing=this.contacts.get(i);
            if(existing.getName().equals(Name))
            {
                return  i;
            }
        }
        return  -1;
    }
    public  int findContacts(Contacts contacts)
    {
        for (int i=0;i<this.contacts.size();i++)
        {
            Contacts existingContacts=this.contacts.get(i);
            if(existingContacts.equals(contacts))
            {
                return i;
            }

        }
        return -1;
    }
    public  Contacts queryConatcts(String name)
    {
        int position=findContacts(name);
        if(position>=0)
        {
            return this.contacts.get(position);
        }
        return null;
    }
    public  String queryContacts(Contacts contacts)
    {
        int position=findContacts(contacts);
        if(position>=0)
        {
            return  contacts.getName();
        }
        return null;
    }
    public boolean UpdateContacts(Contacts oldcontacts,Contacts newContacts)
    {
        int position=findContacts(oldcontacts);
        if(position<0)
        {
            System.out.println("The contact " + oldcontacts.getName() +"does not exists");
            return false;
        }
        this.contacts.add(position,newContacts);
        System.out.println("The contact " + oldcontacts.getName() + " has been updated to" + newContacts.getName());
        return true;
    }
    public  boolean removeContacts(Contacts contacts) {
        int position = findContacts(contacts);
        if (position < 0) {
            System.out.println("The contact" + contacts.getName() + " that you are looking for does not exists ");
            return false;
        }
        this.contacts.remove(position);
        return true;
    }
    public void printContacts()
    {
        for(int i=0;i<this.contacts.size();i++){
            System.out.println((i+1)+"." +this.contacts.get(i).getName()+"->" +this.contacts.get(i).getPhone_No());
        }
    }

}
class MainContacts
{
    private static Scanner s=new Scanner(System.in);
    private static MobilePhone mycontacts=new MobilePhone("98881900");

    public static void main(String[] args) {

        boolean quit=false;
        startPhone();
        printPhone();
        while(!quit)
        {
            System.out.println("Enter the option that you wish to choose:");
            int action =s.nextInt();
            s.nextLine();
            switch (action)
            {
                case 0:
                    System.out.println("Your mobile phone is shutting down:");
                    quit=true;
                    break;
                case 1:
                    mycontacts.printContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    queryContacts();
                    break;
                case 6:
                   printPhone();
                   break;
            }
        }

    }
    public static  void addContacts()
    {
        System.out.println("Enter the name of the person :");
        String name=s.next();
        System.out.println("Enter the telephone number:");
        String phone_no=s.next();
        if(mycontacts.addNewContact(new Contacts(phone_no,name)))
        {
            System.out.println("New contact added: name = "+ name+" phone = " +phone_no);
        }
        else
        {
            System.out.println("The contact cannot be added:");
        }
    }
    public  static void updateContacts()
    {
        System.out.println("Enter the name of teh existing contact you wish to update :");
        String Name=s.next();
        Contacts existingName=mycontacts.queryConatcts(Name);
        if(existingName==null)
        {
            System.out.println("Contacts not found:");
            return;
        }
        System.out.println("Enter new name :");
        String  newName=s.next();
        System.out.println("enter new phone number:");
        String  newPhone=s.next();
        if(mycontacts.UpdateContacts(existingName,new Contacts(newName,newPhone)))
        {
            System.out.println("The contacts have been updated successfully:");

        }
        else
        {
            System.out.println("The contact cannot be updated:");
        }
    }
    public  static  void removeContacts()
    {
        System.out.println("Enter the name of the contact that you wish to remove :");
        String name=s.next();
        Contacts existingContact=mycontacts.queryConatcts(name);
        if(mycontacts.removeContacts(existingContact))
        {
            System.out.println("The contact with name :" +existingContact.getName()+" and number " +existingContact.getPhone_No() + "has been removed");
        }
        else
        {
            System.out.println("The contact cannot  be removed:");
        }
    }
    public  static void queryContacts()
    {
        System.out.println("Enter the name that you wish to find ");
        String name=s.next();
        Contacts existingContacts=mycontacts.queryConatcts(name);
        if(existingContacts==null)
        {
            System.out.println("Contact not found:");
        }
        System.out.println("Name" +existingContacts.getName()+"phone number is:"+existingContacts.getPhone_No());

    }
    public  static  void printPhone()
    {
        System.out.println("1:PrintContacts :\n" +"2: Add new Contacts :\n" +"3: Update existing Contacts:\n " +"4: Remove Contacts\n " + "5: queryContacts \n" +"6 : PrintMenu  ");

    }
    public  static void  startPhone()
    {
        System.out.println("Your mobile phone is starting ");
    }
}