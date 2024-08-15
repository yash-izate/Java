package Game;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String[] choice = { "Rock", "Paper", "Scissor" };
        System.out.println("Enter your choice : (Rock, Paper, Scissor)\n");
        String userChoice = sc.nextLine();

        int computerIndex = ran.nextInt(choice.length);
        String computerChoice = choice[computerIndex];

        System.out.println("Computer Choice : " + computerChoice);

        String result = "output" ;

        if (!userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase("Paper")
                && !userChoice.equalsIgnoreCase("Scissor")) {

            result = "Invalid Input";
        }

        else if (userChoice.equalsIgnoreCase(computerChoice)) {

            result = "It's a tie";

        } else if (userChoice.equalsIgnoreCase("Rock")) {

            if (computerChoice.equalsIgnoreCase("Scissor")) {

                result = "You Win !";
            } else {

                result = "You Lose !";
            }

        } else if (userChoice.equalsIgnoreCase("Scissor")) {

            if (computerChoice.equalsIgnoreCase("Paper")) {

                result = "You Win !";
            } else {

                result = "You Lose !";
            }

        } else if (userChoice.equalsIgnoreCase("Paper")) {

            if (computerChoice.equalsIgnoreCase("Rock")) {

                result = "You Win !";
            } else {

                result = "You Lose !";
            }
        }

        System.out.println(result);

        sc.close();
    }

}
