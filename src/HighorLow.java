import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(10) + 1;
        int guess = 0;

        while (true) {
            System.out.print("Guess a number between (1-10), 10 is inclusive: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10)
                    break;
                else System.out.println("Invalid input, your guess must be between 1 and 10.");
            }
            else {
                in.next();
                System.out.println("Invalid input, enter an integer between 1 and 10.");
            }
        }

        System.out.println("Random number generated was: " + number);

        if (guess > number)
            System.out.println("Too high!");
        else if (guess < number)
            System.out.println("Too low!");
        else
            System.out.println("On the money!");

    }
}
