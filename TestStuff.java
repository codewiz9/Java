import java.util.Random;
import java.util.Scanner;

public class TestStuff {
   public static void main(String[] args) {
      
    // given code
    Scanner scnr = new Scanner(System.in);
      final int ROCK = 0;
      final int PAPER = 1;
      final int SCISSORS = 2;
      Random rand = new Random();
      int seed = scnr.nextInt();
      rand.setSeed(seed);
      
      // my inputs
      String firstPlayer = scnr.next();
      String secondPlayer = scnr.next();
      int rounds = scnr.nextInt();
      int firstPlayerChoice;
      int secondPlayerChoice;
      int firstPlayerWins = 0;
      int secondPlayerWins = 0;

      // gets rounds above zero
      while (rounds < 0) {
        System.out.println("Rounds must be > 0");
        rounds = scnr.nextInt();
      }
      
      // first announcement
      System.out.println(firstPlayer + " vs " + secondPlayer + " for " + rounds + " rounds");

      
      // main play loop
      int i = 0;
      while (i < rounds) {
        firstPlayerChoice = rand.nextInt(3);
        secondPlayerChoice = rand.nextInt(3);

        // check for tie
        if (firstPlayerChoice == secondPlayerChoice) {
            System.out.println("Tie");


        // check first player win condition
        } else if ((firstPlayerChoice == (secondPlayerChoice+1)) || ((firstPlayerChoice+2) == secondPlayerChoice)) {
          firstPlayerWins++;
          i++;
          
          // checks what first player wins with
          if (firstPlayerChoice == 0) {
            System.out.println(firstPlayer + " wins with rock");
          } else if (firstPlayerChoice == 1) {
            System.out.println(firstPlayer + " wins with paper");
          } else if (firstPlayerChoice == 2) {
            System.out.println(firstPlayer + " wins with scissors");
          }


        // check if second player wins
        } else if ((secondPlayerChoice == (firstPlayerChoice+1)) || ((secondPlayerChoice+2) == firstPlayerChoice)) {
            secondPlayerWins++;
            i++;

            // checks what second player wins with
            if (secondPlayerChoice == 0) {
              System.out.println(secondPlayer + " wins with rock");
            } else if (secondPlayerChoice == 1) {
              System.out.println(secondPlayer + " wins with paper");
            } else if (secondPlayerChoice == 2) {
              System.out.println(secondPlayer + " wins with scissors");
            }

        }
      }
      System.out.println(firstPlayer + " wins " + firstPlayerWins + " and " + secondPlayer + " wins " + secondPlayerWins);
   }
}