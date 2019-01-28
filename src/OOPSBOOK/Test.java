package OOPSBOOK;

/**
 * Created by hp on २२-०८-२०१७.
 */
public class Test {
    public void pupAge()
    {
        int age=0;// without initialisation compiler shows error as it is a local variable;
        age=age+7;
        System.out.println("The pup age is :" +age);
    }
    public static void main(String args[])
    {
        Test test=new Test();
        test.pupAge();
    }
}
