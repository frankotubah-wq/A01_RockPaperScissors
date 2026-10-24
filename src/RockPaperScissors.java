
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
        String playerA;

        System.out.println("Welcome to Rock Paper Scissors!");

        // Get a valid move from Player A
        do {
            System.out.print("Player A, enter R, P, or S: ");
            playerA = input.nextLine();

            if (!playerA.equalsIgnoreCase("R") &&
                    !playerA.equalsIgnoreCase("P") &&
                    !playerA.equalsIgnoreCase("S")) {
                System.out.println("Invalid move. Please try again.");
            }

        } while (!playerA.equalsIgnoreCase("R") &&
                !playerA.equalsIgnoreCase("P") &&
                !playerA.equalsIgnoreCase("S"));

        System.out.println("Player A selected: " + playerA.toUpperCase());
        // Get a valid move from Player B
        String playerB;

        do {
            System.out.print("Player B, enter R, P, or S: ");
            playerB = input.nextLine();

            if (!playerB.equalsIgnoreCase("R") &&
                    !playerB.equalsIgnoreCase("P") &&
                    !playerB.equalsIgnoreCase("S")) {
                System.out.println("Invalid move. Please try again.");
            }

        } while (!playerB.equalsIgnoreCase("R") &&
                !playerB.equalsIgnoreCase("P") &&
                !playerB.equalsIgnoreCase("S"));

        System.out.println("Player B selected: " + playerB.toUpperCase());
        // Determine the winner
        playerA = playerA.toUpperCase();
        playerB = playerB.toUpperCase();

        if (playerA.equals(playerB)) {
            System.out.println("It's a tie!");
        } else if (
                (playerA.equals("R") && playerB.equals("S")) ||
                        (playerA.equals("P") && playerB.equals("R")) ||
                        (playerA.equals("S") && playerB.equals("P"))
        ) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }

            // Ask if the players want to play again
            do {
                System.out.print("Would you like to play again? (Y/N): ");
                playAgain = input.nextLine();

                if (!playAgain.equalsIgnoreCase("Y") &&
                        !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Invalid choice. Please enter Y or N.");
                }

            } while (!playAgain.equalsIgnoreCase("Y") &&
                    !playAgain.equalsIgnoreCase("N"));

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");

        input.close();
    }
}
