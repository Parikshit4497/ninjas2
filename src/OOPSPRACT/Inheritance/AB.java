package OOPSPRACT.Inheritance;

interface AB {
    void A();
    void B();
    void C();
    void D();
}
abstract class M implements AB{
    public void C(){
        System.out.println("C has been implemented in abstract class M");
    }
}
class Bc extends M{

    public void B(){
        System.out.println("B has been implemented in class Bc");
    }
    public void A(){
        System.out.println("A has been implemented in class Bc");
    }
    public void  D(){
        System.out.println("D has been implemented in class Bc");
    }
}
class Bhhhe{
    public static void main(String[] args) {
        Bc bc =new Bc();
        bc.A();
        bc.B();
        bc.D();
        bc.C();
    }
}