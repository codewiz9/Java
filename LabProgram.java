import java.util.Random;
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int ROCK = 0;
      final int PAPER = 1;
      final int SCISSORS = 2;
      Random rand = new Random();
      int seed = scnr.nextInt();
      rand.setSeed(seed);
      
    scnr.nextLine();

      String name1 = scnr.nextLine();
      String name2 = scnr.nextLine();
      System.err.println(name1 + " VS " + name2);
    //   int rounds = scnr.nextInt();
    //   while (rounds < 0){
    //     if (rounds < 0){
    //         System.out.println("Rounds must be > 0");
    //         }
    //   }
    //   System.out.println(name1 + " VS " + name2 + " for " + rounds + " rounds ");
 
   }
}
