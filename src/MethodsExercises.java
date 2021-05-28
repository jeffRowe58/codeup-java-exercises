import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {
    //addition
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    //subtraction
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    //multiplication
    public static int mulitplication(int num1, int num2) {
        return num1 * num2;
    }

    //division
    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    //modulus
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //multiply without *
    public static int multi2(int num, int factor) {
        int sum = 0;
        for (int i = 1; i <= factor; i++) {
            if (i == 1) {
                sum = num + num;
            } else {
                sum = sum + num;
            }
        }
        return sum;
    }

    //multiply recursion
    public static int recursionMult(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 == 1) {
            return num1;
        } else {
            return num2 + (recursionMult(num1 - 1, num2));
        }
    }

    // recursion in between
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int userIn = scanner.nextInt();
//        if (userIn > max || userIn < min) {
//            System.out.println("Please try again.");
//            return getInteger(min, max);
//        } else {
//            System.out.printf("Good job following directions. Your number was %d, which is in between %d and %d.", userIn, min, max);
//            return userIn;
//        }
//
//    }
//
//    //Factorial
//    public static void factorial() {
//        boolean more = false;
//        Scanner sc = new Scanner(System.in);
//        do{
//
//            System.out.println("\nEnter a number between 1 & 46.");
//            int userNum = sc.nextInt();
//            while (userNum < 1 || userNum > 46) {
//                System.out.println("Please enter a number between 1 & 10");
//                userNum = sc.nextInt();
//            }
//            String results = "";
//            long fact = 1;
//            for (int i = 1; i <= userNum; i++) {
//                if (i == 1) {
//
//                    System.out.println(i + "! " + " = " + i * fact);
//                    results = String.valueOf(fact * i);
//                    fact = fact * i;
//
//                } else {
//                    results = results + " * " + String.valueOf(i);
//                    System.out.println(i + "! " + " = " + results + " = " + i * fact);
//                    fact = fact * i;
//                }
//            }
//            System.out.println("Would you like to enter another number? (Yes / No)");
//            String userSelect = sc.next();
//            if (userSelect.equalsIgnoreCase("yes")) {
//                more = true;
//            }else{
//                System.out.println("Thanks for using my app");
//                break;
//            }
//        }while(more = true);
//    }

    public static void rollDice(){
        boolean dice = false;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose how many sides for your dice.");
            int sides = scanner.nextInt();
            for (int i = 0; i < 2; i++) {
                System.out.println((int) Math.floor(Math.random() * (sides) + 1));
            }
            System.out.println("Would you like to roll again?(Yes / No)");
            String userInput = scanner.next().toLowerCase(Locale.ROOT);
            if(userInput.equals("yes")){
                dice = true;
            }else{
                break;
            }
            }while(dice);
        }



    public static void main(String[] args) {

        //addition
        System.out.println(addition(9,10));
        //subtraction
        System.out.println(subtraction(78, 54));
        //multiplication
        System.out.println(mulitplication(77, 2));
        //division
        System.out.println(division(432, 62));
        //modulus
        System.out.println(modulus(88, 3));
        //multi2
        System.out.println(multi2(62, 7));
        //recursion
        System.out.println(recursionMult(5, 4));
        //recursion between
//        getInteger(1,10);
        //factorial
//        factorial();

        rollDice();

    }
}
