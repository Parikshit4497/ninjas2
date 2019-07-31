package RevisionCodingNinjas.String;

import java.util.Scanner;

public class MinimumLengthOfWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String splitArray[];
        String input;
        int i=0,j=0,count=0,MIN=Integer.MAX_VALUE;
        String countStr="";
        input=sc.nextLine();

        splitArray=input.split(" ");
        for(i=0;i<splitArray.length;i++){
            if(MIN>splitArray[i].length()){
                MIN=splitArray.length;
                countStr=splitArray[i];
            }
        }
        System.out.println((MIN-2)+" "+countStr);
    }
}
