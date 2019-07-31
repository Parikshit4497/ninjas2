package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class ArrayEqlibriumIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumLeft=0,sumRight=0,i=0,j=0;
        int n=0,pos=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++) {
            arr[ i ] = sc.nextInt();
        }
//           for(i=0;i<arr.length;i++){
//            sumRight+=arr[i];
//           }
//           for(i=0;i<arr.length;i++){
//               sumRight=-arr[i];
//               if(sumLeft==sumRight)
//                   pos=i;
//               sumLeft+=arr[i];
//           }
        System.out.println("Position is "+ pos);
        sc.close();
    }
}
