package OopsPackage.Inheritance.InheritanceRevision;

public class ClassRefDemo {
    public static void main(String[] args) {
        Box13Weight13 subclass=new Box13Weight13(4,5,6,7);
        Box13 superclass=new Box13();
        System.out.println("The volume of the first box is:" + subclass.Volume());
        System.out.println("The volume of the second box is:" + subclass.weight);
        System.out.println();
        superclass=subclass;
        System.out.println("The volume of teh second box is :" + superclass.Volume());
     /*   System.out.println("The weight of teh second box is: " +superclass.weight );*/
     /*a super class object cannot accessed subclass object:*/
    }
}
