package RevisonComp.Arraylist;
import java.util.ArrayList;

public class ArrayListDemo {
    private static ArrayList <String> arrayListDemo = new ArrayList <String>();

    public void addGroceryListItem(String item) {
        arrayListDemo.add(item);
    }

    public  ArrayList <String> getArrayListDemo() {
        return arrayListDemo;
    }


    public void printGroceryList() {
        System.out.println("You have " + arrayListDemo.size() + "Items in your grocery list ");
        for (int i = 0; i < arrayListDemo.size(); i++) {
            System.out.println((i + 1) + " ." + arrayListDemo.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItems(position, newItem);
        }
    }

    private void modifyGroceryItems(int positions, String newItem) {
        arrayListDemo.set(positions, newItem);
        System.out.println("Grocery item" + (positions + 1) + "Has been modified");
    }

    private void removeGroceryItems(int positions) {
        String item = arrayListDemo.get(positions);
        arrayListDemo.remove(positions);
        System.out.println(item);
    }

    public void removeGroceryItems(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItems(position);
        }
    }

    ////    public String findItem(String serachItem){
//      boolean exists=groceryList.contains(serachItem);
//      int position=arrayListDemo.indexOf(serachItem);
//        if(position>=0){
//            return arrayListDemo.get(position);
//        }
//        return null;
//    }
//
    private int findItem(String searchItem) {
        return arrayListDemo.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }


}