package RevisonComp.Arraylist;

import Interfaces.MobilePhone;

import java.util.Scanner;

public class MobileMain {
    private static Scanner scanner=new Scanner(System.in);
    private  static MobilPhone MobilePhone = new MobilPhone("0079 -78990 44400");
    public static void main(String[] args) {

        boolean quit=false;
      startPhone();
      printActions();
      while(!quit){
          System.out.println("\n Enter action (6 to show available actions )");
          int action =scanner.nextInt();
          scanner.nextLine();
          switch(action) {

              case 0:
              System.out.println("\n Shutting down .....");
              quit=false;
              break;
              case 1:
                  MobilePhone.printContacts();
                  break;
              case 2:
                  addNewContacts();
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

    public static void addNewContacts(){
        System.out.println("Enter the name of the contact");
        String name=scanner.nextLine();
        System.out.println("Enter the contact number");
        String number= scanner.nextLine();
        Contacts  newContacts=Contacts.createContact(name,number);
      if ( MobilePhone.addNewContact(newContacts)){
          System.out.println("New contact added name:" +name +" ,number" +number);
      }else{
          System.out.println("Cannot add contact " + name +" it is already on teh list ");
      }
    }
    public static void updateContact(){
        System.out.println("Enter the name of the  person ");
        String name=scanner.nextLine();
       Contacts existingContact= MobilePhone.queryContacts(name);
if(existingContact==null){
    System.out.println("contacts not found");
    return ;
}
        System.out.println("Enter new contact name");
String newName=scanner.nextLine();
        System.out.println("Enter new contact name");
        String newNumber=scanner.nextLine();
        Contacts newContacts=Contacts.createContact(newName,newNumber);
        if(MobilePhone.updateContact(existingContact,newContacts)){
            System.out.println("Successfully updated record ");

        }else{
            System.out.println("Error updating");
        }
    }
    public static void removeContact(){
        System.out.println("Enter the name of the  person ");
        String name=scanner.nextLine();
        Contacts existingContact= MobilePhone.queryContacts(name);
        if(existingContact==null){
            System.out.println("contacts not found");
            return ;
        }
        if(MobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted ");
        }else{
            System.out.println("Contact number not found  ");
        }
    }
    public static  void queryContact(){
        System.out.println("Enter the name of the  person ");
        String name=scanner.nextLine();
        Contacts existingContact= MobilePhone.queryContacts(name);
        if(existingContact==null){
            System.out.println("contacts not found");
            return ;
        }
        System.out.println("Name: " +existingContact.getContactNumber() +" phone number is" +existingContact.getContactNumber());
    }
    public static void startPhone(){
            System.out.println("Starting phone...");
    }
    private  static void printActions(){
        System.out.println("\nAvailable actions :\n press");
        System.out.println("0 -to shutdown \n" +"1: to print contacts \n" +"2 add a new contact \n " +" 3: to update an existing contact \n" + "4: to remove an existing contact " +" 5: to query an existing contact exists " +" 6 -to print a list of available actions ");
        System.out.println("Choose your actions :");
    }
}
