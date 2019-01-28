package RevisonComp.Strings;

import java.util.Scanner;

public class WavePatter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0, j = 0;
        int m, n;
        String str1 = "";
        m = s.nextInt();
        n = s.nextInt();
        int arr[][] = new int[ m ][ n ];

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[ i ].length; j++) {
                arr[ i ][ j ] = s.nextInt();
            }
        }
        j = 0;
        i = 0;
        int k=0;
//        while(j<arr[0].length){
//            if(i==0){
//                for(i=0;i<arr.length;i++){
//                    str1+=arr[i][j] +" ";
//                }
//                j++;
//            }else if(i==arr.length){
//
//                for(i=arr.length-1;i>=0;i--){
//                    str1+=arr[i][j]+" ";
//                }
//                j++;
//                i++;
//            }
//
//
//        }

//        for (i = 0, j = 0; i < arr.length && j < arr[ 0 ].length; ) {
//            if (i == 0) {
//                for (i = 0; i < arr.length; i++) {
//                    str1 += arr[ i ][ j ] + " ";
//                }
//                j++;
//            }
//            if (j < arr[ 0 ].length) {
//                if (i == arr.length) {
//                    for (i = arr.length - 1; i >= 0; i--) {
//                        str1 += arr[ i ][ j ] + " ";
//                    }
//                }
//                j++;
//                i++;
//            } else {
//                break;
//            }
//        }
//
//       System.out.println("The wave is " + str1);
        int temp[]=new int[arr.length*arr[0].length];
        while(j<arr[0].length){
            if(i==0){
               for(i=0;i<arr.length;i++){
                   temp[k++]=arr[i][j] ;
              }             j++;
            }else if(i==arr.length){

                for(i=arr.length-1;i>=0;i--){
                    temp[k++]=arr[i][j];
                }
                j++;
                i++;
            }

        }
        for(i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
