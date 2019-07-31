package RevisionCodingNinjas.Strings2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="";
        char inputArray[];
        char permutArray[];
        boolean result=false;
        String permutation="";
        input=sc.nextLine();
        permutation=sc.nextLine();
        inputArray=input.toCharArray();
        permutArray=permutation.toCharArray();
        Arrays.sort(inputArray);
        Arrays.sort(permutArray);
        if(inputArray.length==permutArray.length){
            for(int i=0;i< inputArray.length;i++){
                if(inputArray[i]==permutArray[i]){
                    result=true;
                }else{
                    result=false;
                }
            }
        }else{
            result=false;
        }

        System.out.println("The string 2 is permutation of " + result);
        sc.close();
    }
}
