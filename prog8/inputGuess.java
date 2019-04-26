package prog8;
import java.util.*;

public class inputGuess {

        public static void main(String[] args) {

            int n;
            System.out.print("Lower limit is 1. Guess the Upper Limit: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            while (n != 50) {
                if (n > 50)
                    System.out.println("OOPS! go for a smaller number. ");
                else
                    System.out.println("OOPS! go for a larger number. ");
                n = sc.nextInt();
            }
            System.out.println("Finally! Congrats, You guessed it right.");
        }
    }
