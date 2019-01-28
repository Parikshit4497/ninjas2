package RevisonComp.Strings;

import java.util.Scanner;

public class SumOfRowAndColumn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j;
        int m,n;
        m=s.nextInt();
        n=s.nextInt();
        int arr[][]=new int[m][n];
        int sumRow[]=new int[m];
        int sumColumn[]=new int[n];
        int maxRow=-9999;
        int maxColumn=-9999;
        int rowIndex=0;
        int columnindex=0;
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                sumRow[i]=sumRow[i]+arr[i][j];

                sumColumn[j]=sumColumn[j]+arr[i][j];
            }
            if(maxRow<sumRow[i]){
                maxRow=sumRow[i];
                rowIndex=i;
            }
        }

        for(i=0;i<sumColumn.length;i++){
            if(maxColumn<sumColumn[i]){
                maxColumn=sumColumn[i];
                columnindex=i;
            }
        }
        if(maxRow>maxColumn){
            System.out.println("row "+rowIndex+" sum of row "+ maxRow);
        }else{
            System.out.println("column" + columnindex +" sum of column " + maxColumn);
        }
    }

}
