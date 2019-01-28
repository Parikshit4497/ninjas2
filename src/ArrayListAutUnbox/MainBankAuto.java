package ArrayListAutUnbox;

public class MainBankAuto {
    public static void main(String[] args) {


        Bank bank = new Bank("National Australia Bank :");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide","Tim",50.05);
        bank.addCustomer("Adelaide","Mike",175.34);
        bank.addCustomer("Adelaide","Percy ",220.02);
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);
        bank.addCustomerTransaction("Adelaide","Tim",44.42);
        bank.addCustomerTransaction("Customer","Tim",12.44);
        bank.addCustomerTransaction("adelaide","Mike",1.65);
        bank.listCustomers("Adelaide",true);
    }
}
