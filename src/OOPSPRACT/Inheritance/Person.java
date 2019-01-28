package OOPSPRACT.Inheritance;

public class Person {
    private long id;
    private String name;
    private String address ;
    private long phoneNo;
    private String country;
    Person(){
        this.country="India";
    }
    Person(String name,String address,long phoneNO,long id){
        this();
        this.id=id;
        this.name=name;
        this.address=address;
        this.phoneNo=phoneNO;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
    public void print(){
        System.out.println("The name of the student is " + this.name);
        System.out.println("The  id of the student "+ this.id);
        System.out.println("The country of the student is " + this.country);
        System.out.println("The address of the student is  " + this .address);
        System.out.println("The phone number of the student is" + this.phoneNo);
    }
}
class student extends Person{
     private long rollid;
     private float marks ;
     private String grade;
     private String college;
     student(String name,String address,long phoneNO,long id,long rollid,float marks,String grade,String college){
         super(name,address,phoneNO,id);
         this.college=college;
         this.rollid=rollid;
         this.grade=grade;
         this.marks=marks;
     }

    public String getCollege() {
        return college;
    }

    public String getGrade() {
        return grade;
    }

    public float getMarks() {
        return marks;
    }

    public long getRollid() {
        return rollid;
    }
    public void print(){
         super.print();
        System.out.println("The college of the  person is"+ this.college);
        System.out.println("The roll is of the person is  " + this.rollid);
        System.out.println("The grade of the person is " + this.grade);
        System.out.println("The marks of the student is" + this.marks);

    }
}
class Access1{
    public static void main(String[] args) {
     student s1=new student("Ram ","C-1/65 Ashok Vihar(ground floor) phase 2",981800000,9999,55555,497,"A","BPIT");
     s1.print();
    }
}