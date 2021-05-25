import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.format("%.2f\n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Give me a number.%n");
        int num = scanner.nextInt();

        System.out.printf("Your number is: %d%n", num);

        System.out.println("Give me three words.");
        System.out.println("First word.");
        String userInput1 = scanner.next();
        System.out.println("Second word.");
        String userInput2 = scanner.next();
        System.out.println("Last word.");
        String userInput3 = scanner.next();
        System.out.format("%s%n%s%n%s%n", userInput1, userInput2, userInput3);

        System.out.printf("Enter a sentence. %n");
        scanner.nextLine();
        String userChoice = scanner.nextLine();
        System.out.printf("Your sentence was: %s%n", userChoice);


        scanner.useDelimiter("\n");
        System.out.println("Give me the length of your classroom");
        float length = scanner.nextFloat();
        System.out.println("Give me the width of your classroom");
        float width = scanner.nextFloat();
        System.out.format("The area of class room is: %.2f%n", length*width);
        System.out.format("The perimeter of your class is: %.2f%n", (length*2)*(width*2));

    }
}
