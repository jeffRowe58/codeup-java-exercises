import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        for (int i = 5; i <= 15; i++) {
//            System.out.println("i= " + i);
//        }
//
//
//      for (int j = 2; j <= 100; j++ ){
//            if(j % 2 == 0){
//                System.out.println(j);
//            }
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
//int pin = 12345;
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
//        System.out.println("Incorrect, try again.");
//    }else {
//        System.out.println("Sorry, but you have now been locked out.");
//    }
//}
//        System.out.println("What number would you like to go up to?");
//        int userInp = scanner.nextInt();
//        System.out.println("You chose the number: \n" + userInp);
//        System.out.println("Here is your table! \nnumber | squared | cubed \n");
//        for(int y = 1; y <= userInp; y++){
//            System.out.printf("%d  | %d  | %d \n", y, y*y, y*y*y);
//        }
        String grad = "Your grade is: ";
        System.out.println("Please enter a grade (0-100)");
        int grade = scanner.nextInt();
        if(grade >= 99){
            System.out.println(grad + "A+");
        }else if(grade < 99 && grade >= 96){
            System.out.println(grad + "A");
        }else if(grade <= 95 && grade >= 90) {
            System.out.println(grad + "A-");
        }else if(grade <= 89 && grade >= 86){
            System.out.println(grad + "B+");
        }else if(grade <= 95 && grade >= 83){
            System.out.println(grad + "B");
        }else if(grade <= 82 && grade >= 80){
            System.out.println(grad + "B-");
        }else if(grade <= 79 && grade >= 76){
            System.out.println(grad + "C+");
    }else if(grade <= 75 && grade >= 73){
            System.out.println(grad + "C");
}else if(grade <= 72 && grade >= 71) {
            System.out.println(grad + "C-");
        }else if(grade == 70) {
            System.out.println(grad + "D");
        }else if(grade < 70) {
            System.out.println(grad + "F");

        }}}