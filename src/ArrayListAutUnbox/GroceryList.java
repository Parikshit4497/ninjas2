package ArrayListAutUnbox;


import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private ArrayList<String> groceryList=new ArrayList <>(); /*Array list unlike array does not store values but objects
    int the brackets after array list we store the type of objects:*/
    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }
    public  void printGrocerList()
    {
        System.out.println("You have the " +groceryList.size()+" items in your grocery list ");
        int i=0;
        for(;i<groceryList.size();)
        {
            System.out.println((i+1)+"."+groceryList.get(i));
            i++;
        }
    }
    public void modifyGroceryList(int position,String newItem)
    {
        groceryList.set(position,newItem);
        System.out.println("Grocery item" + (position+1) +" has been modified:");
    }
    public void removeGroceryItem(int position )
    {
        String theItem =groceryList.get(position);
        groceryList.remove(position);
    }

    public String   findItem(String searchItem)
    {
        boolean exists=groceryList.contains(searchItem);
        if(exists)
        {
            int position=groceryList.indexOf(searchItem);
            return  groceryList.get(position);
        }
        return  null;
    }

}
class MainList
{

    private static Scanner s=new Scanner(System.in);
    private  static  GroceryList groceryList=new GroceryList();
    public static void main(String[] args) {

        boolean quit =false;
        int choice =0;

        while(!quit)
        {
            printInstructions();
            System.out.println("Enter your choice ");
            choice =s.nextInt();
            s.nextLine();
            switch(choice)
            {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGrocerList();
                    break;
                case  2:
                    addItem();
                    break ;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;

            }

        }
    }
    public static  void printInstructions()
    {
        System.out.println("\nPress");
        System.out.println("\t 1-To print the list of the grocery items: ");
        System.out.println("\t 2 -To add an item to the list.");
        System.out.println("\t 3-To modify an item in the list.:");
        System.out.println("\t 4- To remove an itemList in the list ");
        System.out.println("\t 5-To search for an item list :");
        System.out.println("\t 6 -Quit the application: ");
    }
    public static void addItem()
    {
        System.out.println("Please enter the groceryItem ");
        groceryList.addGroceryItem(s.nextLine());
    }
    public static void modifyItem()
    {
        System.out.println("Enter item number :");
        int itemNo=s.nextInt();
        s.nextLine();
        System.out.println("Enter replacement item:");
        String newItem =s.nextLine();
        groceryList.modifyGroceryList(itemNo-1,newItem);

    }
    public static void removeItem()
    {
        System.out.println("Enter item number ");
        int itemNo=s.nextInt();
        s.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }
    public  static void searchForItem() {
        System.out.println("Item to search for :");
        String searchItem = s.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our groceryList ");
        } else
        {
            System.out.println(searchItem+ "is not in the shopping list:");
        }
    }

}