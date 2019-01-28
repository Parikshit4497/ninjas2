package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ३०-०६-२०१७.
 */
public class keypadProblem {
    public static void main(String[] args) {
        int num =0;
        int i=0;
        String output[];
        Scanner s=new Scanner(System.in);
        System.out.println("Entethe the number:");
        num=s.nextInt();
        output=keyPad(num);
        for(i=0;i<output.length;i++)
        {
            System.out.println(output[i]);
        }

    } public static String[] keyPad(int num){


        if(num==0){
            String[] result = {""};
//            String[] result1 = new String[0];
//            result1[0] = "";
            return result;
        }
        String[] smallAns= keyPad(num/10);

        String keys = getNumKeyToString(num%10);
        if(keys.length()==0){
            return smallAns;
        }

        String[] ans = new String[smallAns.length*keys.length()];

        int k =0;
        for(int i =0;i<keys.length();i++){
            for(int j =0;j<smallAns.length;j++){
                ans[k++]= smallAns[j]+keys.charAt(i);
            }
        }

        return ans;
    }
    public static String getNumKeyToString(int num){

        String[] arr = {" ","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        return arr[num];
    }
}
