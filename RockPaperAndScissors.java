package GitHubRockPaperAndScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperAndScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;
            while (true) {
                System.out.println("Choose [r]ock, [p]aper or [s]cissors");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println("Invalid input. Try again...");
            }
            System.out.printf("The computer chose %s.%n", computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("This game was a draw.");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose.");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win.");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("You win.");
                } else if (computerMove.equals("s")) {
                    System.out.println("You lose.");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("You win.");
                } else if (computerMove.equals("r")) {
                    System.out.println("You lose.");
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();
            if(!playAgain.equals("y")){
                break;
            }
        }


    }
}


