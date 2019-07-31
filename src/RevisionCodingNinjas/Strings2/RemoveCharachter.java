package RevisionCodingNinjas.Strings2;

import java.util.Scanner;

public class RemoveCharachter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        String string1="";
        String output="";
        char ch = 0;
        string1=sc.nextLine();
        ch=sc.nextLine().charAt(0);
        for(i=0;i<string1.length();){
            if(string1.charAt(i)==ch){
                i++;
            }else{
                output+=string1.charAt(i);
                i++;
            }
        }
        System.out.println("Output " +output);
        sc.close();
    }
}
