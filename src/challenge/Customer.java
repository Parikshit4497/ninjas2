package challenge;

import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions ;
    public   Customer(String name,double initialamount)
    {
        this.name=name;
        this.transactions=new ArrayList <>();
        addTransactions(initialamount);
    }

    public String getName() {
        return name;
    }

    public ArrayList <Double> getTransactions() {
        return transactions;
    }
    public void addTransactions(double  initalamount)
    {
        this.transactions.add(initalamount);
    }
}
class Branch
{
    private  String branchName;
    private ArrayList<Customer> customers;
   public   Branch(String branchName)
   {
       this.branchName=branchName;
       this.customers=new ArrayList <Customer>();
   }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList <Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String customerName,double initialAmount)
    {
        Customer existingCustomer=findCustomer(customerName);
        if (existingCustomer==null)
        {
             this.customers.add(new Customer(customerName,initialAmount));
             return  true;
        }
        return  false;

    }
    public boolean AddCustomerTransactions(String customerName,double amount)
    {
        Customer existingCustomer=findCustomer(customerName);
        if(existingCustomer!=null)
        {
          existingCustomer.addTransactions(amount);
          return  true;
        }
        return false;

    }
    public  Customer findCustomer(String customer)
    {
        for(int i=0;i<this.customers.size();i++)
        {
            Customer findCustomer=this.customers.get(i);
            if(findCustomer.equals(customer))
            {
                return findCustomer;
            }

        }
        return  null;
    }

}
class Bank
{
       private  String BankName;
       private  ArrayList<Branch> branches;
       public Bank(String BankName)
       {
           this.BankName=BankName;
           this.branches=new ArrayList <>();
       }

    public String getBankName() {
        return BankName;
    }

    public ArrayList <Branch> getBranches() {
        return branches;
    }

    public boolean AddnewBranch(String branchName)
    {
        Branch branchExisting=findBranch(branchName);
        if(branchExisting==null)
        {
         this.branches.add(new Branch(branchName)) ;
         return  true;
        }
        return  false;
    }
    public boolean addCustomer(String  branchName,String customerName,double amount)
    {
        Branch exitingBranch=findBranch(branchName);
        if(exitingBranch!=null)
        {
            exitingBranch.AddCustomerTransactions(customerName,amount);
        }
        return  false;
    }
    public  boolean AddCustomerTransaction(String branchName,String CustomerName,double amount)
    {
        Branch  existingBranch=findBranch(branchName);
        if(existingBranch!=null)
        {
            existingBranch.AddCustomerTransactions(CustomerName,amount);
        }
        return false;
    }
    public  Branch findBranch(String branchname)
    {
        for(int i=0;i<this.branches.size();i++)
        {
            Branch exitsingBranch=this.branches.get(i);
            if(exitsingBranch.equals(branchname))
            {
                return  exitsingBranch;
            }
        }
        return  null;
    }
    public  boolean listCustomer(String branchName,boolean showTransaction)
    {
        Branch branch=findBranch(branchName);
        if(branch!=null)
        {
            System.out.println("Customers details for branch" + branch.getBranchName());
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

