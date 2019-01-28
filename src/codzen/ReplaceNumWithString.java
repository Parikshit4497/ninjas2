package codzen;

/**
* Created by hp on २२-०६-२०१७.

public class ReplaceNumWithString {
    public static void main(String[] args) {
        int num ;
        String str1="";
        String str2="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numeber:");
        num=s.nextInt();
        str1=ConvertToString(str2,num);
        System.out.println("The string is:"+ str1);
    }
    public static String ConvertToString(String str2,int num) {
        if(num==0)
        {
            return " ";
        }
        return ConvertToString(num/10)+getNumToString(num%10);

    }
    public static String getNumToString(int num)
    {
         if(num==0)
         {
             return " ";
         }
         else {
             String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
             return arr[ num ];
         }
    }

}*/
