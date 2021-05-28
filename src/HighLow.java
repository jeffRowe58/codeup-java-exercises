import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void game(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);
        int counter = 1;
        System.out.println("Guess the random number. 0-100");
        int userGuess = sc.nextInt();
        do{
             userGuess = sc.nextInt();
            if(userGuess > int_random){
                System.out.println("High");
                counter++;
            }else if(userGuess < int_random){
                System.out.println("Low");
                counter++;
            }else if(userGuess == int_random){
                System.out.println("Good Guess. Want to play again?(y/n)");
                String newGame = sc.next().toLowerCase(Locale.ROOT);
                if(newGame == "y"){
                    game();
                }
            }else if(counter <= 10){
                System.out.println("You ran out of guesses. Better luck next time");
                String newGame = sc.next().toLowerCase(Locale.ROOT);
                if(newGame == "y"){
                    game();
                }
            }
            System.out.println("Guess again.");
            userGuess = sc.nextInt();
            System.out.println(counter);
        }while(counter < 11);
    }
    public static void main(String[] args) {
        game();
    }
}
