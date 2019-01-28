package OOPSPRACT;

import java.util.Scanner;

public class Employee {
    private String name;
    private long roleid;
    private double basicsal;
    private  String companyname;
    Employee(){
        this.companyname="naggaro";
    }
    public Employee(String name, long id, float basicsal) {
        this();
        this.name = name;
        this.roleid = id;
        this.basicsal = basicsal;
    }
    public void takedetails(String name,long roleid ,double basicsal){
        this.basicsal=basicsal;
        this.name=name;
        this.roleid=roleid;
    }

    public double getBasicsal() {
        return basicsal;
    }

    public String getName() {
        return name;
    }

    public double ns(){
        return gs()-tax();
    }
    public  double  gs(){
        return  basicsal+hra()+da()+ta()-pf();
    }
    public long getRoleid() {
        return roleid;
    }

    double hra(){
        return basicsal*0.30;
    }
    double da(){
        return  basicsal*0.20;
    }
    double ta(){
        return basicsal*0.10;
    }
    double pf(){
        return basicsal*0.05;
    }
    public double tax(){
        double totalsal=gs();
        if(totalsal>=200000&&totalsal<=300000){
            return 0.10*basicsal;
        }else if(totalsal>=300000&&totalsal<=500000){
            return 0.20*basicsal;
        }else if(totalsal>500000){
                return  0.30*basicsal;
        }
        return 0.0;
    }
    public void printSalarySlip(){
        System.out.println("Id "+roleid);
        System.out.println("Name "+name);
        System.out.println("Salary "+basicsal);
        System.out.println("Hra "+hra());
        System.out.println("Da "+da());
        System.out.println("Ta "+ta());
        System.out.println("PF "+pf());
        System.out.println("GS "+gs());
        System.out.println("NS "+ns());
    }
}
class TestEmployee{
    public static void main(String[] args) {
       Employee e1=new Employee();
         int ch;
         long id;
         String name;
         double basicsal ;
         Scanner sc=new Scanner(System.in);
         while(1<2) {
             System.out.println("Enter the option you wish to choose");
             System.out.println("1.Enter the details");
             System.out.println("2. Print slip");
             System.out.println("3. Exit");
             ch = sc.nextInt();
             switch (ch) {
                 case 1:
                     System.out.println("Enter the name of the student ");
                     name = sc.nextLine();
                     sc.nextLine();
                     System.out.println("Enter the id of the employee ");
                     id = sc.nextInt();
                     System.out.println("Enter the basic salary ");
                     basicsal = sc.nextDouble();
                     e1.takedetails(name, id, basicsal);
                     break;
                 case 2:
                     e1.printSalarySlip();
                     break;
                 case 3:
                     System.exit(0);

             }
         }

    }
}