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
        System.out.println("Please enter your favorite quote");
        String qoute = scanner.nextLine();
        return qoute;
    }

    //boolean user input method

    public boolean yesNo() {
        System.out.println("Please enter either yes or no.");
        String booYou = scanner.next().toLowerCase(Locale.ROOT);
        if (booYou.startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    //user min max
    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userIn = scanner.nextInt();
        if (userIn > max || userIn < min) {
            System.out.println("Please try again.");
            getInt(min, max);
        } else {
            System.out.printf("Good job following directions. Your number was %d, which is in between %d and %d.", userIn, min, max);
        }
        return userIn;
    }

    //user getInt

    public int getInt() {
        System.out.println("Please enter a number.");
        int num = scanner.nextInt();
        return num;
    }

    //user double min max

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f: ", min, max);
        double userInput = scanner.nextDouble();
        if (userInput > max || userInput < min) {
            System.out.println("Please try again.");
            return getDouble(min, max);
        } else {
            System.out.printf("Good job following directions. Your number was %f, which is in between %f and %f.", userInput, min, max);
            return userInput;
        }
    }

    //user getDouble

    public double getDouble() {
        System.out.println("Please enter a double");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }


}
