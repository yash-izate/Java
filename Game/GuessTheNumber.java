/* Create a class game which allows the user to play "Guess the Number" game.
   Game should have the following methods.

   1. Constructors to generate random number.
   2. takeUserInput() to get input from user
   3. isCorrectNumber() to detect whether the number entered by the user is true
   4. getter and setter for noOfGuesses
   
 */

// import java.util.Random;
// import java.util.Scanner;

// class Game {

//     private int randomNum;
//     private int noOfGuesses;

//     // Constructor to generate random number
//     public Game() {
//         Random rand = new Random();
//         this.randomNum = rand.nextInt(100) + 1; // Generates a random number between 1 and 100
//         this.noOfGuesses = 0;
//     }

//     // Method to take user input
//     public int takeUserInput() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your guess: ");
//         int userInput = sc.nextInt();
//         this.noOfGuesses++;
//         return userInput;
//     }

//     // Method to check if the guess is correct
//     public boolean isCorrectNumber(int guess) {
//         if (guess == randomNum) {
//             return true;
//         }
//         return false;
//     }

//     // Method to provide feedback if guess is greater or smaller
//     public void provideFeedback(int guess) {
//         if (guess < randomNum) {
//             System.out.println("Guessed number is smaller than the random number.");
//         } else {
//             System.out.println("Guessed number is greater than the random number.");
//         }
//     }

//     // Getter for noOfGuesses
//     public int getNoOfGuesses() {
//         return noOfGuesses;
//     }

//     // Setter for noOfGuesses (optional based on need)
//     public void setNoOfGuesses(int noOfGuesses) {
//         this.noOfGuesses = noOfGuesses;
//     }
// }

// public class GuessNumber {
//     public static void main(String[] args) {
//         Game game = new Game();
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Welcome to Guess the Number game!");

//         int guess;
//         boolean isCorrect = false;

//         // Loop until the user guesses the correct number
//         do {
//             guess = game.takeUserInput();

//             if (game.isCorrectNumber(guess)) {
//                 isCorrect = true;
//             } else {
//                 game.provideFeedback(guess);
//             }
//         } while (!isCorrect);

//         // Game over, display results
//         System.out.println("Congratulations! You guessed the number in " + game.getNoOfGuesses() + " attempts.");
//     }
// }

package Game;


import java.util.Random;
import java.util.Scanner;

class Game {

    private int randomNum;
    private int noOfGuesses;

    // Constructor to generate random number
    public Game() {
        Random rand = new Random();
        this.randomNum = rand.nextInt(100) + 1; // Generates a random number between 1 and 100
        this.noOfGuesses = 0;
    }

    // Method to take user input
    public int takeUserInput() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userInput = sc.nextInt();
        this.noOfGuesses++;
        return userInput;
    }

    // Method to check if the guess is correct
    public boolean isCorrectNumber(int guess) {
        return guess == randomNum;
    }

    // Method to provide feedback if guess is greater or smaller
    public void provideFeedback(int guess) {
        if (guess < randomNum) {
            System.out.println("Guessed number is smaller than the random number.");
        } else {
            System.out.println("Guessed number is greater than the random number.");
        }
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses (optional based on need)
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("Welcome to Guess the Number game!");

        int guess;
        boolean isCorrect = false;

        // Loop until the user guesses the correct number
        while (!isCorrect) {
            guess = game.takeUserInput();

            if (game.isCorrectNumber(guess)) {
                isCorrect = true;
            } else {
                game.provideFeedback(guess);
            }
        }

        // Game over, display results
        System.out.println("Congratulations! You guessed the number in " + game.getNoOfGuesses() + " attempts.");
 
    }
}
