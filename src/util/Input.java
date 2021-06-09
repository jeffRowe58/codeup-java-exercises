package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //getString method

    public String getString() {
//        System.out.println("Please enter your favorite quote");
        return  this.scanner.nextLine();

    }

    //boolean user input method

//    public boolean yesNo() {
//        System.out.println("Please enter either yes or no.");
//        String booYou = scanner.next().toLowerCase(Locale.ROOT);
//        return booYou.startsWith("y");
//    }

    //user min max
    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userIn = scanner.nextInt();
        if (userIn >= min && userIn <= max) {
            return userIn;
        } else {
            System.out.println("That number is invalid");
            return getInt(min, max);
        }

    }

    //user getInt
    @SuppressWarnings("all")
    public int getInt() {
        System.out.println("Please enter a number.");
        try{
           return Integer.valueOf(getString());
        }catch(NumberFormatException nfe){
            System.out.println("That's not a number!");
            return getInt();
        }
    }


    //user double min max

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f: ", min, max);
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("That number is invalid");
            return getDouble(min, max);
        }
    }


    //user getDouble
    @SuppressWarnings("all")
    public double getDouble() {
        System.out.println("Please enter a number with decimal.");
        try{
            return Double.valueOf(getString());
        }catch(NumberFormatException nfe){
            System.out.println("That's not a number!");
            return getDouble();
        }
    }


}
