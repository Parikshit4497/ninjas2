package RevisonComp.Strings;

import java.util.Scanner;

public class MinimumLengthWord {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str1="",str2="";
        int Min=9999,i;
        String splitArr[];
        str1=s.nextLine();
        splitArr=str1.split(" ");
        for(i=0;i<splitArr.length;i++){
            if(Min>splitArr[i].length()){
                Min=splitArr[i].length();
                str2=splitArr[i];
            }
        }
        System.out.println("The word with minimum length is " + str2);
    }
}
