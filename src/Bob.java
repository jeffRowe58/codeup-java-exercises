import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userIn = "";
        while(!userIn.equalsIgnoreCase("n")){
            System.out.println("Chat Bob up");
            userIn = scanner.nextLine();
            if (userIn.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userIn.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if (userIn.endsWith("?")){
                System.out.println("Sure.");
            }else{
                System.out.println("Whatever");

                }
            }
        System.out.println("I'm out of here...");
}}
