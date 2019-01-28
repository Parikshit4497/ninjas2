package ArrayListAutUnbox;

import java.util.ArrayList;
import java.util.Scanner;
/*In the previous program of grocery list teh user had to enter the index number of the
* the item which we wish to delete or modify which is not a good programming practice*/
public class GroceryList1 {
    private ArrayList <String> groceryList = new ArrayList <>(); /*Array list unlike array does not store values but objects
    int the brackets after array list we store the type of objects:*/

    public ArrayList <String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGrocerList() {
        System.out.println("You have the " + groceryList.size() + " items in your grocery list ");
        int i = 0;
        for (; i < groceryList.size(); ) {
            System.out.println((i + 1) + "." + groceryList.get(i));
            i++;
        }
    }

    public void modifyGroceryList(String currentItem, String newItem) {
        int position=findItem(currentItem);
        if (position>=0)
        {
            modifyGroceryList(position,newItem);
        }
        System.out.println("Grocery item" + (position + 1) + " has been modified:");

    }
    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
    }
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
    public boolean  onFile(String searchItem)
    {   int position=findItem(searchItem);
        if(position>=0)
        { return true; }
        return  false;
    }
}

class MainList1 {
    private static Scanner s = new Scanner(System.in);
    private static GroceryList1 groceryList = new GroceryList1();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            printInstructions();
            System.out.println("Enter your choice ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGrocerList();
                    break;
                case 2:
                    addItem();
                    break;
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
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 1-To print the list of the grocery items: ");
        System.out.println("\t 2 -To add an item to the list.");
        System.out.println("\t 3-To modify an item in the list.:");
        System.out.println("\t 4- To remove an itemList in the list ");
        System.out.println("\t 5-To search for an item list :");
        System.out.println("\t 6 -Quit the application: ");
    }
    public static void addItem() {
        System.out.println("Please enter the groceryItem ");
        groceryList.addGroceryItem(s.nextLine());
    }
    public static void modifyItem() {
        System.out.println("Enter item name :");
        String itemNo = s.nextLine();
        System.out.println("Enter replacement item:");
        String newItem = s.nextLine();
        groceryList.modifyGroceryList(itemNo , newItem);
    }
    public static void removeItem() {
        System.out.println("Enter item name:");
        String itemNo = s.nextLine();
        s.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem() {
        System.out.println("Item to search for :");
        String searchItem = s.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our groceryList ");
        } else {
            System.out.println(searchItem + "is not in the shopping list:");
        }
    }
    public  static void processArrayList()
    {
        ArrayList<String > newArray=new ArrayList <>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray=new ArrayList <>(groceryList.getGroceryList());
        String[] myArray=new String[groceryList.getGroceryList().size()];

    }

}