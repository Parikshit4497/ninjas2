package RevisionCodingNinjas.Recursion2;

import java.util.Scanner;

public class checkAb {
    public static boolean checkABSeq(String str1){
        if(str1.length()==0){
            return true;
        }
        if(str1.charAt(0)=='a'){
            if(str1.length()==1){
                return true;
            }else if(str1.length()>=2&&str1.substring(1,3).equals("bb")){
                return checkABSeq(str1.substring(3));
            }else if(str1.charAt(1)=='a'){
                return  checkABSeq(str1.substring(1));

            }
        }else{
            return  false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();

        System.out.println("The sequence is correct " +checkABSeq(str1));
        sc.close();
    }
}
