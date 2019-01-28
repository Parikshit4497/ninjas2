package RevisonComp.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="";
        String str2="";
        int i=0,j=0;
        str1=s.next();

        str2=s.next();
        char string1Arr[];
        char string2Arr[];
        boolean result=false;
        string1Arr=str1.toCharArray();
        string2Arr=str2.toCharArray();
        Arrays.sort(string1Arr);
        Arrays.sort(string2Arr);
        if(string1Arr.length==string2Arr.length){
            for(i=0,j=0;i<string1Arr.length&&j<string2Arr.length;i++,j++){
                if (string1Arr[i]==string2Arr[j]){
                    result=true;
                }else{
                    result=false;
                }
            }
        }else{
            result=false;
        }
        System.out.println("The the second string is permutation of the first " + result);
    }
}
