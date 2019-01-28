package challenge;

public class PrinterMian {
    public static void main(String[] args) {
        Toner tonernew=new Toner("red","green","blue","black",70);
        Printer newPrinter=new Printer(50,false,tonernew);
        newPrinter.getToner().Addcolour(30);
        newPrinter.getToner().currentStatus();
        newPrinter.NumberOfpagesprinted(30);
        System.out.println("Is the printer duplex:"+ newPrinter.isDuplex());
    }
}
