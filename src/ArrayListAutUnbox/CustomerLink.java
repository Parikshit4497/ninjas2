package ArrayListAutUnbox;

import java.util.ArrayList;

public class CustomerLink {
    private  String name;
    private  double balance;

    public CustomerLink(String name,double balance) {
        this.balance=balance;
        this.name=name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class MainLink
{
    public static void main(String[] args) {
        CustomerLink customerLink=new CustomerLink("Tim",54.96);
        CustomerLink anotherCustomer;
        anotherCustomer=customerLink;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer" + anotherCustomer.getName()+" get balance" + anotherCustomer.getBalance());

        ArrayList<Integer> intList=new ArrayList <>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for(int i=0;i<intList.size();i++)
        {
            System.out.println(i+ ":" + intList.get(i));
        }
        intList.add(1,2);
        for (int i=0;i<intList.size();i++)
        {
            System.out.println(i+":"+ intList.get(i));
        }
    }
}