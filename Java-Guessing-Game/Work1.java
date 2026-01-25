import java.util.Random;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) + 1;
        
        int maxAttempts = 5;
        boolean isCorrect = false;

        System.out.println("I am thinking of a number between 1 and 20.");
        System.out.print("Can you guess what it is?       > ");

        for (int i = 1; i <= maxAttempts; i++) {
            int userGuess = scanner.nextInt();
           
            if (userGuess == secretNumber) {
                System.out.println("Congratulation! You did it.");
                isCorrect = true;
                break;
            }

            if (i == maxAttempts) {

                System.out.println("Sorry. The number was " + secretNumber + ".");
            } else {
                
                if (userGuess < secretNumber) {
                    System.out.print("Your guess is low. Try again?   > ");
                } else {
                    System.out.print("Your guess is high. Try again?  > ");
                }
            }
        }

        scanner.close();
    }
}
