package RevisionCodingNinjas.String;

import sun.swing.MenuItemLayoutHelper;

import java.util.Scanner;

public class SumOfRowAndColumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,i=0,j=0,m=0,MaxRow=Integer.MIN_VALUE,MaxColumn=Integer.MIN_VALUE,rowIndex=0,colIndex=0;
        System.out.println("Enter the number of rows ");
        n=sc.nextInt();
        int sumOfRow[]=new int[n];
        System.out.println("Enter the number of columns");
        m=sc.nextInt();
        int sumOfCol[]=new int[m];
        int arr[][]=new int[n][m];
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                sumOfRow[i]+=arr[i][j];
                sumOfCol[j]+=arr[i][j];
            }
            if(sumOfRow[i]>MaxRow){
                MaxRow=sumOfRow[i];
                rowIndex=i;
            }
        }
        for(j=0;j<sumOfCol.length;j++){
            if(MaxColumn<sumOfCol[i]){
                MaxColumn=sumOfCol[i];
                colIndex=j;
            }
        }
        if(MaxRow>MaxColumn){
            System.out.print("ColumnIndex" +rowIndex+" "+MaxRow );

        }else{
            System.out.print("ColumnIndex" +colIndex+" "+MaxColumn );
        }
        sc.close();
    }
}
