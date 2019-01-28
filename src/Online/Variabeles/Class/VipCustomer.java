package Online.Variabeles.Class;

public class VipCustomer {
    private String name;
    private long credit_limit;
    private String emailAdress;
    VipCustomer(){
        this("defaultvalue","defaultname",3414);
    }
    VipCustomer(String emailAdress,String name){
       this(emailAdress,name,000000);
    }
    VipCustomer(String emailAdress,String name,long credit_limit)
    {
        this.credit_limit=credit_limit;
        this.name=name;
        this.emailAdress=emailAdress;
    }

    public long getCredit_limit() {
        return credit_limit;
    }

    public String getEmailAdress() {
        return emailAdress;

    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
       VipCustomer v1=new VipCustomer();
       VipCustomer v2=new VipCustomer("ram@gmail.com","ram");
       VipCustomer v3=new VipCustomer("ram@gmail.com","ram",35454);
        System.out.println("The name of first customer" + v1.getName());
        System.out.println("The email address of second customer"+ v1.getEmailAdress());
        System.out.println("The credit limit of third customer  " + v1.getCredit_limit() );
        System.out.println("The name of first customer" +v2.getName());
        System.out.println("The email address of second customer"+ v2.getEmailAdress());
        System.out.println("The credit limit of third customer  " + v2.getCredit_limit() );
        System.out.println("The name of first customer"+v3.getName());
        System.out.println("The email address of second customer"+ v3.getEmailAdress());
        System.out.println("The credit limit of third customer  " + v3.getCredit_limit() );
    }
}
