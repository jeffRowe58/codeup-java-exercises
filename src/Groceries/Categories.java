package Groceries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;

public class Categories {

    private String cat;
    private String name;
    public ArrayList<Object> food;
    private int quantity;


    public Categories(){
        food = new ArrayList<>();
    }



    public static void main(String[] args) {
        Categories dairy = new Categories();

        Items dairyProduct = new Items("Milk", 2, 2.99);
        dairy.food.add(dairyProduct);

        Items dairyProduct2 = new Items("Cheese", 4, 3.99);
        dairy.food.add(dairyProduct2);

    }
}
