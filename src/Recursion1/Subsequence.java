package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ३०-०६-२०१७.
 */
public class Subsequence {
    public static void main(String[] args) {
        String input;
        int i;
        String output[];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the input");
        input=s.nextLine();
        output=subSequence(input);
        for(i=0;i<output.length;i++)
        {
            System.out.println(output[i]);
        }
    }
    public static String[]  subSequence(String input){

        if(input.length()==0){
            String[] ans = {""};
            return ans;
        }

        String[] smallAns= subSequence(input.substring(1));
        String[] ans = new String[smallAns.length*2];

        for(int i =0;i<smallAns.length;i++){
            ans[i] = smallAns[i];
        }

        for(int i =0;i<smallAns.length;i++){
            ans[i+smallAns.length] = input.charAt(0)+smallAns[i];
        }
        return ans;

    }
}
