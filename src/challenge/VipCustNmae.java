package challenge;

public class VipCustNmae {
    public static void main(String[] args) {
        VipCustName v1=new VipCustName();
        System.out.println(v1.getEmailAdrress());
        VipCustName v2=new VipCustName("Bob",25000.00);
        System.out.println(v2.getName());
        VipCustName v3=new VipCustName("bim",100.00,"tim@gmail.com");
        System.out.println(v3.getName());
    }
}
