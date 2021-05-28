import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int u = 5;
//        while(u <= 15){
//            if(u < 15){
//                System.out.print(u + " ");
//            }else{
//                System.out.println(u);
//            }
//            u++;
//        }
//

//      for (int j = 2; j <= 100; j++ ){
//            if(j % 2 == 0){
//                System.out.println(j);
//            }
//        }

//        long e = 2L;
//        do{
//            System.out.println(e);
//            e *= e;
//        }while (e < 1000000);

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//        for(long i = 2L; i < 1000000; i *= i){
//            System.out.println(i);
//        }
//
///*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
//program Starts:
//Please enter pin:
//22132
//Output:
//Incorrect, try again.
//Please enter pin:
//23412
//Output:
//Incorrect, try again.
//Please enter pin:
//12345
//Output:
//Correct, welcome back.
// */
//
//
//final int pin = 12345;
//int counter = 1;
        Scanner scanner = new Scanner(System.in);
//while(counter <= 3){
//
//    System.out.println("Please enter your pin");
//    int userIn = scanner.nextInt();
//    counter++;
//    if(userIn == pin){
//        System.out.println("Correct, welcome back");
//        break;
//    }else if(userIn != pin && counter <=3){
//        System.out.printf("Incorrect, try again. You have %d attempts left.%n", 3 - (counter - 1));
//    }else {
//        System.out.println("Sorry, but you have now been locked out.");
//    }
//        boolean userWantsToContinue = false;
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInp = scanner.nextInt();
//            System.out.println("You chose the number: " + userInp);
//            System.out.println("Here is your table! \nnumber | squared | cubed ");
//            System.out.println("---------- | ----------- | -------- ");
//            for (int y = 1; y <= userInp; y++) {
//                System.out.printf("%-10d  | %-11d  | %-8d \n", y, y * y, y * y * y);
//            }
//            System.out.println("Enter another number? y/n");
//            String userAnswer = scanner.next().toLowerCase(Locale.ROOT);
//            if (userAnswer.equals("y")) {
//                userWantsToContinue = true;
//            }else{
//                break;
//            }
//        }while(userWantsToContinue);

        boolean userChoice = false;
        do {
            String grad = "Your grade is: ";
            System.out.println("Please enter a grade (0-100)");
            int grade = scanner.nextInt();
            if (grade >= 99) {
                System.out.println(grad + "A+");
            } else if (grade < 99 && grade >= 96) {
                System.out.println(grad + "A");
            } else if (grade <= 95 && grade >= 90) {
                System.out.println(grad + "A-");
            } else if (grade <= 89 && grade >= 86) {
                System.out.println(grad + "B+");
            } else if (grade <= 95 && grade >= 83) {
                System.out.println(grad + "B");
            } else if (grade <= 82 && grade >= 80) {
                System.out.println(grad + "B-");
            } else if (grade <= 79 && grade >= 76) {
                System.out.println(grad + "C+");
            } else if (grade <= 75 && grade >= 73) {
                System.out.println(grad + "C");
            } else if (grade <= 72 && grade >= 71) {
                System.out.println(grad + "C-");
            } else if (grade == 70) {
                System.out.println(grad + "D");
            } else if (grade < 70) {
                System.out.println(grad + "F");
            }
            System.out.println("Enter another grade? y/n");
            String userAnswer = scanner.next().toLowerCase(Locale.ROOT);
            if (userAnswer.equals("y")) {
                userChoice = true;
            } else {
                break;
            }
        } while (userChoice);
    }}