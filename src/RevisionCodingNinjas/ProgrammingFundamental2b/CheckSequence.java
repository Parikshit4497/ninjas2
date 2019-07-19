package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public  class CheckSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f1=false, f=true;
        int i = 0;
        int n = 0;
        n = sc.nextInt();
        int arr[] = new int[ n ];

        for (i = 0; i < arr.length; i++) {
            arr[ i ] = sc.nextInt();
        }
       for(i=0;i<arr.length;i++){
            if(f1&&arr[i]<arr[i-1]){
                f=false;
                break;
            }else if(arr[i]<arr[i-1]){
                continue;
            }else{
                f1=true;
            }
       }
        System.out.println(f);
    }
}
