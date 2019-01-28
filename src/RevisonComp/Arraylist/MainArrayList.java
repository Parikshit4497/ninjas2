package RevisonComp.Arraylist;

import ArrayListAutUnbox.Array;
import ChallengeRevsion.GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    private static Scanner scanner=new Scanner(System.in);
    private static ArrayListDemo arrayListDemo=new ArrayListDemo();

    public static void main(String[] args) {
              boolean quit=false;
              int choice=0;
              printInstruction();
              while(!quit){
                  System.out.println("Enter your choices");
                  choice=scanner.nextInt();
                  scanner.nextLine();
                  switch(choice){
                      case 1:
                          printInstruction();
                          break;
                      case 2:
                         arrayListDemo.printGroceryList();
                          break;
                      case 3:
                          addItem();
                          break;
                      case 4:
                          modifyItemsinTheList();
                      case 5:
                          removeItem();
                          break;
                      case 6:
                          searchForItem();
                          break;
                      case 7:
                          processArrayList();
                          break;
                      case 8:
                          System.exit(0);
                          break;


                  }
              }
    }
    public static void printInstruction(){
        System.out.println("\n Press");
        System.out.println("\t 1:To  print choice options");
        System.out.println("\t 2:To print the list of grocery items");
        System.out.println("\n 3:To add an item to the list ");
        System.out.println("\n 4:To modify the item in the list ");
        System.out.println("\n 5: To remove an from the list ");
        System.out.println("\n 6: To search for an item in the list ");
        System.out.println("\n 7:To quit an application");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item :");
        arrayListDemo.addGroceryListItem(scanner.nextLine());
    }
    public static void  modifyItemsinTheList (){
        System.out.println("Enter the name of the item that you wish to modify ");
        String ExistingItem=scanner.nextLine();
        System.out.println("Enter the name of the item you wish to remove");
        String newItem=scanner.nextLine();
        arrayListDemo.modifyGroceryItem(ExistingItem,newItem);
    }
    public static  void removeItem(){
        System.out.println("Enter the name of the item yu wish to remove :");
        String name=scanner.nextLine();
        arrayListDemo.removeGroceryItems(name);
    }
    public static  void searchForItem(){
        System.out.println("Enter the name of the item you wish to search :");
        String name=scanner.nextLine();
       if(arrayListDemo.onFile(name)){
           System.out.println("Found " +name +" in our grocery list");
       }else{
           System.out.println(name +"is not in the shopping list ");
       }

    }

    public static void processArrayList() {
        ArrayList <String> newArray = new ArrayList <String>();
        newArray.addAll(arrayListDemo.getArrayListDemo());
     /*   ArrayList<String> newArray1=new ArrayList <String>(newArray.addAll(arrayListDemo.getArrayListDemo()));*/
        String[] myArray=new String[arrayListDemo.getArrayListDemo().size()];
        myArray= arrayListDemo.getArrayListDemo().toArray(myArray);
    }


}
