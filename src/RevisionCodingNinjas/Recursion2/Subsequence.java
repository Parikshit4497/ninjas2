package RevisionCodingNinjas.Recursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static ArrayList <String> getSubSequence(String str1){
        if(str1.length()==0){
            ArrayList<String> br=new ArrayList <>();
             br.add(" ");
             return br;
        }
        char ch=str1.charAt(0);
        String ros=str1.substring(1);
        ArrayList<String> smallResult=getSubSequence(ros);
        ArrayList<String> mr =new ArrayList <>();
        for(String rstr:smallResult){
            mr.add(rstr);
            mr.add(ch+rstr);
        }
       return mr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        ArrayList<String> subsequen=new ArrayList <>();
        String str1=sc.nextLine();
        subsequen=getSubSequence(str1);
        for(int i=0;i<subsequen.size();i++){
            System.out.print(subsequen.get(i) + " ");
        }
    }
}
