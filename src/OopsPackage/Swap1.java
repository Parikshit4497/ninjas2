package OopsPackage;

 class Swap1 {
    int value1;
    public void getData(int a)
    {
        value1=a;
    }
    public  void displayData()
    {
        System.out.println("The value of the first number is:" +value1);
    }
}
class Swap2
{
   int value2;
   public  void getData2(int b)
   {
     value2=b;
   }
   public  void  displayData2()
   {
       System.out.println("The value of the second number is:" + value2);
   }

}
class Exchange
{
    public void exchangeData(Swap1 s1,Swap2 s2)
    {
        int temp=s1.value1;
        s1.value1=s2.value2;
        s2.value2=temp;
    }
}
class SwapUse
{
    public static void main(String[] args) {
        Swap1 s1=new Swap1();
        s1.getData(5);
        s1.displayData();
        Swap2 s2=new Swap2();
        s2.getData2(7);
        s2.displayData2();
        Exchange e1=new Exchange();
        e1.exchangeData(s1,s2);
        s1.displayData();
        s2.displayData2();
    }
}