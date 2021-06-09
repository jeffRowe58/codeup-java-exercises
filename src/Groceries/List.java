package Groceries;

import java.util.HashMap;

public class List {
    public static void main(String[] args) {
        HashMap<Integer, Categories > list = new HashMap<>();
        System.out.println("Please choose a category.");
        String[] categories = {"Dairy", "Bake Goods", "Produce", "Meat", "Beverages", "Canned Goods"};
        for(int j = 0, k = 1; j < categories.length; j++, k++){
            System.out.print(k + ") " + categories[j] +"\n");
        }

        Categories dairy = new Categories();
        Items dairystuff = new Items("Milk", 2, 2.99);
        dairy.food.add(dairystuff);
        Items dairystuff2 = new Items("Cheese", 4, 4.99);
        dairy.food.add(dairystuff2);
    }
}
