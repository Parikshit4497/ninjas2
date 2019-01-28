package OopsPackage;

public class Complex {
    double real;
    double imag;
    Complex()
    {

    }
    Complex(double x,double y)
    {
        real=x;
        imag=y;
    }
    public  void  ComplexSum(Complex c1,Complex c2)
    {
        this.real=c1.real+c2.real;
        this.imag=c1.imag+c2.imag;
    }
    public void display(Complex c)
    {
        System.out.println(c.real+" + j" + c.imag );
    }



}
class ComplexUse
{
    public static void main(String[] args) {


        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(6, 7);
        Complex c3 = new Complex();
         c3.ComplexSum(c1,c2);
         c3.display(c3);
    }
}