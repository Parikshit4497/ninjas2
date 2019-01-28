package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0,m=0,i=0,j=0;
        n=s.nextInt();

        int arr1[]=new int[n];

        for(i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        m=s.nextInt();
        Arrays.sort(arr1);
        for(i=0,j=arr1.length-1;i< arr1.length-1&&j>=0;){

            if(arr1[i]+arr1[j]==m){

                System.out.println(arr1[i]+" "+arr1[j]);
                i++;
                j--;
                continue;
            }else if(arr1[i]+arr1[j]<m){
                i++;
                continue;
            }else if (arr1[i]+arr1[j]>m){
                j--;
                continue;
            }else if(i==j){
                break;
            }
        }
        s.close();
    }
}
