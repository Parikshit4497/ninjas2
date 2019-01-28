package ArrayListAutUnbox;

import java.util.ArrayList;
import java.util.Scanner;

public class GrocerListPrac {
    ArrayList<String> GroceryListPrac=new ArrayList <>();
    public void addGroceryList(String item)
    {
        GroceryListPrac.add(item);
    }
    public void printGroceryList()
    {
        int i=0;
        System.out.println("The grocery list size is:" +GroceryListPrac.size()+" items in your grocery list are:");
        for(i=0;i<GroceryListPrac.size();i++)
        {

            System.out.println(i+1+"."+GroceryListPrac.get(i));
        }
    }
    public  void modifyGrpoceryList(int position,String newItem)
    {
        GroceryListPrac.add(position,newItem);
        System.out.println("The item at position " + (position+1)+"has been changed and teh item after change is:" +GroceryListPrac.get(position));
    }
    public   void  removeGrocery(int position)
    {
        String item=GroceryListPrac.get(position);
        GroceryListPrac.remove(position);
    }
    public  String searchItem(String searchItem)
    {
        boolean exits=GroceryListPrac.contains(searchItem);
        if(exits)
        {
            int position=GroceryListPrac.indexOf(searchItem);
            return GroceryListPrac.get(position);
        }
        return  null;
    }
}
class MainListPrac
{
    private static Scanner s1=new Scanner(System.in);
    private static  GrocerListPrac groceryListPrac=new GrocerListPrac();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        Scanner s=new Scanner(System.in);
        while(!quit)
        {
            printInstructions();
            System.out.println("Enter the option you wish to choose :");
             choice=s.nextInt();
            switch (choice)
            {
                case 1:
                   groceryListPrac.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyList();
                    break;
                case 4:
                    searchList();
                    break;
                case 5:
                    removeList();
                    break;
                case 6:
                    System.exit(0);

            }

        }
    }
    public static  void printInstructions()
    {
        System.out.println("\t 1.Print the items in the groceryList: ");
        System.out.println("\t 2. Add items to the list :");
        System.out.println("\t 3. Modify items in the list :");
        System.out.println("\t 4. Search items in the list : ");
        System.out.println("\t 5. To remove an item from the list : ");
        System.out.println("\t 6. Quit teh interface :");
    }

    public static  void addItem()
    {
        System.out.println("Enter the item that you wish to add to the grocery list :");
        groceryListPrac.addGroceryList(s1.nextLine());
    }
    public  static  void modifyList()
    {
        System.out.println("Enter the itemNo you wish to modify ");
        int itemNo=s1.nextInt();
        s1.nextLine();
        System.out.println("Enter the new item :");
        String newItem=s1.nextLine();
        groceryListPrac.modifyGrpoceryList(itemNo-1,newItem);
    }
    public static  void removeList()
    {
        System.out.println("Enter the item that you wish to remove :");
        int itemNo=s1.nextInt();
        s1.nextLine();
        groceryListPrac.removeGrocery(itemNo);
    }
    public static void searchList()
    {
        System.out.println("Enter the item that you wish to search for :");
        String searchItem=s1.nextLine();
        if(groceryListPrac.searchItem(searchItem)!=null)
        {
            System.out.println("The item is present in your list: " +searchItem);
        }
        else
        {
            System.out.println("The item that you are looking for does not exits in the list: ");
        }

    }

}
