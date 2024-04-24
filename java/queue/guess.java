package java.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        Queue<Integer> previousGuesses = new LinkedList<>();

        System.out.println("We are going to play a quick guessing gam \n");
        System.out.println("Guess a number between 1 and 100 \n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess the number");
            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            int guess = Integer.parseInt(input);

            if (guess < secretNumber) {
                System.out.println("Too low! Try again");
                previousGuesses.add(guess);
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again");
                previousGuesses.add(guess);
            } else {
                System.out.println("You got it! It was " + secretNumber);
                break;
            }
            System.out.println("Previous guess" + previousGuesses);
        }
        scanner.close();
    }
}