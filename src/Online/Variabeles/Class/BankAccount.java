package Online.Variabeles.Class;

public class BankAccount {
    private long number;
    private  double   balance;
    private String name;
    private String email;
    private long phoneNo;
    BankAccount(){
        this(5678,6788,"Ram","ram@gmai.com",346547);
    }
 public BankAccount(long number ,double balance ,String name,String email,long phoneno){

        this.number=number;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phoneNo=phoneno;
 }
    public BankAccount(long phoneno ,String name,String email) {

      this(9999999,1000,name,email,phoneno);

    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public   double  depositFunds( double balance){
       return this.balance= this.balance+balance;
    }
    public    double widrawFunds( double balance){
        if(this.balance<1000)
        {
         return -1;
        }
        else{
            return this.balance=this.balance-balance;
        }
    }
}
