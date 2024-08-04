package encryption;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class NumberGuessingGame {
    private static int randomNumber;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final Timer timer = new Timer();

    public static void main(String[] args) {
        // Generate the initial random number
        generateNewRandomNumber();

        // Set up a timer to generate a new random number every minute (60000
        // milliseconds)
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                generateNewRandomNumber();
                System.out.println("A new random number has been generated.");
            }
        }, 60000, 60000);

        boolean keepPlaying = true;

        // Main game loop
        while (keepPlaying) {
            System.out.println("Guess a number between 0 and 9:");
            int userGuess = scanner.nextInt();

            // Check if the user's guess is correct
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("You win 9 times your bet!");
            } else {
                System.out.println("Sorry, the correct number was " + randomNumber + ".");
                System.out.println("Better luck next time!");
            }

            // Generate a new random number after each guess
            generateNewRandomNumber();

            // Ask the user if they want to continue playing
            System.out.println("Do you want to play again? (yes/no)");
            String userResponse = scanner.next().toLowerCase();
            if (!userResponse.equals("yes")) {
                keepPlaying = false;
            }

        }

        // Clean up resources
        timer.cancel();
        scanner.close();
        System.out.println("Thanks for playing!");
    }

    // Method to generate a new random number
    private static void generateNewRandomNumber() {
        randomNumber = random.nextInt(10);
        System.out.println(randomNumber);
    }
}
