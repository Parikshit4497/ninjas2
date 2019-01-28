package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ३०-०६-२०१७.
 */
public class AllPermutations {
    public static void main(String[] args) {
        String input;
        int i;
        String output[];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the input");
        input=s.nextLine();
                output=permutation(input);
        for(i=0;i<output.length;i++)
        {
            System.out.println(output[i]);
        }
    }
    public static  String[] permutation(String input){

        if(input.length()==0){
            String[] ans = {""};
            return ans;
        }
        String[] smallAns =  permutation(input.substring(1));

        String[] ans = new String[smallAns.length*(smallAns[0].length()+1)];

        int k =0;
        for(int i =0;i<smallAns.length;i++){
            String word = smallAns[i];

            for(int j =0;j<=word.length();j++){
                char ch = input.charAt(0);
                ans[k++] = word.substring(0,j)+ch+word.substring(j);
            }
        }
        return ans;
    }
}
