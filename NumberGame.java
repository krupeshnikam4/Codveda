
import java.util.Random;
import java.util.Scanner;

class NumberGame {

    public static void main(String[] args) {

        Scanner Startgame = new Scanner(System.in);
        String PlayAgain = "yes";

        // while loop is for check conditions here 
        while (PlayAgain.equals("yes")) {

            System.out.println();
            System.out.println("..Play a Number Game..");
            System.out.println();

            // use random variable for computer choice
            Random ranNo = new Random();
            int RanNum = ranNo.nextInt(100) + 1; // 1 to 100

            int guessNo = -1;
            int tries = 0;
            int maximumLimit = 6;

// also use while loop for check condition and compare guess No and Random No
            while (guessNo != RanNum && tries < maximumLimit) {

                System.out.println("Guess Num from 1-100");
                guessNo = Startgame.nextInt();
                tries++;

                // if statement  use to compare it 
                // when comparion in between guess no and Random Num
                if (guessNo == RanNum) {

                    System.out.println("Ohh, Fantastic! You Guess Correct Number: " + guessNo);
                    System.out.println("Guesses: " + tries);

                    System.out.print("Can you Play Again (yes/no): ");
                    PlayAgain = Startgame.next().toLowerCase();
                    System.out.println("=====---***---=====");
                    System.out.println("** Game Over **");
                    break;
                } // this if statement show you choose Greater no Or lower No
                else if (guessNo > RanNum) {
                    System.out.println("To High");
                } else {
                    System.out.println("To Low");
                }
            }

            // Attempts are over
            if (guessNo != RanNum) {
                System.out.println("================================");
                System.out.println("Your Attempts is Over");
                System.out.println("You do not Guess Random No");
                System.out.println("** Game is Over **");
                PlayAgain = "no";
            }
        }
// close is for showing the end of the Program  
        Startgame.close();
    }
}
