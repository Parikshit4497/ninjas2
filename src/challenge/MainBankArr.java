package challenge;

public class MainBankArr {
    public static void main(String[] args) {


        Bank bank = new Bank("National Australia Bank :");
        bank.AddnewBranch("Adelaide");
        bank.addCustomer("Adelaide","Tim",50.05);
        bank.addCustomer("Adelaide","Mike",175.34);
        bank.addCustomer("Adelaide","Percy ",220.02);
        bank.AddnewBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);
        bank.AddCustomerTransaction("Adelaide","Tim",44.42);
        bank.AddCustomerTransaction("Customer","Tim",12.44);
        bank.AddCustomerTransaction("adelaide","Mike",1.65);
        bank.listCustomer("Adelaide",false);
    }
}
