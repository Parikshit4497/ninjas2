package ArrayListAutUnbox;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name,double initialAmount)
    {
        this.name=name;
        this.transactions=new ArrayList <Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount )
    {
            this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList <Double> getTransactions() {
        return transactions;
    }

}
class Branch
{
    private  String name;
    private ArrayList<Customer> customers;
    public  Branch(String name)
    {
        this.name=name;
        this.customers=new ArrayList <Customer>();
    }

    public ArrayList <Customer> getCustomers() {
        return customers;
    }

    public String getName()
    {
        return name;
    }
    public  boolean newCustomer(String customerName,double initialAmount)
    {

        if(findCustomer(customerName)==null)
        {
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public  boolean addCustomerTransaction(String customerName,double amount)
    {
        Customer existingCustomer=findCustomer(customerName);
        if (existingCustomer!=null)
        {
            existingCustomer.addTransaction(amount);
            return true;

        }
        return  false;
    }
    private Customer findCustomer(String customer )
    {
        for(int i=0;i<this.customers.size();i++)
        {      Customer checkCustomer=this.customers.get(i);
            if(checkCustomer.equals(customer))
            {
                return  checkCustomer;
            }
        }
        return  null;
    }
}
class Bank
{
    private  String name;
    private  ArrayList<Branch> branches;
    public  Bank(String name)
    {
        this.name=name;
        this.branches=new ArrayList <Branch>();
    }
    public  boolean addBranch(String branchName) {
        if (findBranch(branchName)==null) {
             this.branches.add(new Branch(branchName));

           return   true ;
        }
          return false;
    }
    public boolean addCustomer(String branchName,String customerName,double initialAmount )
    {
        Branch branch=findBranch(branchName);
        if (branch!=null)
        {
            return branch.newCustomer(customerName,initialAmount);

        }
        return  false;

    }
    public boolean  addCustomerTransaction(String branchName,String customerName,double amount)
    {
        Branch branch=findBranch(branchName);
        if(branch!=null)
        {
            return branch.addCustomerTransaction(customerName,amount);
        }
        return  false;
    }
    private Branch findBranch(String branchName )
    {
        for(int i=0;i<this.branches.size();i++)
        {      Branch checkBranch=this.branches.get(i);
            if(checkBranch.equals(branchName));
            {
                return  checkBranch;
            }
        }
        return  null;
    }
    public  boolean listCustomers(String branchName,boolean showTransaction)
    {
        Branch branch=findBranch(branchName);
        if(branch!=null)
        {
            System.out.println("Customers details for branch" + branch.getName());
            ArrayList<Customer> branchCustomer=branch.getCustomers();
            for(int i=0;i<branchCustomer.size();i++)
            {
                Customer branchCustomers =branchCustomer.get(i);
                System.out.println("Customer " + branchCustomers.getName()+"[" +i+"]");

                if(showTransaction)
                {
                    System.out.println("Transaction");
                    ArrayList<Double> transactions=branchCustomers.getTransactions();
                    for(int j=0;j<transactions.size();j++)
                    {
                        System.out.println("[" +(j+1)+" ] Amount " + transactions.get(j));
                    }

                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}