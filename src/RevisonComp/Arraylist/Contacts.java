package RevisonComp.Arraylist;

public class Contacts {
    private  String contactName;
    private String contactNumber;



    Contacts(String name, String phoneNumber){
      this.contactName=name;
      this.contactNumber=phoneNumber;
  }


    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public static  Contacts createContact(String name, String phoneNumber){
        return new Contacts(name,phoneNumber);
    }
}
