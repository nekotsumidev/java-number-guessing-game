import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        welcomeMessage();
        guessEngine();

    }
    public static void welcomeMessage() {
        System.out.println("Welcome to number guessing game! Guess the number between 1 and 100!");
    }
    public static void guessEngine() {

        int secretNumber = genRandomNumber();
        Scanner sc = new Scanner(System.in);

        int guess = 0;
        int attempts = 10;

        while (attempts != 0 && guess != secretNumber) {
            System.out.println("You have " + attempts + " attempts left. Enter your guess: ");
            guess = sc.nextInt();

            attempts--;

            if (guess == secretNumber) {
                System.out.println("You Win!!! Attempts used: " + (10 - attempts));
            } else if (guess > secretNumber) {
                System.out.println("Number too high!");
            } else {
                System.out.println("Number too low!");
            }
        }
        if (guess != secretNumber) {
            System.out.println("You Lose! The number was " + secretNumber);
        }
    }

    public static int genRandomNumber() {
        int randomLimit = 100;

        Random randomNumber = new Random();
        return randomNumber.nextInt(randomLimit) +1;
    }
}