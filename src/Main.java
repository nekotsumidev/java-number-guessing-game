import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int guess = 0;
        int attempts = 5;

        System.out.println("Welcome to number guessing game! Guess the number between 1 and 100!");

        Scanner sc = new Scanner(System.in);

        Random randomNumber = new Random();
        int secretNumber = randomNumber.nextInt(100) + 1;

        System.out.println(secretNumber);

        while (attempts != 0 && guess != secretNumber) {
            System.out.println("You have " + attempts + " attempts left. Enter your guess: ");
            guess = sc.nextInt();

            attempts--;

            if (guess == secretNumber) {
                System.out.println("You guessed the number!");
            } else if (guess > secretNumber) {
                System.out.println("Number too high!");
            } else {
                System.out.println("Number too low!");
            }
        }
        if (guess == secretNumber) {
            System.out.println("You Win!!! Attempts used: " + (5 - attempts));
        } else {
            System.out.println("You Lose! The number was " + secretNumber);
        }
    }
}