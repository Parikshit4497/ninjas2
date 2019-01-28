package OopsPackage.Inheritance;

import java.util.Scanner;

public class Students {
    Scanner s=new Scanner(System.in);
    String studentName="";
    long  enrollemnetNumber;
    long registrationnumber;
    String address="";
    long teleNumber;
    long mobileNo;
    String fathersName="";
    String MothersName="";
    String stream="";
    public void getData()
    {
        System.out.println("Enter the name of the student:");
        studentName=s.nextLine();
        System.out.println("Enter the father's name:");
        fathersName=s.nextLine();
        System.out.println("Enter the Mother's name:");
        MothersName=s.nextLine();
        System.out.println("Enter the residential address:");
        address=s.nextLine();
        System.out.println("Enter the stream of the student:");
        stream=s.nextLine();
        System.out.println("Enter the registration number:");
        registrationnumber=s.nextLong();
        System.out.println("Enter the enrollment number:");
        enrollemnetNumber=s.nextInt();

        System.out.println("Enter the mobile number :");
        mobileNo=s.nextLong();
        System.out.println("Enter the telephone number:");
        teleNumber=s.nextLong();
    }
    public void displayData()
    {
        System.out.println(" The name of the student is:"+ studentName);
        System.out.println(" The father's name is:" +fathersName);
        System.out.println("The Mother's name: " +MothersName);
        System.out.println("The residential address is : "+ address);
        System.out.println("The stream of the student is:" + stream );
        System.out.println("The registration number:" + registrationnumber);
        System.out.println("Enter the enrollment number:"+ enrollemnetNumber);
        System.out.println("The mobile number is :"+ mobileNo);
        System.out.println("The telephone number is:" +teleNumber);
    }
}
class ItStudent extends Students
{
    String year="";
    String subjects[]=new String[5];
    String skills[]=new String[5];
    void getItdata()
    {
        System.out.println("Enter the year in which the student studied:");
        year=s.next();
        System.out.println("Enter the number of subjects: ");
        int n=s.nextInt();
        if(n>subjects.length)
        {
            subjects=new String[subjects.length*2];
        }
        else {
            System.out.println("Enter the   subjects ");
            for (int i = 0; i < n; i++) {
             subjects[i]=s.next();
            }
        }
        System.out.println("Enter the number of skills acquired");
        n=s.nextInt();
        if(n>skills.length)
        {
            skills=new String[2*skills.length];
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                skills[i]=s.next();
            }
        }
    }
    public void ItDisplay()
    {
        System.out.println("The year of teh student is:" + year);
        System.out.println("The subjects of the student are:");
        for(int i=0;i<subjects.length;i++)
        {
            System.out.println(i+":"+subjects[i]);
        }
        System.out.println("The skills of teh student are:");
        for(int i=0;i<skills.length;i++)
        {
            System.out.println(i+":" + skills[i]);
        }
    }
}
class StudentDatabaseUse
{
    public static void main(String[] args) {
        ItStudent i1=new ItStudent();
        i1.getData();
        i1.getItdata();
        i1.displayData();
        i1.ItDisplay();
    }
}