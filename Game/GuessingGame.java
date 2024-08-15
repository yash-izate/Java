package Game;

import java.util.Scanner;

class GuessingGame {

    int random;

    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.print("Welcome to the guessing game. ");
        System.out.println("Guess the number between 1-100 ! ");
        int guess;
        int result;
        do {

            System.out.print("Guess the number : ");
            guess = sc.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Congrats, your guess is correct");
            } else if (result < 0) {
                System.out.println("Please guess higher ! ");
                System.out.println();
            } else {
                System.out.println("Please guess lower ! ");
                System.out.println();
            }
        } while (result != 0);
        sc.close();

    }

}
