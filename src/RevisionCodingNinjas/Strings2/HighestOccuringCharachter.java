package RevisionCodingNinjas.Strings2;

import java.util.Scanner;

public class HighestOccuringCharachter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="";
        int i=0,MAX=Integer.MIN_VALUE;
        int arr[]=new int[256];
        char ch=0;
        input=sc.nextLine();
        for(i=0;i<input.length();i++){
            arr[input.charAt(i)]++;
        }
        for(i=0;i<input.length();i++){
            if(arr[input.charAt(i)]>MAX){
                MAX=arr[input.charAt(i)];
                ch=input.charAt(i);
            }
        }
        System.out.println("MAX" + MAX + " "+ch);
        sc.close();
    }
}
