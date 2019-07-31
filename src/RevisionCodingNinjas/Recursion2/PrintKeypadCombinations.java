package RevisionCodingNinjas.Recursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintKeypadCombinations {
    static String codes[]={".","abc","def","ghi","jkl","mno","pqr","st","uvwx","yz"};

     public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> br=new ArrayList <>();
            br.add(" ");
            return br;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rr=getKPC(ros);
        ArrayList<String> mr=new ArrayList <>();
        for(String rsts:rr){
            String code=codes[ch-'0'];
            for(int i=0;i<code.length();i++){
                char chcode=code.charAt(i);
                mr.add(rsts+chcode);
            }
        }
        return mr;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> result=getKPC(str);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
}
