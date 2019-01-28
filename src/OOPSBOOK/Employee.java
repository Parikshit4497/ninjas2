package OOPSBOOK;

/**
 * Created by hp on २२-०८-२०१७.
 */
public class Employee {
    //this instance variable is visible for any child class
    public String name;
    //This variable is visible in Employee class only
    private double salary;

    public Employee(String empname) {
        name = empname;
    }

    private void Salary(double empsal)
    {
        salary=empsal;
    }
    // This method prints the employee details .
    public void printEmp()
    {
        System.out.println("name:" + name );
        System.out.println("salary:"+ salary );
    }

    public static void main(String[] args) {
        Employee empOne=new Employee("rajesh");
        empOne.Salary(1000000);
        empOne.printEmp();
    }
}
