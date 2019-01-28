package Array1;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] result,num1,num2;
        int n=0,m=0;
        int i=0,j=0,k=0;
        int a=0,p=0,c=0;

        n=s.nextInt();
        num1=new int[n];
        for(i=0;i<num1.length;i++){
            num1[i]=s.nextInt();
        }
        m=s.nextInt();
        num2=new int[m];
        for(i=0;i<num2.length;i++){
            num2[i]=s.nextInt();
        }
        if(num1.length<num2.length){
            result=new int[num2.length+1];
        }else{
            result=new int[num1.length+1];
        }
        k= result.length-1;
        for(i=num1.length-1,j=num2.length-1;i>=0&&j>=0;i--,j--){
            a=num1[i]+num2[j]+c;
            p=a%10;
            c=a/10;
            result[k]=p;
            k--;
        }if(i==j){
            result[k--]=c;
        }
        else if(j==-1){
            while(i>=0) {
                a = num1[ i ] + c;
                p = a % 10;
                c = a / 10;
                result[ k ] = p;
                k--;
                i--;
            }
        }else if(i==-1){
            while(j>=0) {
                a = num2[ j-- ] + c;
                p = a % 10;
                c = a / 10;
                result[ k ] = p;
                k--;
                j--;
            }
        }
        for(i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        s.close();
    }
}
