package ArrayListAutUnbox;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListImprovePrac {
    ArrayList<String> GroceryListImprovPrac=new ArrayList <>();
    public void AddGroceryList(String newItem)
    {
        GroceryListImprovPrac.add(newItem);
    }
    public void printGroceryList()
    {
        int i=0;
        System.out.println("The size of the grocer list is :" +GroceryListImprovPrac.size()+"the items present in the list are:");
        for(i=0;i<GroceryListImprovPrac.size();i++)
        {
            System.out.println((i+1)+"."+GroceryListImprovPrac.get(i));
        }
    }
    public void ModifyGroceryListPrac(String currentItem,String newItem)
    {
        int position=findItem(currentItem);
        if(position>=0)
        {
            ModifyGroceryListPrac(position,newItem);
        }
        System.out.println("Grocery item" +(position+1)+"has been modified");
    }
    private void ModifyGroceryListPrac(int position,String newItem)
    {
     GroceryListImprovPrac.set(position,newItem);
    }
    private int  findItem(String newItem)
    {
        return GroceryListImprovPrac.indexOf(newItem);
    }
    public  void RemoveItemsFromGroceryList(String newItem)
    {
        int position=findItem(newItem);
        if(position>=0) {
            RemoveItemsFromGroceryList(position);
        }
    }
    public void RemoveItemsFromGroceryList(int position)
    {
        GroceryListImprovPrac.remove(position);
    }
    public  boolean OnFile(String searchItem)
    {
        int position=findItem(searchItem);
        if(position>=0)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }

}
class MainListPractisce
{
    private  static Scanner s2= new Scanner(System.in);
    private  static  GroceryListImprovePrac groceryListImprovePrac=new GroceryListImprovePrac();

    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        while (!quit)
        {
            printInstructionPrac();
            System.out.println("Enter the choice:");
            choice=s2.nextInt();
            switch(choice)
            {
                case 1:
                    groceryListImprovePrac.printGroceryList();
                    break;
                case 2:
                    addItemGroceryList();
                    break ;
                case 3:
                    modifyGroceryItem();
                    break;
                case 4:
                    RemoveGroceryItem();
                    break;
                case 5:
                    SearchGroceryItem();
                    break;
                case 6:
                    System.exit(0);

            }
        }
    }
    public static  void printInstructionPrac()
    {
        System.out.println("\t 1.Print GroceryList. ");
        System.out.println("\t 2. Add item to the list.");
        System.out.println("\t 3. Remove items frm the list.");
        System.out.println("\t 4. Modify items from the list.");
        System.out.println("\t 5. Search item in the list.");
        System.out.println("\t 6. Quit list ");
    }
    public static  void addItemGroceryList()
    {
        System.out.println("Enter the item that you wish to add to the GroceryList :");
        groceryListImprovePrac.AddGroceryList(s2.nextLine());
    }
    public static void modifyGroceryItem()
    {
        System.out.println("Enter the item that you wish to change :");
        String currentItem =s2.nextLine();
        System.out.println("Enter the item with you wish to change :");
        String changedItem=s2.nextLine();
        groceryListImprovePrac.ModifyGroceryListPrac(currentItem,changedItem);
    }
    public  static  void  RemoveGroceryItem()
    {
        System.out.println("Enter the item that you wish to remove:");
        String newItem=s2.nextLine();
        groceryListImprovePrac.RemoveItemsFromGroceryList(newItem);
    }
    public static void SearchGroceryItem()
    {
        System.out.println("Enter the item you wish to search :");
        String searchItem=s2.nextLine();
       if( groceryListImprovePrac.OnFile(searchItem))
        {
            System.out.println("The item " + searchItem+ "is present in the list :");
        }
        else
        {
            System.out.println("The item " + searchItem+" is not present in the list :");
        }
    }

}
