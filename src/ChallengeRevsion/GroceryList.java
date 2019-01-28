package ChallengeRevsion;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private ArrayList<String> groceryList=new ArrayList <>();

    public  void addGroceryList(String item)
    {
        groceryList.add(item);
    }
    public boolean removeItem(String item)
    {
        boolean exists=groceryList.contains(item);
        if(exists)
        {
            int position=groceryList.indexOf(item);
            groceryList.remove(position);
            return  true ;
        }
        return  false;
    }
    public String  searchItem(String item)
    {
        boolean exists=groceryList.contains(item);
        if(exists)
        {
            int position=groceryList.indexOf(item);
            return groceryList.get(position);
        }
        return  null;
    }
    public void ModifyList (String currentItem ,String newItem)
    {
        int position =groceryList.indexOf(currentItem);
        groceryList.add(position,newItem);
    }
    public  void printGroceryList()
    {
        System.out.println("The total items in your grocery list are :" + groceryList.size() );

        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println((i+1)+":" +groceryList.get(i));
        }
    }
}
class MainList
{
    private  static Scanner s=new Scanner(System.in);
    private  static GroceryList groceryList=new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice =0;
        while(!quit)
        {

            printMenu();
            System.out.println("Enter the option you wish to choose:");
             choice=s.nextInt();
            switch (choice)
            {
                case 1:
                    addItem();
                    break;
                case 2:
                    modifyItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    searchItem();
                    break;
                case 5:
                    groceryList.printGroceryList();;
                    break;
            }
        }
    }
     public static  void printMenu()
     {
         System.out.println("1:Add item to list\n" +"2:Modify item in the list \n"
                          +"3:Remove item from the list :\n"+"4:Search item rom the list:\n"+"5:Print item in the grocery list");
     }
     public  static  void addItem()
     {
         System.out.println("Enter the item that you wish to add the list :");
         groceryList.addGroceryList(s.next());
     }
     public static void modifyItem()
     {
         System.out.println("Enter the item that you wish to modify :");
         String existingItem=s.next();
         System.out.println("Enter the item you to modify it with :");
         String newItem=s.next();
         groceryList.ModifyList(existingItem,newItem);
     }
     public static  void removeItem()
     {
         System.out.println("Enter the item that you wish to remove :");
         String newItem=s.next();
         if(groceryList.removeItem(newItem))
         {
             System.out.println("The item has been removed :");
         }
         else
         {
             System.out.println("The item that you wish to remove does not exists in the list :");
         }
     }
     public  static  void searchItem()
     {
         System.out.println("Enter the item that you wish to search : ");
         String searchItem=s.next();
         if(groceryList.searchItem(searchItem)!=null)
         {
             System.out.println("The item " + searchItem + "is present in your list:");
         }
         else
         {
             System.out.println("The item that you wish to search is not present in the list ");
         }
     }
}