package RevisonComp.Arraylist;

import Interfaces.MobilePhone;

import java.util.ArrayList;

public class MobilPhone {
 private String myNumber;
 private ArrayList<Contacts> myContacts;
  MobilPhone(String myNumber){
     this.myNumber=myNumber;
     this.myContacts=new ArrayList <Contacts>();

 }
 public boolean addNewContact(Contacts contacts){
     if (findContacts(contacts.getContactName())>=0) {
         myContacts.add(contacts);
         return true;
     } else {
         System.out.println("The contact is already on file");
         return false;
     }

 }
private int findContacts(Contacts contacts){
     return this.myContacts.indexOf(contacts);
}
private int findContacts(String ContactName){
    for(int i=0;i<this.myContacts.size();i++){
        Contacts contacts=this.myContacts.get(i);
        if(contacts.getContactName().equals(ContactName));
        return i;
    }
    return -1;
}
public boolean updateContact(Contacts oldContacts,Contacts newcontacts){
    int foundPosition=findContacts(oldContacts);
    if(foundPosition<0){
        System.out.println(oldContacts.getContactName()+" ,was not found.");
        return false;
    }
   this.myContacts.set(foundPosition,newcontacts);
    System.out.println(oldContacts.getContactName()+",was replaced with" +newcontacts.getContactName());
   return true;
}
public boolean removeContact(Contacts contacts){
    int foundPosition=findContacts(contacts);
    if(foundPosition<0){
        System.out.println(contacts.getContactName() +",was not found");
        return false;
    }
    this.myContacts.remove(foundPosition);
    System.out.println(contacts.getContactName()+",was deleted ");
    return  true;
}
public String queryContacts(Contacts contacts){
    if(findContacts(contacts)>=0){
        return contacts.getContactName();
    }
    return null;
}
public  Contacts queryContacts(String name){
    int position=this.findContacts(name);
    if(position>=0){
      return   this.myContacts.get(position);
    }
    return null;
}
public void printContacts(){
    int i;
    for(i=0;i<this.myContacts.size();i++){
        System.out.println("Name :"+this.myContacts.get(i).getContactName() +"Number" +this.myContacts.get(i).getContactNumber() );
    }
}
}
