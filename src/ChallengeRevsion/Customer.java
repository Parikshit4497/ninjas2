package ChallengeRevsion;

import java.util.ArrayList;

public class Customer {
    private  String customer_name;
    private ArrayList<Double> transaction;
    public Customer(String customer_name,double initialAmount)
    {
        this.customer_name=customer_name;
        this.transaction=new ArrayList <>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double initialAmount)
    {
        this.transaction.add(initialAmount);
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public ArrayList <Double> getTransaction() {
        return transaction;
    }
}
class Branch
{
    private  String branchName;
    private  ArrayList<Customer> customers;
    public  Branch(String branchName)
    {
        this.branchName=branchName;
        this.customers=new ArrayList <>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList <Customer> getCustomers() {
        return customers;
    }
    public  boolean addNewCustomers(String customer_name,double initialAmount)
    {
        Customer  existingCustomer=findCustomer(customer_name);

        if(existingCustomer==null)
        {
            customers.add(new Customer(customer_name,initialAmount));

            return  true;
        }
        return false;
    }
    public  boolean addCustomerTransaction(String customer_name,double amount)
    {
        Customer  existingCustomer=findCustomer(customer_name);
        if(existingCustomer!=null)
        {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    public  Customer findCustomer(String customer_name)
    {
        for (int i=0;i<this.customers.size();i++)
        {
            Customer existingCustomer=this.customers.get(i);
            if(existingCustomer.getCustomer_name().equals(customer_name))
            {
                return  existingCustomer;
            }
        }
        return  null;
    }
}
class Bank
{
    private  String bankName;
    private  ArrayList<Branch> branches;

    public  Bank(String bankName)
    {
        this.bankName=bankName;
        this.branches=new ArrayList <>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList <Branch> getBranches() {
        return branches;
    }
    public boolean addNewBranch(String branch_name)
    {
        if(findBranch(branch_name)==null)
        {
            this.branches.add(new Branch(branch_name));
            return  true;
        }
        return false;
    }
    public boolean addNewCustomer(String branch_Name,String customer_name,double initialAmount)
    {
        Branch branch =findBranch(branch_Name);
        if(branches!=null)
        {
            branch.addNewCustomers(customer_name,initialAmount);
             return  true;
        }
        return  false;
    }
    public boolean CustomerTransactions(String Branch,String Customer_Name,double amount) {
        Branch branch = findBranch(Branch);
        if (branch != null) {
            branch.addCustomerTransaction(Customer_Name, amount);
            return true;
        }
        return false;
    }
    private  Branch findBranch(String Branch)
    {
        for(int i=0;i<this.branches.size();i++)
        {
            Branch branches=this.branches.get(i);
            if(branches.getBranchName().equals(Branch))
            {
                return  branches;
            }
        }
        return null;
    }
    public  boolean listCustomers(String branchName,boolean showTransaction)
    {
        Branch branch=findBranch(branchName);
        if(branch!=null)
        {
            System.out.println("Customers details for branch" + branch.getBranchName());
            ArrayList<Customer> branchCustomer=branch.getCustomers();
            for(int i=0;i<branchCustomer.size();i++)
            {
                Customer branchCustomers =branchCustomer.get(i);
                System.out.println("Customer " + branchCustomers.getCustomer_name()+"[" +i+"]");

                if(showTransaction)
                {
                    System.out.println("Transaction");
                    ArrayList<Double> transactions=branchCustomers.getTransaction();
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
