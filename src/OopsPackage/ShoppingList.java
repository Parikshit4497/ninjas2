package OopsPackage;

import java.util.Scanner;

public class ShoppingList {
    private int itemcode[] = new int[ 10 ];
   private int itemprice[] = new int[ 10 ];
 private    int count = 0;
 private String productName[]= new String[ 10 ];
 private  int count2=0;
 private  int count3=0;
    Scanner s =new Scanner(System.in);
    public void getData(int itemcd, int itempr,String name) {
        if (count == itemcode.length&&count2==itemprice.length) {
            itemcode = new int[ itemcode.length * 2 ];
            itemprice=new int[itemprice.length*2];
            productName=new String[productName.length*2];
        } else {
            itemcode[ count++ ] = itemcd;
            itemprice[ count2++ ] = itempr;
            productName[count3++]=name;
        }

    }

    public void displayData() {
        for (int i = 0; i < count; i++) {
            System.out.println("The item code is:" + itemcode[ i ]);
            System.out.println("The item price is:" + itemprice[ i ]);
            System.out.println("The name of the product is:"+ productName[i]);

        }
        System.out.println(" ");
    }

    public void displaySum() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + itemprice[ i ];
        }System.out.println(" ");
        System.out.println("The net total of the items purchased is:" + sum);

    }
    public void removeItem()
    {
        System.out.println("Enter the item code :");
        int a=s.nextInt();
        for(int i=0;i<count;i++) {
            if (itemcode[ i ] == a) {
                for (int l = i; l < count - 1; l++) {
                    itemprice[ l ] = itemprice[ l + 1 ];
                    itemcode[ l ] = itemcode[ l + 1 ];
                    productName[l]=productName[l+1];
                }
            }
        }
               count=count-1;
        count2=count;
        count3=count;


    }

}
class ShoppingListUse
{

    public static void main(String[] args) {
        Scanner s2=new Scanner(System.in);
       ShoppingList s1=new ShoppingList();

        while(1<2)
        {
            System.out.println("1:Add an item :");
            System.out.println("2: Remove an item:");
            System.out.println("3:Find the sum total ");
            System.out.println("4:Display the items:");
            System.out.println("5:Exit:");
            System.out.println("Enter the option that you wish to choose:");
            int x=s2.nextInt();
            switch (x)
            {
                case 1:
                    System.out.println("Enter the item code:");
                    int code=s2.nextInt();
                    System.out.println("Enter the item price:");
                    int price=s2.nextInt();
                    System.out.println("Enter the name of the product:");
                    String name=s2.next();
                    s1.getData(code,price,name);
                    break;
                case 2:
                    s1.removeItem();
                    break;
                case 3:
                    s1.displaySum();
                    break;
                case 4:
                    s1.displayData();
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}