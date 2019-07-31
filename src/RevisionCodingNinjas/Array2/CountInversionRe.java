package RevisionCodingNinjas.Array2;

import java.util.Scanner;

public class CountInversionRe {
    long solve(int[] arr,int n) {
        int i = 0, j = 0, count = 0;
        for (i = 0, j = arr.length - 1; i <= j; ) {
            if (arr[ i ] > arr[ j ] && i != j) {
                count++;
                j--;
            } else if(arr[i]<arr[j]&&i!=j){
                j--;
            }else{
                j=arr.length-1;
                i++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CountInversionRe re=new CountInversionRe();
        int n=0,i=0;

        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Result count"+ re.solve(arr,n));
        sc.close();
    }
}
